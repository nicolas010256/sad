package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.CursoDAOException;
import entity.Aluno;
import entity.Curso;

public class CursoDAOImpl implements CursoDAO {

    @Override
    public void add(Curso curso) throws CursoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "INSERT INTO Curso (Nome) VALUES (?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, curso.getNome());
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new CursoDAOException("Erro ao inserir curso");		
        } finally {
            JDBCUtil.close(con);
        }

    }

    @Override
    public Curso get(long id) throws CursoDAOException {
        Curso curso = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Nome FROM Curso WHERE idCurso = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            if(rs.first()){
                String nome = rs.getString("Nome");

                curso = new Curso(id, nome);
            }

            st.close();
        } catch (SQLException e) {
            throw new CursoDAOException("Erro ao buscar curso");
        } finally {
            JDBCUtil.close(con);
        }
        return curso;
    }

    @Override
    public List<Curso> getAll() throws CursoDAOException {
        List<Curso> cursos = new ArrayList<Curso>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT idCurso, Nome FROM Curso";
            
            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();

            while(rs.next()){
                long id = rs.getLong("idCurso");
                String nome = rs.getString("Nome");

                Curso curso = new Curso(id, nome);
                cursos.add(curso);
            }

        } catch (SQLException e) {
            throw new CursoDAOException("Erro ao buscar cursos");
        } finally {
            JDBCUtil.close(con);
        }
        return cursos;
    }

    @Override
    public Curso getByAluno(Aluno aluno) throws CursoDAOException {
        Curso curso = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT c.idCurso, c.Nome FROM Curso c INNER JOIN Aluno a ON c.idCurso = a.idCurso WHERE idAluno = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, aluno.getId());

            ResultSet rs = st.executeQuery();

            if(rs.first()){
                long id = rs.getLong("c.idCurso");
                String nome = rs.getString("c.Nome");

                curso = new Curso(id, nome);
            }

            st.close();
        } catch (SQLException e) {
            throw new CursoDAOException("Erro ao buscar curso do aluno");
        } finally {
            JDBCUtil.close(con);
        }
        return curso;
    }

    @Override
    public void update(Curso curso) throws CursoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Curso " +
                            "SET Nome=?" +
                            "WHERE idCurso=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, curso.getNome());
            st.setLong(2, curso.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new CursoDAOException("Erro ao alterar atributos do curso");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Curso curso) throws CursoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Curso WHERE idCurso = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, curso.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new CursoDAOException("Erro ao excluir curso");
        } finally {
            JDBCUtil.close(con);
        }
	}

}