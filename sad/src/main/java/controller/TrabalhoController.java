package controller;

import java.util.List;

import dao.TrabalhoDAO;
import dao.TrabalhoDAOImpl;
import dao.exceptions.TrabalhoDAOException;
import entity.Aluno;
import entity.Banca;
import entity.Orientador;
import entity.TipoTrabalho;
import entity.Trabalho;


public class TrabalhoController {
    private TrabalhoDAO dao = new TrabalhoDAOImpl();

    public void add(Trabalho trabalho, Aluno aluno, TipoTrabalho tipoTrabalho) {
        try {
            dao.add(trabalho, aluno, tipoTrabalho);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public Trabalho get(long id) {
        Trabalho trabalho = null;
        try {
            trabalho = dao.get(id);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
        return trabalho;
    }

    public  List<Trabalho> getAll() {
        List<Trabalho> trabalhos = null;
        try {
            trabalhos = dao.getAll();
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
        return trabalhos; 
    }

    public Trabalho getByAluno(Aluno aluno) {
        Trabalho trabalho = null;
        try {
            trabalho = dao.getByAluno(aluno);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
        return trabalho;
    }

    public List<Trabalho> getByOrientador(Orientador orientador) {
        List<Trabalho> trabalhos = null;
        try {
            trabalhos = dao.getByOrientador(orientador);

        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
        return trabalhos;
    }

    public void update(Trabalho trabalho) {
        try {
            dao.update(trabalho);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateOrientador(Trabalho trabalho, Orientador orientador) {
        try {
            dao.updateOrientador(trabalho, orientador);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateTipoTrabalho(Trabalho trabalho, TipoTrabalho tipoTrabalho) {
        try {
            dao.updateTipoTrabalho(trabalho, tipoTrabalho);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    } 

    public void updateBanca(Trabalho trabalho, Banca banca) {
        try {
            dao.updateBanca(trabalho, banca);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Trabalho trabalho) {
        try {
            dao.remove(trabalho);
        } catch (TrabalhoDAOException e) {
            e.printStackTrace();
        }
    }

}