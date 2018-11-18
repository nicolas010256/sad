package dao;

import java.util.List;

import dao.exceptions.CursoDAOException;
import entity.Aluno;
import entity.Curso;

public interface CursoDAO {

    void add(Curso curso) throws CursoDAOException;

    Curso get(long id) throws CursoDAOException;

    List<Curso> getAll() throws CursoDAOException;

    Curso getByAluno(Aluno aluno) throws CursoDAOException;

    void update(Curso curso) throws CursoDAOException;

    void remove(Curso curso) throws CursoDAOException;
}