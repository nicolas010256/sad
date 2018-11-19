package dao;

import java.util.List;

import dao.exceptions.AnexoDAOException;
import entity.Anexo;
import entity.Mensagem;

public interface AnexoDAO {

    void add(Anexo anexo) throws AnexoDAOException;

    Anexo get(long id) throws AnexoDAOException;

    List<Anexo> getByMensagem(Mensagem mensagem) throws AnexoDAOException;

    void remove(Anexo anexo);
}