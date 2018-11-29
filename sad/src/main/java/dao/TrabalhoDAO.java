package dao;

import java.util.List;

import dao.exceptions.TrabalhoDAOException;
import entity.Aluno;
import entity.Banca;
import entity.Orientador;
import entity.TipoTrabalho;
import entity.Trabalho;

public interface TrabalhoDAO {

    void add(Trabalho trabalho, Aluno aluno, TipoTrabalho tipoTrabalho) throws TrabalhoDAOException;

    Trabalho get(long id) throws TrabalhoDAOException;

    List<Trabalho> getAll() throws TrabalhoDAOException;

    Trabalho getByAluno(Aluno aluno) throws TrabalhoDAOException;

    List<Trabalho> getByOrientador(Orientador orientador) throws TrabalhoDAOException;
    
    void getArquivo(Trabalho trabalho) throws TrabalhoDAOException;

    void update(Trabalho trabalho) throws TrabalhoDAOException;

    void updateOrientador(Trabalho trabalho, Orientador orientador) throws TrabalhoDAOException;

    void updateTipoTrabalho(Trabalho trabalho, TipoTrabalho tipoTrabalho) throws TrabalhoDAOException;

    void updateBanca(Trabalho trabalho, Banca banca) throws TrabalhoDAOException;

    void remove(Trabalho trabalho) throws TrabalhoDAOException;
}