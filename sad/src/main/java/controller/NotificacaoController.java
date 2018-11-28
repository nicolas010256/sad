package controller;

import dao.NotificacaoDAO;
import dao.NotificacaoDAOImpl;
import dao.exceptions.NotificacaoDAOException;
import entity.Notificacao;
import entity.Usuario;

public class NotificacaoController {
    private NotificacaoDAO dao = new NotificacaoDAOImpl();
    
    public void add(Notificacao notificacao) {
        try {
            dao.add(notificacao);
        } catch (NotificacaoDAOException e) {
            e.printStackTrace();
        }
    }
}