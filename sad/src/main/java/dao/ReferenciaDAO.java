package dao;

import java.util.List;

import dao.exceptions.ReferenciaDAOException;
import entity.Referencia;
import entity.Trabalho;

public interface ReferenciaDAO {

    void add(Referencia referencia) throws ReferenciaDAOException;

    Referencia get(long id) throws ReferenciaDAOException;

    List<Referencia> getByTrabalho(Trabalho trabalho) throws ReferenciaDAOException;

    void update(Referencia referencia) throws ReferenciaDAOException;

    void remove(Referencia referencia) throws ReferenciaDAOException;
}