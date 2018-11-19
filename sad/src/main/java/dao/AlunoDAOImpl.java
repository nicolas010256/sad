package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import dao.exceptions.AlunoDAOException;
import entity.Aluno;
import entity.Trabalho;

public class AlunoDAOImpl implements AlunoDAO {

    @Override
    public void add(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Aluno (Nome, Email, Senha, Foto, NotaTG1, NotaTG2, idCurso, idTrabalho) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getEmail());
            statement.setString(3, aluno.getSenha());
            statement.setBlob(4, aluno.getFoto() != null ? new SerialBlob(aluno.getFoto()) : null);
            statement.setFloat(5, aluno.getNotaTG1());
            statement.setFloat(6, aluno.getNotaTG2());
            if (aluno.getCurso() != null) 
                statement.setLong(7, aluno.getCurso().getId());
            else
                statement.setNull(7, Types.INTEGER);
            if (aluno.getTrabalho() != null)
                statement.setLong(8, aluno.getTrabalho().getId());
            else
                statement.setNull(8, Types.INTEGER);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao inserir aluno");
        } finally {
            JDBCUtil.close(con);
        }   
    }

    @Override
    public Aluno get(long id) throws AlunoDAOException {
        Aluno aluno = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Email, Senha, Nome, NotaTG1, NotaTG2 FROM Aluno WHERE idAluno = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                String nome = rs.getString("Nome");
                float notaTG1 = rs.getFloat("NotaTG1");
                float notaTG2 = rs.getFloat("NotaTG2");

                aluno = new Aluno(id, email, senha, nome);
                aluno.setNotaTG1(notaTG1);
                aluno.setNotaTG2(notaTG2);
            }
            st.close();
        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao pesquisar aluno");
        } finally {
            JDBCUtil.close(con);
        }
        return aluno;
    }

    @Override
    public Aluno getByEmailAndSenha(String email, String senha) throws AlunoDAOException {
        Aluno aluno = null;
        Connection con = null;

        try {
            con  = JDBCUtil.getConnection();

            String sql = "SELECT idAluno, Nome, NotaTG1, NotaTG2 FROM Aluno WHERE Email like ? and Senha like ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, senha);

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                long id = rs.getLong("idAluno");
                String nome = rs.getString("Nome");
                float notaTG1 = rs.getFloat("NotaTG1");
                float notaTG2 = rs.getFloat("NotaTG2");

                aluno = new Aluno(id, email, senha, nome);
                aluno.setNotaTG1(notaTG1);
                aluno.setNotaTG2(notaTG2);

            }
            st.close();
        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao pesquisar aluno");
        } finally {
            JDBCUtil.close(con);
        }
        return aluno;
    }

    @Override
    public List<Aluno> getByTrabalho(Trabalho trabalho) throws AlunoDAOException {
        List<Aluno> alunos = new ArrayList<Aluno>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idAluno, Email, Senha, Nome, NotaTG1, NotaTG2 FROM Aluno WHERE idTrabalho = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, trabalho.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idAluno");
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                String nome = rs.getString("Nome");
                float notaTG1 = rs.getFloat("NotaTG1");
                float notaTG2 = rs.getFloat("NotaTG2");

                Aluno aluno = new Aluno(id, email, senha, nome);
                aluno.setNotaTG1(notaTG1);
                aluno.setNotaTG2(notaTG2);
                alunos.add(aluno);
            }
            st.close();

        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao pesquisar alunos");
        } finally {
            JDBCUtil.close(con);
        }
        return alunos;
    }

    @Override
    public List<Aluno> getAll() throws AlunoDAOException {
        List<Aluno> alunos = new ArrayList<Aluno>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idAluno, Email, Senha, Nome, NotaTG1, NotaTG2 FROM Aluno";

            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idAluno");
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                String nome = rs.getString("Nome");
                float notaTG1 = rs.getFloat("NotaTG1");
                float notaTG2 = rs.getFloat("NotaTG2");

                Aluno aluno = new Aluno(id, email, senha, nome);
                aluno.setNotaTG1(notaTG1);
                aluno.setNotaTG2(notaTG2);
                alunos.add(aluno);
            }
            st.close();

        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao pesquisar alunos");
        } finally {
            JDBCUtil.close(con);
        }
        return alunos;
    }

    @Override
    public void getFoto(Aluno aluno) throws AlunoDAOException {

    }

    @Override
    public void update(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Aluno " +
                            "WHERE Email=?, Senha=?, Nome=?, NotaTG1=?, NotaTG2=? " +
                            "WHERE idAluno=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, aluno.getEmail());
            st.setString(2, aluno.getSenha());
            st.setString(3, aluno.getNome());
            st.setFloat(4, aluno.getNotaTG1());
            st.setFloat(5, aluno.getNotaTG2());
            st.setLong(6, aluno.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao alterar atributos do aluno");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void remove(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Aluno WHERE idAluno=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new AlunoDAOException("Erro ao excluir aluno");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateFoto(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "UPDATE Aluno SET Foto=? WHERE idAluno=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setBlob(1, aluno.getFoto() != null ? new SerialBlob(aluno.getFoto()) : null);
            st.setLong(2, aluno.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao alterar foto do aluno");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateCurso(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "UPDATE Aluno SET idCurso=? WHERER idAluno=?";

            PreparedStatement st = con.prepareStatement(sql);
            if (aluno.getCurso() != null)
                st.setLong(1, aluno.getCurso().getId());
            else
                st.setNull(1, Types.INTEGER);
            st.setLong(2, aluno.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao alterar curso do aluno");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateTrabalho(Aluno aluno) throws AlunoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "UPDATE Aluno SET idTrabalho=? WHERE idAluno=?";

            PreparedStatement st = con.prepareStatement(sql);
            if (aluno.getCurso() != null)
                st.setLong(1, aluno.getCurso().getId());
            else
                st.setNull(1, Types.INTEGER);
            st.setLong(1, aluno.getId());

            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw new AlunoDAOException("Erro ao alterar o trabalho do aluno");
        } finally {
            JDBCUtil.close(con);
        }
    }   
}