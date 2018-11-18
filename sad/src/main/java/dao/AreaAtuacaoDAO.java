package dao;

import dao.exceptions.AreaAtuacaoDAOException;
import entity.AreaAtuacao;

public interface AreaAtuacaoDAO {

    void add(AreaAtuacao areaAtuacao) throws AreaAtuacaoDAOException;

    void remove(AreaAtuacao areaAtuacao) throws AreaAtuacaoDAOException;
}