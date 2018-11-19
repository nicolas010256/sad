package controller;

import java.util.List;

import dao.MensagemDAO;
import dao.MensagemDAOImpl;
import dao.exceptions.MensagemDAOException;
import entity.Atividade;
import entity.Mensagem;

public class MensagemController {
    private MensagemDAO dao = new MensagemDAOImpl();

    public void add(Mensagem mensagem) {
        try {
            dao.add(mensagem);
        } catch (MensagemDAOException e) {
            e.printStackTrace();
        }
    }

    public Mensagem get(long id) {
        Mensagem mensagem = null;
        try {
            mensagem = dao.get(id);
        } catch (MensagemDAOException e) {
            e.printStackTrace();
        }
        return mensagem;
    }

    public List<Mensagem> getByAtividade(Atividade atividade) {
        List<Mensagem> mensagens = null;
        try {
            mensagens = dao.getByAtividade(atividade);
        } catch (MensagemDAOException e) {
            e.printStackTrace();
        }
        return mensagens;
    }

    public void update(Mensagem mensagem) {
        try {
            dao.update(mensagem);
        } catch (MensagemDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Mensagem mensagem) {
        try {
            dao.remove(mensagem);
        } catch (MensagemDAOException e) {
            e.printStackTrace();
        }
    }
}