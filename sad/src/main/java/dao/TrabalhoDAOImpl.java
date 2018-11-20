package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import dao.exceptions.TrabalhoDAOException;
import entity.Aluno;
import entity.Orientador;
import entity.Trabalho;

public class TrabalhoDAOImpl implements TrabalhoDAO {

    @Override
    public void add(Trabalho trabalho) throws TrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Trabalho (idTrabalho,Tema,Titulo,Metodologia,Relevancia,Arquivo,Data_Criacao,idBanca,idTipoTrabalho,idOrientador) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, trabalho.getId());
            st.setString(2, trabalho.getTema());
            st.setString(3, trabalho.getTitulo());
            st.setString(4, trabalho.getMetodologia());
            st.setString(5, trabalho.getRelevancia());
            st.setBlob(6, trabalho.getArquivo() != null ? new SerialBlob(trabalho.getArquivo()) : null);
            java.util.Date data = trabalho.getData_criacao();
            java.sql.Date datasql = new java.sql.Date(data.getTime());
            st.setDate(7,datasql);
            if (trabalho.getBanca() != null){
                st.setLong(8, trabalho.getBanca().getId());
            } else {
                st.setNull(8, Types.INTEGER);
            }
            if (trabalho.getTipoTrabalho() != null){
                st.setLong(9, trabalho.getTipoTrabalho().getId());
            } else {
                st.setNull(9, Types.INTEGER);
            }
            if (trabalho.getOrientador() != null){
                st.setLong(10, trabalho.getOrientador().getId());
            } else {
                st.setNull(10, Types.INTEGER);
            }

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao inserir trabalho");
		} finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public Trabalho get(long id) throws TrabalhoDAOException {
        Trabalho trabalho = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT idTrabalho,Tema,Titulo,Metodologia,Relevancia,Data_Criacao FROM Trabalho WHERE idTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                
                String tema = rs.getString("Tema");
                String titulo = rs.getString("Titulo");
                String metodologia = rs.getString("Metodologia");
                String relevancia = rs.getString("Relevancia");
                Date data_criacao = rs.getDate("Data_Criacao");

                trabalho = new Trabalho(id, tema, titulo, metodologia, relevancia, data_criacao);
            }
            st.close();
        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao pesquisar trabalho");
        } finally {
            JDBCUtil.close(con);
        }
        return trabalho;
    }

    @Override
    public List<Trabalho> getAll() throws TrabalhoDAOException {
        List<Trabalho> trabalhos = new ArrayList<Trabalho>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idTrabalho,Tema,Titulo,Metodologia,Relevancia,Data_Criacao FROM Trabalho";

            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idTrabalho");
                String tema = rs.getString("Tema");
                String titulo = rs.getString("Titulo");
                String metodologia = rs.getString("Metodologia");
                String relevancia = rs.getString("Relevancia");
                Date data_criacao = rs.getDate("Data_Criacao");

                Trabalho trabalho = new Trabalho(id, tema, titulo, metodologia, relevancia, data_criacao);
                trabalhos.add(trabalho);
            }
            st.close();

        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao pesquisar trabalhos");
        } finally {
            JDBCUtil.close(con);
        }
        return trabalhos;
    }

    @Override
    public Trabalho getByAluno(Aluno aluno) throws TrabalhoDAOException {
        Trabalho trabalho = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT idTrabalho,Tema,Titulo,Metodologia,Relevancia,Data_Criacao FROM Trabalho t INNER JOIN Aluno a ON (t.idTrabalho = a.idTrabalho) WHERE idAluno = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, aluno.getId());
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                
                long id = rs.getLong("idTrabalho");
                String tema = rs.getString("Tema");
                String titulo = rs.getString("Titulo");
                String metodologia = rs.getString("Metodologia");
                String relevancia = rs.getString("Relevancia");
                Date data_criacao = rs.getDate("Data_Criacao");

                trabalho = new Trabalho(id, tema, titulo, metodologia, relevancia, data_criacao);
            }
            st.close();
        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao pesquisar trabalho");
        } finally {
            JDBCUtil.close(con);
        }
        return trabalho;
    }

    @Override
    public List<Trabalho> getByOrientador(Orientador orientador) throws TrabalhoDAOException {
        List<Trabalho> trabalhos = new ArrayList<Trabalho>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT idTrabalho,Tema,Titulo,Metodologia,Relevancia,Data_Criacao FROM Trabalho t INNER JOIN Orientador o ON (t.idOrientador = o.idOrientador) WHERE idOrientador = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, orientador.getId());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                long id = rs.getLong("idTrabalho");
                String tema = rs.getString("Tema");
                String titulo = rs.getString("Titulo");
                String metodologia = rs.getString("Metodologia");
                String relevancia = rs.getString("Relevancia");
                Date data_criacao = rs.getDate("Data_Criacao");

                Trabalho trabalho = new Trabalho(id, tema, titulo, metodologia, relevancia, data_criacao);
                trabalhos.add(trabalho);
            }
            st.close();
        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao pesquisar trabalho");
        } finally {
            JDBCUtil.close(con);
        }
        return trabalhos;
    }

    @Override
    public void update(Trabalho trabalho) throws TrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Trabalho " +
                            "SET Tema = ?,Titulo = ? ,Metodologia = ?,Relevancia = ?,Data_Criacao = ? " +
                            "WHERE idTrabalho = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setString(1, trabalho.getTema());
            st.setString(2, trabalho.getTitulo());
            st.setString(3, trabalho.getMetodologia());
            st.setString(4, trabalho.getRelevancia());
            java.util.Date data = trabalho.getData_criacao();
            java.sql.Date datasql = new java.sql.Date(data.getTime());
            st.setDate(5, datasql);
            st.setLong(6, trabalho.getId());
            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao alterar atributos do trabalho");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateOrientador(Trabalho trabalho) throws TrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "UPDATE Trabalho SET idOrientador = ? WHERE idTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            if (trabalho.getOrientador() != null){
                st.setLong(1, trabalho.getOrientador().getId());
            } else {
                st.setNull(1, Types.INTEGER);
            }

            st.setLong(2,trabalho.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao alterar orientador do trabalho");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateTipoTrabalho(Trabalho trabalho) throws TrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "UPDATE Trabalho SET idTipoTrabalho = ? WHERE idTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            if (trabalho.getTipoTrabalho() != null){
                st.setLong(1, trabalho.getTipoTrabalho().getId());
            } else {
                st.setNull(1, Types.INTEGER);
            }

            st.setLong(2,trabalho.getId());

            st.executeUpdate();

            st.close();
            
        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao alterar tipo do trabalho");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateBanca(Trabalho trabalho) throws TrabalhoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "UPDATE Trabalho SET idBanca = ? WHERE idTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            if (trabalho.getBanca() != null){
                st.setLong(1, trabalho.getBanca().getId());
            } else {
                st.setNull(1, Types.INTEGER);
            }

            st.setLong(2,trabalho.getId());

            st.executeUpdate();

            st.close();
            
        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao alterar banca do trabalho");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Trabalho trabalho) throws TrabalhoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Trabalho WHERE idTrabalho = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, trabalho.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new TrabalhoDAOException("Erro ao excluir trabalho");
        } finally {
            JDBCUtil.close(con);
        }
	}

    @Override
    public void getArquivo(Trabalho trabalho) throws TrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT Arquivo FROM Trabalho WHERE idTrabalho = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, trabalho.getId());

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                Blob blob = rs.getBlob("Arquivo");
                byte[] arquivo = blob.getBytes(1, (int) blob.length());
                trabalho.setArquivo(arquivo);
                blob.free();
            } else {
                trabalho.setArquivo(null);
            }

        } catch (SQLException e) {
            throw new TrabalhoDAOException("Erro ao recuperar arquivo do trabalho");
        } finally {
            JDBCUtil.close(con);
        }
    }

}