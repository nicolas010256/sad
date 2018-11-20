package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import dao.exceptions.AreaAtuacaoDAOException;
import entity.AreaAtuacao;

public class AreaAtuacaoDAOImpl implements AreaAtuacaoDAO {

    @Override
    public void add(AreaAtuacao areaAtuacao) throws AreaAtuacaoDAOException {

        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "INSERT INTO AreaAtuacao (idOrientador,idArea) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            if (areaAtuacao.getOrientador() != null){
                st.setLong(1, areaAtuacao.getOrientador().getId());
            } else {
                st.setNull(1, Types.INTEGER);
            }

            if (areaAtuacao.getArea() != null){
                st.setLong(2, areaAtuacao.getArea().getId());
            } else {
                st.setNull(2, Types.INTEGER);
            }

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new AreaAtuacaoDAOException("Erro ao inserir area de atuação");
		} finally {
            JDBCUtil.close(con);
        }
    }

    @Override
	public void remove(AreaAtuacao areaAtuacao) throws AreaAtuacaoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM AreaAtuacao WHERE idOrientador = ? AND idArea = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, areaAtuacao.getOrientador().getId());
            st.setLong(2, areaAtuacao.getArea().getId());
            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new AreaAtuacaoDAOException("Erro ao excluir area de atuação");
        } finally {
            JDBCUtil.close(con);
        }
	}
    
}