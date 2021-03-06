package dao;

import java.util.List;

import dao.exceptions.TipoTrabalhoDAOException;
import entity.TipoTrabalho;
import entity.Trabalho;

public interface TipoTrabalhoDAO {

    void add(TipoTrabalho tipoTrabalho) throws TipoTrabalhoDAOException;

    TipoTrabalho get(long id) throws TipoTrabalhoDAOException;

    List<TipoTrabalho> getAll() throws TipoTrabalhoDAOException;

    TipoTrabalho getByTrabalho(Trabalho trabalho) throws TipoTrabalhoDAOException;

    void update(TipoTrabalho tipoTrabalho) throws TipoTrabalhoDAOException;

    void remove(TipoTrabalho tipoTrabalho) throws TipoTrabalhoDAOException;
}