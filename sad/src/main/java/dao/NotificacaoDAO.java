package dao;

import java.util.List;

import dao.exceptions.NotificacaoDAOException;
import entity.Aluno;
import entity.Notificacao;
import entity.Orientador;

public interface NotificacaoDAO {

    void add(Notificacao notificacao) throws NotificacaoDAOException;

    List<Notificacao> getByAluno(Aluno aluno) throws NotificacaoDAOException;

    void update(Notificacao notificacao) throws NotificacaoDAOException;

    List<Notificacao> getByOrientador(Orientador orientador) throws NotificacaoDAOException;


}