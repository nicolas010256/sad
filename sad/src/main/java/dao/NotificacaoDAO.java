package dao;

import dao.exceptions.NotificacaoDAOException;
import entity.Notificacao;

public interface NotificacaoDAO {

    void add(Notificacao notificacao) throws NotificacaoDAOException;
}