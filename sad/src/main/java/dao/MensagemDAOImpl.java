package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import dao.exceptions.MensagemDAOException;
import entity.Atividade;
import entity.Mensagem;

public class MensagemDAOImpl implements MensagemDAO {

    @Override
    public void add(Mensagem mensagem, Atividade atividade) throws MensagemDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Mensagem (Conteudo, idAtividade) " +
                    "VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, mensagem.getConteudo());
            if (atividade != null) 
                statement.setLong(2, atividade.getId());
            else
                statement.setNull(2, Types.INTEGER);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new MensagemDAOException("Erro ao inserir mensagem");
        } finally {
            JDBCUtil.close(con);
        }   
    }

    @Override
    public Mensagem get(long id) throws MensagemDAOException {
        Mensagem mensagem = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Conteudo, idAtividade WHERE idMensagem = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String conteudo = rs.getString("Conteudo");

                mensagem = new Mensagem(id, conteudo);
            }
            st.close();
        } catch (SQLException e) {
            throw new MensagemDAOException("Erro ao pesquisar mensagem por atividade");
        } finally {
            JDBCUtil.close(con);
        }
        return mensagem;
    }

    @Override
    public List<Mensagem> getByAtividade(Atividade atividade) throws MensagemDAOException {
        List<Mensagem> mensagens = new ArrayList<Mensagem>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT idMensagem, Conteudo FROM Mensagem WHERE idAtividade = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, atividade.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("idMensagem");
                String conteudo = rs.getString("Conteudo");

                Mensagem mensagem = new Mensagem(id, conteudo);
                mensagens.add(mensagem);
            }
            st.close();

        } catch (SQLException e) {
            throw new MensagemDAOException("Erro ao pesquisar mensagens");
        } finally {
            JDBCUtil.close(con);
        }
        return mensagens;
    }

    @Override
    public void update(Mensagem mensagem) throws MensagemDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Mensagem " +
                            "SET Conteudo = ? " +
                            "WHERE idMensagem = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, mensagem.getConteudo());
            st.setLong(2, mensagem.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new MensagemDAOException("Erro ao alterar atributos da mensagem");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Mensagem mensagem) throws MensagemDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Mensagem WHERE idMensagem = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, mensagem.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new MensagemDAOException("Erro ao excluir mensagem");
        } finally {
            JDBCUtil.close(con);
        }
	}
    
}