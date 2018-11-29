package controller;

import java.util.List;

import dao.OrientadorDAO;
import dao.OrientadorDAOImpl;
import dao.exceptions.OrientadorDAOException;
import entity.Area;
import entity.Orientador;
import entity.Trabalho;

public class OrientadorController {
    private OrientadorDAO dao = new OrientadorDAOImpl();

    public void add(Orientador orientador) {
        try {
            dao.add(orientador);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
    }

    public Orientador get(long id) {
        Orientador orientador = null;
        try {
            orientador = dao.get(id);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
        return orientador;
    }

    public Orientador getByTrabalho(Trabalho trabalho) {
        Orientador orientador = null;
        if (trabalho == null) return null;
        try {
            orientador = dao.getByTrabalho(trabalho);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
        return orientador;
    }

    public Orientador getByEmailAndSenha(String email, String senha) {
        Orientador orientador = null;
        try {
            orientador = dao.getByEmailAndSenha(email, senha);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
        return orientador;
    }

    public List<Orientador> getByArea(Area area) {
        List<Orientador> orientadores = null;
        try {
            orientadores = dao.getByArea(area);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
        return orientadores;
    }

    public List<Orientador> getByAreaAndNome(Area area, String nome) {
        List<Orientador> orientadores = null;
        try {
            orientadores = dao.getByAreaAndNome(area, nome);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
        return orientadores;
	}

    public void getFoto(Orientador orientador) {
        try {
            dao.getFoto(orientador);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
    }

    public void update(Orientador orientador) {
        try {
            dao.update(orientador);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateFoto(Orientador orientador) {
        try {
            dao.updateFoto(orientador);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Orientador orientador) {
        try {
            dao.remove(orientador);
        } catch (OrientadorDAOException e) {
            e.printStackTrace();
        }
    }
    
}