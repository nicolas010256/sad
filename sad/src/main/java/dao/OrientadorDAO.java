package dao;

import java.util.List;

import dao.exceptions.OrientadorDAOException;
import entity.Area;
import entity.Orientador;
import entity.Trabalho;

public interface OrientadorDAO {

    void add(Orientador orientador) throws OrientadorDAOException;

    Orientador get(long id) throws OrientadorDAOException;

    Orientador getByEmailAndSenha(String email, String senha) throws OrientadorDAOException;

    Orientador getByTrabalho(Trabalho trabalho) throws OrientadorDAOException;

    List<Orientador> getByArea(Area area) throws OrientadorDAOException;

    void getFoto(Orientador orientador) throws OrientadorDAOException;

    void update(Orientador orientador) throws OrientadorDAOException;

    void updateFoto(Orientador orientador) throws OrientadorDAOException;

    void remove(Orientador orientador) throws OrientadorDAOException;
}