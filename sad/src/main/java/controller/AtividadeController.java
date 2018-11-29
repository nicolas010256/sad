package controller;

import java.util.List;

import dao.AtividadeDAO;
import dao.AtividadeDAOImpl;
import dao.exceptions.AtividadeDAOException;
import entity.Atividade;
import entity.Trabalho;

public class AtividadeController {
    private AtividadeDAO dao = new AtividadeDAOImpl();

    public void add(Atividade atividade, Trabalho trabalho) {
        try {
            dao.add(atividade, trabalho);
        } catch (AtividadeDAOException e) {
            e.printStackTrace();
        }
    }

    public Atividade get(long id) {
        Atividade atividade = null;
        try {
            atividade = dao.get(id);
        } catch (AtividadeDAOException e) {
            e.printStackTrace();
        }
        return atividade;
    }

    public List<Atividade> getByTrabalho(Trabalho trabalho) {
        List<Atividade> atividades = null;
        try {
            atividades = dao.getByTrabalho(trabalho);
        } catch (AtividadeDAOException e) {
            e.printStackTrace();
        }
        return atividades;
    }

    public void update(Atividade atividade) {
        try {
            dao.update(atividade);
        } catch(AtividadeDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Atividade atividade) {
        try {
            dao.remove(atividade);
        } catch(AtividadeDAOException e) {
            e.printStackTrace();
        }
    }
}