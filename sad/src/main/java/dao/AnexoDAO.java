package dao;

import java.util.List;

import dao.exceptions.AnexoDAOException;
import entity.Anexo;

public interface AnexoDAO {

    void add(Anexo anexo) throws AnexoDAOException;

    Anexo get(long id) throws AnexoDAOException;

    List<Anexo> getByMensagem() throws AnexoDAOException;

    void remove(Anexo anexo);
}