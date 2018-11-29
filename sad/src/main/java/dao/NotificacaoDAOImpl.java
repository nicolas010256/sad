package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.exceptions.NotificacaoDAOException;
import entity.Aluno;
import entity.Notificacao;
import entity.Orientador;

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

    @Override
    public List<Notificacao> getByAluno(Aluno aluno) throws NotificacaoDAOException {
        List<Notificacao> notificacoes = new ArrayList<Notificacao>();
        Connection con = null;
        try {

            con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM Notificacao WHERE id_destinatario = ? AND tipo_destinatario = ? AND status = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, aluno.getId());
            st.setInt(2, Notificacao.ALUNO);
            st.setInt(3, Notificacao.UNREAD);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id_notificacao");
                long idRemetente = rs.getLong("id_remetente");
                int tipoRemetente = rs.getInt("tipo_remetente");
                long idDestinatario = rs.getLong("id_destinatario");
                int tipoDestinatario = rs.getInt("tipo_destinatario");
                String mensagem = rs.getString("mensagem");
                int tipoNotificacao = rs.getInt("tipo_notificacao");
                int status = rs.getInt("status");

                Notificacao notificacao = new Notificacao(id, idRemetente, tipoRemetente, idDestinatario, tipoDestinatario);
                notificacao.setMensagem(mensagem);
                notificacao.setTipoNotificacao(tipoNotificacao);
                notificacao.setStatus(status);

                notificacoes.add(notificacao);
            }

            st.close();

        } catch (SQLException e) {
            throw new NotificacaoDAOException("Erro ao recuperar notificações");
        } finally {
            JDBCUtil.close(con);
        }
        return notificacoes;
	}

    @Override
    public void update(Notificacao notificacao) throws NotificacaoDAOException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();

            String sql = "UPDATE Notificacao SET status=? WHERE id_notificacao=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, notificacao.getStatus());
            st.setLong(2, notificacao.getId());

            st.execute();
            st.close();


        } catch (SQLException e) {
            throw new NotificacaoDAOException("Erro ao atualizar notificação");
        } finally {
            JDBCUtil.close(con);
        }
    }

    @Override
    public List<Notificacao> getByOrientador(Orientador orientador) throws NotificacaoDAOException {
        List<Notificacao> notificacoes = new ArrayList<Notificacao>();
        Connection con = null;
        try {

            con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM Notificacao WHERE id_destinatario = ? AND tipo_destinatario = ? AND status = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, orientador.getId());
            st.setInt(2, Notificacao.ORIENTADOR);
            st.setInt(3, Notificacao.UNREAD);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id_notificacao");
                long idRemetente = rs.getLong("id_remetente");
                int tipoRemetente = rs.getInt("tipo_remetente");
                long idDestinatario = rs.getLong("id_destinatario");
                int tipoDestinatario = rs.getInt("tipo_destinatario");
                String mensagem = rs.getString("mensagem");
                int tipoNotificacao = rs.getInt("tipo_notificacao");
                int status = rs.getInt("status");

                Notificacao notificacao = new Notificacao(id, idRemetente, tipoRemetente, idDestinatario, tipoDestinatario);
                notificacao.setMensagem(mensagem);
                notificacao.setTipoNotificacao(tipoNotificacao);
                notificacao.setStatus(status);

                notificacoes.add(notificacao);
            }

            st.close();

        } catch (SQLException e) {
            throw new NotificacaoDAOException("Erro ao recuperar notificações");
        } finally {
            JDBCUtil.close(con);
        }
        return notificacoes;
	}

}