package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;
import dao.exceptions.OrientadorDAOException;
import entity.Area;
import entity.Orientador;
import entity.Trabalho;

public class OrientadorDAOImpl implements OrientadorDAO {

    @Override
    public void add(Orientador orientador) throws OrientadorDAOException {

        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Orientador (Nome, Email, Senha) " +
                    "VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, orientador.getNome());
            statement.setString(2, orientador.getEmail());
            statement.setString(3, orientador.getSenha());
            statement.setBlob(4, orientador.getFoto() != null ? new SerialBlob(orientador.getFoto()) : null);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao inserir orientador");
        } finally {
            JDBCUtil.close(con);
        }   
    }

    @Override
    public Orientador get(long id) throws OrientadorDAOException {
        
        Orientador orientador = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Nome, Email, Senha FROM Orientador WHERE idOrientador = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String nome = rs.getString("Nome");
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                
                orientador = new Orientador(id, email, senha, nome);
            }
            st.close();
        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao pesquisar orientador");
        } finally {
            JDBCUtil.close(con);
        }
        return orientador;
    }

    @Override
    public Orientador getByEmailAndSenha(String email, String senha) throws OrientadorDAOException {
        Orientador orientador = null;
        Connection con = null;

        try {
            con  = JDBCUtil.getConnection();

            String sql = "SELECT idOrientador, Nome, FROM Aluno WHERE Email like ? and Senha like ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, senha);

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                long id = rs.getLong("idOrientador");
                String nome = rs.getString("Nome");

                orientador = new Orientador(id, email, senha, nome);

            }
            st.close();
        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao pesquisar orientador");
        } finally {
            JDBCUtil.close(con);
        }
        return orientador;
    }

    @Override
    public Orientador getByTrabalho(Trabalho trabalho) throws OrientadorDAOException {
        Orientador orientador = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT o.idOrientador, Nome, Email, Senha FROM Orientador o INNER JOIN Trabalho t ON (o.idOrientador = t.idOrientador) WHERE idTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, trabalho.getId());
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                long id = rs.getLong("idOrientador");
                String nome = rs.getString("Nome");
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                
                orientador = new Orientador(id, email, senha, nome);
            }
            st.close();
        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao pesquisar orientador");
        } finally {
            JDBCUtil.close(con);
        }
        return orientador;
    }

    @Override
    public List<Orientador> getByArea(Area area) throws OrientadorDAOException {
        List<Orientador> orientadores = new ArrayList<Orientador>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT o.idOrientador, Nome, Email, Senha FROM Orientador o INNER JOIN AreaAtuacao a ON (o.idOrientador = a.idOrientador) WHERE idArea = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, area.getId());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("idOrientador");
                String nome = rs.getString("Nome");
                String email = rs.getString("Email");
                String senha = rs.getString("Senha");
                
                Orientador orientador = new Orientador(id, email, senha, nome);
                orientadores.add(orientador);
            }
            st.close();
        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao pesquisar orientador");
        } finally {
            JDBCUtil.close(con);
        }
        return orientadores;
    }

    @Override
    public void getFoto(Orientador orientador) throws OrientadorDAOException {

        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT Foto FROM Orientador WHERE idOrientador = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, orientador.getId());

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                Blob blob = rs.getBlob("Foto");
                byte[] foto = blob.getBytes(1, (int) blob.length());
                orientador.setFoto(foto);
                blob.free();
            } else {
                orientador.setFoto(null);
            }

        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao recuperar foto do orientador");
        } finally {
            JDBCUtil.close(con);
        }

    }

    @Override
    public void update(Orientador orientador) throws OrientadorDAOException {

        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Orientador " +
                            "SET Nome=?, Email=?, Senha=? " +
                            "WHERE idOrientador=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, orientador.getNome());
            st.setString(2, orientador.getEmail());
            st.setString(3, orientador.getSenha());
            st.setLong(4, orientador.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao alterar atributos do orientador");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void updateFoto(Orientador orientador) throws OrientadorDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "UPDATE Orientador SET Foto = ? WHERE idOrientador = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setBlob(1, orientador.getFoto() != null ? new SerialBlob(orientador.getFoto()) : null);
            st.setLong(2, orientador.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new OrientadorDAOException("Erro ao alterar foto do orientador");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Orientador orientador) throws OrientadorDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Orientador WHERE idOrientador=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, orientador.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new OrientadorDAOException("Erro ao excluir orientador");
        } finally {
            JDBCUtil.close(con);
        }
	}

}