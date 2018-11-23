package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.AreaDAOException;
import entity.Area;
import entity.Orientador;

public class AreaDAOImpl implements AreaDAO {

    @Override
    public void add(Area area) throws AreaDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Area (Nome,Descricao) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, area.getNome());
            st.setString(2, area.getDescricao());
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new AreaDAOException("Erro ao inserir area");
        } finally {
            JDBCUtil.close(con);
        }  
    }

    @Override
    public Area get(long id) throws AreaDAOException {
        Area area = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Nome, Descricao FROM Area WHERE idArea = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String nome = rs.getString("Nome");
                String descricao = rs.getString("Descricao");
                area = new Area(id, nome, descricao);
            }
            st.close();
        } catch (SQLException e) {
            throw new AreaDAOException("Erro ao pesquisar area");
        } finally {
            JDBCUtil.close(con);
        }
        return area;
    }

    @Override
    public List<Area> getByOrientador(Orientador orientador) throws AreaDAOException {
        List<Area> areas = new ArrayList<Area>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT a.idArea, a.Nome, a.Descricao FROM Area a INNER JOIN AreaAtuacao o ON (a.idArea = o.idArea) WHERE idOrientador = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, orientador.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("a.idArea");
                String nome = rs.getString("a.Nome");
                String descricao = rs.getString("a.Descricao");
                Area area = new Area(id, nome, descricao);
                areas.add(area);
            }
            st.close();

        } catch (SQLException e) {
            throw new AreaDAOException("Erro ao pesquisar areas");
        } finally {
            JDBCUtil.close(con);
        }
        return areas;
    }

    @Override
    public void update(Area area) throws AreaDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Area " +
                            "SET Nome=?, Descricao=? " +
                            "WHERE idArea=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, area.getNome());
            st.setString(2, area.getDescricao());
            st.setLong(3, area.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AreaDAOException("Erro ao alterar atributos da area");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Area area) throws AreaDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Area WHERE idArea = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, area.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new AreaDAOException("Erro ao excluir area");
        } finally {
            JDBCUtil.close(con);
        }
	}

}