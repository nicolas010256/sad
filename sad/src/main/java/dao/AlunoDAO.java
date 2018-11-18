package dao;

import java.util.List;

import dao.exceptions.AlunoDAOException;
import entity.Aluno;
import entity.Trabalho;

public interface AlunoDAO {

    void add(Aluno aluno) throws AlunoDAOException;

    Aluno get(long id) throws AlunoDAOException;

    Aluno getByEmailAndSenha(String email, String senha) throws AlunoDAOException;

    List<Aluno> getByTrabalho(Trabalho trabalho) throws AlunoDAOException;

    List<Aluno> getAll() throws AlunoDAOException;

    void getFoto(Aluno aluno) throws AlunoDAOException;

    void update(Aluno aluno) throws AlunoDAOException;

    void updateFoto(Aluno aluno);

    void updateCurso(Aluno aluno);

    void updateTrabalho(Aluno aluno);

    void remove(Aluno aluno) throws AlunoDAOException;
}