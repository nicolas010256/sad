package controller;

import dao.BancaDAO;
import dao.BancaDAOImpl;
import dao.exceptions.BancaDAOException;
import entity.Banca;
import entity.Trabalho;

public class BancaController {
    private BancaDAO dao = new BancaDAOImpl();

    public void add(Banca banca, Trabalho trabalho) {
        try {
            dao.add(banca, trabalho);
        } catch (BancaDAOException e) {
            e.printStackTrace();
        }
    }

    public Banca get(long id) {
        Banca banca = null;
        try {
            banca = dao.get(id);
        } catch (BancaDAOException e) {
            e.printStackTrace();
        }
        return banca;

    }

    public Banca getByTrabalho(Trabalho trabalho) {
        Banca banca = null;
        try {
            banca = dao.getByTrabalho(trabalho);
        } catch (BancaDAOException e) {
            e.printStackTrace();
        }
        return banca;
    }

    public void update(Banca banca) {
        try {
            dao.update(banca);
        } catch (BancaDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Banca banca) {
        try {
            dao.remove(banca);
        } catch (BancaDAOException e) {
            e.printStackTrace();
        }
    }
}