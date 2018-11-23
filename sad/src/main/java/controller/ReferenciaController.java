package controller;

import java.util.List;

import dao.ReferenciaDAO;
import dao.ReferenciaDAOImpl;
import dao.exceptions.ReferenciaDAOException;
import entity.Referencia;
import entity.Trabalho;

public class ReferenciaController {
    private ReferenciaDAO dao = new ReferenciaDAOImpl();

    public void add(Referencia referencia) {
        try {
            dao.add(referencia);
        } catch (ReferenciaDAOException e) {
            e.printStackTrace();
        }
    }

    public Referencia get(long id) {
        Referencia referencia = null;
        try {
            referencia = dao.get(id);
        } catch (ReferenciaDAOException e) {
            e.printStackTrace();
        }
        return referencia;
    }

    public List<Referencia> getByTrabalho(Trabalho trabalho) {
        List<Referencia> referencias = null;
        try {
            referencias = dao.getByTrabalho(trabalho);
        } catch (ReferenciaDAOException e) {
            e.printStackTrace();
        }
        return referencias;
    }

    public void update(Referencia referencia) {
        try {
            dao.update(referencia);
        } catch (ReferenciaDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Referencia referencia) {
        try {
            dao.remove(referencia);
        } catch (ReferenciaDAOException e) {
            e.printStackTrace();
        }
    }
}