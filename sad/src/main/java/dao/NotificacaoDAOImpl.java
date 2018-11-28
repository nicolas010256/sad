package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.exceptions.NotificacaoDAOException;
import entity.Notificacao;

public class NotificacaoDAOImpl implements NotificacaoDAO {

    @Override
	public void add(Notificacao notificacao) throws NotificacaoDAOException {
        Connection con = null;
		try {
            con = JDBCUtil.getConnection();

            String sql = "INSERT INTO Notificacao(id_remetente, tipo_remetente, id_destinatario, tipo_destinatario, mensagem, tipo_notificacao, status) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, notificacao.getIdRemetente());
            st.setInt(2, notificacao.getTipoRemetente());
            st.setLong(3, notificacao.getIdDestinatario());
            st.setInt(4, notificacao.getTipoDestinatario());
            st.setString(5, notificacao.getMensagem());
            st.setInt(6, notificacao.getTipoNotificacao());
            st.setInt(7, notificacao.getStatus());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new NotificacaoDAOException("Erro ao salvar notificação");
        } finally {
            JDBCUtil.close(con);
        }
	}

}