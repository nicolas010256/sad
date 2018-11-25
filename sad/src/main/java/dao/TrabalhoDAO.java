package dao;

import java.util.List;

import dao.exceptions.TrabalhoDAOException;
import entity.Aluno;
import entity.Orientador;
import entity.Trabalho;

public interface TrabalhoDAO {

    void add(Trabalho trabalho, Aluno aluno) throws TrabalhoDAOException;

    Trabalho get(long id) throws TrabalhoDAOException;

    List<Trabalho> getAll() throws TrabalhoDAOException;

    Trabalho getByAluno(Aluno aluno) throws TrabalhoDAOException;

    List<Trabalho> getByOrientador(Orientador orientador) throws TrabalhoDAOException;
    
    void getArquivo(Trabalho trabalho) throws TrabalhoDAOException;

    void update(Trabalho trabalho) throws TrabalhoDAOException;

    void updateOrientador(Trabalho trabalho) throws TrabalhoDAOException;

    void updateTipoTrabalho(Trabalho trabalho) throws TrabalhoDAOException;

    void updateBanca(Trabalho trabalho) throws TrabalhoDAOException;

    void remove(Trabalho trabalho) throws TrabalhoDAOException;
}