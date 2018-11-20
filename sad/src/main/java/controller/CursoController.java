package controller;

import java.util.List;

import dao.CursoDAO;
import dao.CursoDAOImpl;
import dao.exceptions.CursoDAOException;
import entity.Aluno;
import entity.Curso;

public class CursoController {
    private CursoDAO dao =  new CursoDAOImpl();

    public void add(Curso curso) {
        try {
            dao.add(curso);
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
    }

    public Curso get(long id) {
        Curso curso = null;
        try {
            curso =  dao.get(id);
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
        return curso;
    }

    public List<Curso> getAll() {
        List<Curso> cursos = null;
        try {
            cursos = dao.getAll();
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
        return cursos;
    }

    public Curso getByAluno(Aluno aluno) {
        Curso curso = null;
        try {
            curso = dao.getByAluno(aluno);
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
        return curso;
    }

    public void update(Curso curso) {
        try {
            dao.update(curso);
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Curso curso) {
        try {
            dao.remove(curso);
        } catch (CursoDAOException e) {
            e.printStackTrace();
        }
    }
}