package dao;

import dao.exceptions.BancaDAOException;
import entity.Banca;
import entity.Trabalho;

public interface BancaDAO {

    void add(Banca banca) throws BancaDAOException;

    Banca get(long id) throws BancaDAOException;

    Banca getByTrabalho(Trabalho trabalho) throws BancaDAOException;

    void update(Banca banca) throws BancaDAOException;

    void remove(Banca banca) throws BancaDAOException;
}