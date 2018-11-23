package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.TipoTrabalhoDAOException;
import entity.TipoTrabalho;
import entity.Trabalho;

public class TipoTrabalhoDAOImpl implements TipoTrabalhoDAO {

    @Override
    public void add(TipoTrabalho tipoTrabalho) throws dao.exceptions.TipoTrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO TipoTrabalho (Nome, Descricao) " +
                    "VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, tipoTrabalho.getNome());
            statement.setString(2, tipoTrabalho.getDescricao());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new TipoTrabalhoDAOException("Erro ao inserir tipo de trabalho");
        } finally {
            JDBCUtil.close(con);
        }   
    }

    @Override
    public TipoTrabalho get(long id) throws dao.exceptions.TipoTrabalhoDAOException {
        TipoTrabalho tipoTrabalho = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Nome, Descricao FROM TipoTrabalho WHERE idTipoTrabalho = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String nome = rs.getString("Nome");
                String descricao = rs.getString("Descricao");

                tipoTrabalho = new TipoTrabalho(id, nome, descricao);
            }
            st.close();
        } catch (SQLException e) {
            throw new TipoTrabalhoDAOException("Erro ao pesquisar tipo de trabalho");
        } finally {
            JDBCUtil.close(con);
        }
        return tipoTrabalho;
    }

    @Override
    public List<TipoTrabalho> getAll() throws dao.exceptions.TipoTrabalhoDAOException {
        List<TipoTrabalho> tipoTrabalhos = new ArrayList<TipoTrabalho>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idTipoTrabalho,Nome,Descricao FROM TipoTrabalho";

            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idTipoTrabalho");
                String nome = rs.getString("Nome");
                String descricao = rs.getString("Descricao");

                TipoTrabalho tipoTrabalho = new TipoTrabalho(id, nome, descricao);
                tipoTrabalhos.add(tipoTrabalho);
            }
            st.close();

        } catch (SQLException e) {
            throw new TipoTrabalhoDAOException("Erro ao pesquisar tipos de trabalho");
        } finally {
            JDBCUtil.close(con);
        }
        return tipoTrabalhos;
    }

    @Override
    public TipoTrabalho getByTrabalho(Trabalho trabalho) throws dao.exceptions.TipoTrabalhoDAOException {
        TipoTrabalho tipoTrabalho = null;
		Connection con = null;
		
		try {
			con = JDBCUtil.getConnection();
			String sql = "SELECT tt.idTipoTrabalho, Nome, Descricao FROM TipoTrabalho tt INNER JOIN Trabalho t ON (tt.idTipoTrabalho = t.idTipoTrabalho) WHERE idTrabalho = ?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1,trabalho.getId());
			ResultSet rs = statement.executeQuery();
			if(rs.first()){
				long idTipoTrabalho = rs.getLong("idTipoTrabalho");
				String nome = rs.getString("Nome");
				String descricao = rs.getString("Descricao");
				
				tipoTrabalho = new TipoTrabalho(idTipoTrabalho,nome,descricao);
			}
		} catch (SQLException e) {
			throw new TipoTrabalhoDAOException("Erro ao buscar tipo trabalho");
		} finally {
			JDBCUtil.close(con);
		}
		
		return tipoTrabalho;
    }

    @Override
    public void update(TipoTrabalho tipoTrabalho) throws dao.exceptions.TipoTrabalhoDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE TipoTrabalho " +
                            "SET Nome=?, Descricao=? " +
                            "WHERE idTipoTrabalho=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tipoTrabalho.getNome());
            st.setString(2, tipoTrabalho.getDescricao());
            st.setLong(3, tipoTrabalho.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new TipoTrabalhoDAOException("Erro ao alterar atributos do tipo de trabalho");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public void remove(TipoTrabalho tipoTrabalho) throws dao.exceptions.TipoTrabalhoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM TipoTrabalho WHERE idTipoTrabalho=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, tipoTrabalho.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new TipoTrabalhoDAOException("Erro ao excluir tipo de trabalho");
        } finally {
            JDBCUtil.close(con);
        }
	}

}