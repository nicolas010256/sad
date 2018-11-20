package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.AnexoDAOException;
import entity.Anexo;
import entity.Mensagem;

public class AnexoDAOImpl implements AnexoDAO {

    @Override
    public void add(Anexo anexo) throws AnexoDAOException {

        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Anexo (idAnexo,Local,Tipo,idMensagem) VALUES (?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, anexo.getId());
            st.setString(2,anexo.getLocal());
            st.setString(3,anexo.getTipo());
            if (anexo.getMensagem() != null){
                st.setLong(4, anexo.getMensagem().getId());
            } else {
                st.setNull(4, Types.INTEGER);
            }
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new AnexoDAOException("Erro ao inserir anexo");
        } finally {
            JDBCUtil.close(con);
        }  
        
    }

    @Override
    public Anexo get(long id) throws AnexoDAOException {
        
        Anexo anexo = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT idAnexo, Local, Tipo, idMensagem FROM Anexo WHERE idAnexo = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                long idAnexo = rs.getLong("idAnexo");
                String local = rs.getString("Local");
                String tipo = rs.getString("Tipo");
                anexo = new Anexo(idAnexo, local, tipo);
            }
            st.close();
        } catch (SQLException e) {
            throw new AnexoDAOException("Erro ao pesquisar aluno");
        } finally {
            JDBCUtil.close(con);
        }
        return anexo;
    }

    @Override
    public List<Anexo> getByMensagem(Mensagem mensagem) throws AnexoDAOException {
        List<Anexo> anexos = new ArrayList<Anexo>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idAnexo, Local, Tipo, idMensagem FROM Anexo WHERE idMensagem = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, mensagem.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long idAnexo = rs.getLong("idAnexo");
                String local = rs.getString("Local");
                String tipo = rs.getString("Tipo");
                Anexo anexo = new Anexo(idAnexo, local, tipo);

                anexos.add(anexo);
            }
            st.close();

        } catch (SQLException e) {
            throw new AnexoDAOException("Erro ao pesquisar anexo");
        } finally {
            JDBCUtil.close(con);
        }
        return anexos;
	}

	@Override
	public void remove(Anexo anexo) throws AnexoDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Anexo WHERE idAnexo = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, anexo.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AnexoDAOException("Erro ao excluir anexo");
        } finally {
            JDBCUtil.close(con);
        }
	}
    
}