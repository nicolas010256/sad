package controller;

import java.util.List;

import dao.AnexoDAO;
import dao.AnexoDAOImpl;
import dao.exceptions.AnexoDAOException;
import entity.Anexo;
import entity.Mensagem;

public class AnexoController {
    AnexoDAO dao = new AnexoDAOImpl();

    public void add(Anexo anexo) {
        try {
            dao.add(anexo);
        } catch (AnexoDAOException e) {
            e.printStackTrace();
        }
    }

    public Anexo get(long id) {
        Anexo anexo = null;
        try {
            anexo = dao.get(id);
        } catch (AnexoDAOException e) {
            e.printStackTrace();
        }
        return anexo;
    }

    public List<Anexo> getByMensagem(Mensagem mensagem) {
        List<Anexo> anexos = null;
        try {
            anexos = dao.getByMensagem(mensagem);
        } catch (AnexoDAOException e) {
            e.printStackTrace();
        }
        return anexos;
    }

    public void remove(Anexo anexo) {
        try {
            dao.remove(anexo);
        } catch (AnexoDAOException e) {
            e.printStackTrace();
        }
    }


}