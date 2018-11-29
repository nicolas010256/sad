package dao;

import java.util.List;

import dao.exceptions.AtividadeDAOException;
import entity.Atividade;
import entity.Trabalho;

public interface AtividadeDAO {

    void add(Atividade atividade, Trabalho trabalho) throws AtividadeDAOException;

    Atividade get(long id) throws AtividadeDAOException;

    List<Atividade> getByTrabalho(Trabalho trabalho) throws AtividadeDAOException;

    void update(Atividade atividade) throws AtividadeDAOException;

    void remove(Atividade atividade) throws AtividadeDAOException;
}