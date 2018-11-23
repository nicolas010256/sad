package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.ReferenciaDAOException;
import entity.Referencia;
import entity.Trabalho;

public class ReferenciaDAOImpl implements ReferenciaDAO {

    @Override
    public void add(Referencia referencia) throws ReferenciaDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Referencia (Referencia, Tipo, idTrabalho) " +
                    "VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, referencia.getReferencia());
            statement.setString(2, referencia.getTipo());
            if (referencia.getTrabalho() != null) 
                statement.setLong(7, referencia.getTrabalho().getId());
            else
                statement.setNull(7, Types.INTEGER);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new ReferenciaDAOException("Erro ao inserir referencia");
        } finally {
            JDBCUtil.close(con);
        }   
    }

    @Override
    public Referencia get(long id) throws ReferenciaDAOException {
        Referencia referencia = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Referencia, Tipo FROM Referencia WHERE idReferencia = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String ref = rs.getString("Referencia");
                String tipo = rs.getString("Tipo");
                referencia = new Referencia(id, ref, tipo);
            }
            st.close();
        } catch (SQLException e) {
            throw new ReferenciaDAOException("Erro ao pesquisar referencia");
        } finally {
            JDBCUtil.close(con);
        }
        return referencia;
    }

    @Override
    public List<Referencia> getByTrabalho(Trabalho trabalho) throws ReferenciaDAOException {
        List<Referencia> referencias = new ArrayList<Referencia>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idReferencia, Referencia, Tipo FROM Referencia WHERE idTrabalho = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, trabalho.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idAluno");
                String ref = rs.getString("Referencia");
                String tipo = rs.getString("Tipo");
                Referencia referencia = new Referencia(id, ref, tipo);
                referencias.add(referencia);
            }
            st.close();

        } catch (SQLException e) {
            throw new ReferenciaDAOException("Erro ao pesquisar referencias");
        } finally {
            JDBCUtil.close(con);
        }
        return referencias;
    }

    @Override
    public void update(Referencia referencia) throws ReferenciaDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Referencia " +
                            "SET Referencia=?, Tipo=? " +
                            "WHERE idReferencia = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, referencia.getReferencia());
            st.setString(2, referencia.getTipo());
            st.setLong(3, referencia.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new ReferenciaDAOException("Erro ao alterar atributos da referencia");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Referencia referencia) throws ReferenciaDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Referencia WHERE idReferencia=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, referencia.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new ReferenciaDAOException("Erro ao excluir referencia");
        } finally {
            JDBCUtil.close(con);
        }
	}

}