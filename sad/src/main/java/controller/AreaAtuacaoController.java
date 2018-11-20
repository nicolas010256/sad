package controller;

import dao.AreaAtuacaoDAO;
import dao.AreaAtuacaoDAOImpl;
import dao.exceptions.AreaAtuacaoDAOException;
import entity.AreaAtuacao;

public class AreaAtuacaoController {
    private AreaAtuacaoDAO dao = new AreaAtuacaoDAOImpl();
    
    public void add(AreaAtuacao areaAtuacao ) {
        try {
            dao.add(areaAtuacao);
        } catch (AreaAtuacaoDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(AreaAtuacao areaAtuacao) {
        try {
            dao.remove(areaAtuacao);
        } catch (AreaAtuacaoDAOException e) {
            e.printStackTrace();
        }
    }
}