package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import dao.exceptions.AnexoDAOException;
import entity.Anexo;
import entity.Mensagem;

public class AnexoDAOImpl implements AnexoDAO {

    @Override
    public void add(Anexo anexo, Mensagem mensagem) throws AnexoDAOException {

        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Anexo (Arquivo, Nome, Tipo,idMensagem) VALUES (?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setBlob(1, new SerialBlob(anexo.getArquivo()));
            st.setString(2,anexo.getNome());
            st.setString(3,anexo.getTipo());

            if (mensagem != null){
                st.setLong(4, mensagem.getId());
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
            String sql = "SELECT idAnexo, Nome, Tipo, idMensagem FROM Anexo WHERE idAnexo = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                long idAnexo = rs.getLong("idAnexo");
                String nome = rs.getString("Nome");
                String tipo = rs.getString("Tipo");
                anexo = new Anexo(idAnexo, nome, tipo);
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

            String sql = "SELECT idAnexo, Nome, Tipo, idMensagem FROM Anexo WHERE idMensagem = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, mensagem.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long idAnexo = rs.getLong("idAnexo");
                String nome = rs.getString("Nome");
                String tipo = rs.getString("Tipo");
                Anexo anexo = new Anexo(idAnexo, nome, tipo);

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
    public byte[] getArquivo(Anexo anexo) throws AnexoDAOException {
        Connection con = null;
        byte[] arquivo = null;
        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT Arquivo FROM Anexo WHERE idAnexo = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, anexo.getId());

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                Blob blob = rs.getBlob("Arquivo");
                arquivo = blob.getBytes(1, (int) blob.length());

                blob.free();
            }

            st.close();

        } catch (SQLException e) {
            throw new AnexoDAOException("Erro ao recuperar arquivo");
        } finally {
            JDBCUtil.close(con);
        }
        return arquivo;
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