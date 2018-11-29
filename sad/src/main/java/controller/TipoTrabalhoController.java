package controller;

import java.util.List;

import dao.TipoTrabalhoDAO;
import dao.TipoTrabalhoDAOImpl;
import dao.exceptions.TipoTrabalhoDAOException;
import entity.TipoTrabalho;
import entity.Trabalho;

public class TipoTrabalhoController {
    private TipoTrabalhoDAO dao = new TipoTrabalhoDAOImpl();

    public void add(TipoTrabalho tipoTrabalho) {
        try {
            dao.add(tipoTrabalho);
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public TipoTrabalho get(long id) {
        TipoTrabalho tipoTrabalho = null;
        try {
            tipoTrabalho = dao.get(id);
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
        return tipoTrabalho;
    }

    public List<TipoTrabalho> getAll() {
        List<TipoTrabalho> tiposTrabalho = null;
        try {
            tiposTrabalho = dao.getAll();
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
        return tiposTrabalho;
    }

    public TipoTrabalho getByTrabalho(Trabalho trabalho) {
        TipoTrabalho tipoTrabalho = null;
        if (trabalho == null) return null;
        try {
            tipoTrabalho = dao.getByTrabalho(trabalho);
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
        return tipoTrabalho;
    }

    public void update(TipoTrabalho tipoTrabalho) {
        try {
            dao.update(tipoTrabalho);
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(TipoTrabalho tipoTrabalho) {
        try {
            dao.remove(tipoTrabalho);
        } catch (TipoTrabalhoDAOException e) {
            e.printStackTrace();
        }
    }
}