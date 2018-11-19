package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import dao.exceptions.BancaDAOException;
import entity.Banca;
import entity.Trabalho;

public class BancaDAOImpl implements BancaDAO{

	@Override
	public void add(Banca banca) throws BancaDAOException {
		Connection con = null;
		
		try {
			con = JDBCUtil.getConnection();
			String sql = "INSERT INTO BANCA (idBanca, Data_Hora, Local, Nota) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1,banca.getId());
			java.util.Date data = banca.getDataHorario();
			java.sql.Date datasql = new java.sql.Date(data.getTime());
			statement.setDate(2,datasql);
			statement.setString(3,banca.getLocal());
			statement.setFloat(4,banca.getNota());
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			throw new BancaDAOException("Erro ao inserir banca");
		} finally {
			JDBCUtil.close(con);
		}
		
	}

	@Override
	public Banca get(long id) throws BancaDAOException {
	
		Banca banca = null;
		Connection con = null;
		
		try {
			con = JDBCUtil.getConnection();
			String sql = "SELECT idBanca, Data_Hora, Local, Nota FROM Banca WHERE idBanca = ?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1,id);
			ResultSet rs = statement.executeQuery();
			if(rs.first()){
				long idBanca = rs.getLong("idBanca");
				Date data_hora = rs.getDate("Data-Hora");
				String local = rs.getString("Local");
				float nota = rs.getFloat("Nota");
				
				banca = new Banca(idBanca,data_hora,local,nota);
			}
		} catch (SQLException e) {
			throw new BancaDAOException("Erro ao buscar banca");
		} finally {
			JDBCUtil.close(con);
		}
		
		return banca;
	}

	@Override
	public Banca getByTrabalho(Trabalho trabalho) throws BancaDAOException {
		
		Banca banca = null;
		Connection con = null;
		
		try {
			con = JDBCUtil.getConnection();
			String sql = "SELECT b.idBanca, Data_Hora, Local, Nota FROM Banca b INNER JOIN Trabalho t ON (b.idBanca = t.idBanca) WHERE idTrabalho = ?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1,trabalho.getId());
			ResultSet rs = statement.executeQuery();
			if(rs.first()){
				long idBanca = rs.getLong("idBanca");
				Date data_hora = rs.getDate("Data-Hora");
				String local = rs.getString("Local");
				float nota = rs.getFloat("Nota");
				
				banca = new Banca(idBanca,data_hora,local,nota);
			}
		} catch (SQLException e) {
			throw new BancaDAOException("Erro ao buscar banca");
		} finally {
			JDBCUtil.close(con);
		}
		
		return banca;
	}

	@Override
	public void update(Banca banca) throws BancaDAOException {
		
		Connection con = null;
		
		try {
			con = JDBCUtil.getConnection();
			
			String sql = "UPDATE Banca SET Data_Hora = ?, Local = ?, Nota = ? WHERE idBanca = ?";
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			java.util.Date data = banca.getDataHorario();
			java.sql.Date datasql = new java.sql.Date(data.getTime());
			statement.setDate(1, datasql);
			statement.setString(2, banca.getLocal());
			statement.setFloat(3, banca.getNota());
			statement.setLong(4,banca.getId());
			
			statement.executeUpdate();
			
			statement.close();
			
		} catch (SQLException e) {
			throw new BancaDAOException("Erro ao atualizar banca");
		} finally {
			JDBCUtil.close(con);
		}
		
	}

	@Override
	public void remove(Banca banca) throws BancaDAOException {
		
		Connection con = null;

		try {
            con = JDBCUtil.getConnection();
			String sql = "DELETE FROM Banca WHERE idBanca = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.executeUpdate();
			st.close();

        } catch (Exception e) {
            throw new BancaDAOException("Erro ao excluir banca");
        } finally {
            JDBCUtil.close(con);
        }
		
	}

}
