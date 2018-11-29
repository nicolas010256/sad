package controller;

import java.util.List;

import dao.NotificacaoDAO;
import dao.NotificacaoDAOImpl;
import dao.exceptions.NotificacaoDAOException;
import entity.Aluno;
import entity.Notificacao;
import entity.Orientador;

public class NotificacaoController {
    private NotificacaoDAO dao = new NotificacaoDAOImpl();
    
    public void add(Notificacao notificacao) {
        try {
            dao.add(notificacao);
        } catch (NotificacaoDAOException e) {
            e.printStackTrace();
        }
    }

	public List<Notificacao> getByAluno(Aluno aluno) {
        List<Notificacao> notificacoes = null;
        try {
            notificacoes = dao.getByAluno(aluno);
        } catch (NotificacaoDAOException e) {
            e.printStackTrace();
        }
        return notificacoes;
	}

	public void update(Notificacao notificacao) {
        try {
            dao.update(notificacao);
        } catch (NotificacaoDAOException e) {
            e.printStackTrace();
        }
	}

	public List<Notificacao> getByOrientador(Orientador orientador) {
		List<Notificacao> notificacoes = null;
        try {
            notificacoes = dao.getByOrientador(orientador);
        } catch (NotificacaoDAOException e) {
            e.printStackTrace();
        }
        return notificacoes;
	}
}