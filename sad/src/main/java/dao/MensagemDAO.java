package dao;

import java.util.List;

import dao.exceptions.MensagemDAOException;
import entity.Atividade;
import entity.Mensagem;

public interface MensagemDAO {

    void add(Mensagem mensagem, Atividade atividade) throws MensagemDAOException;

    Mensagem get(long id) throws MensagemDAOException;

    List<Mensagem> getByAtividade(Atividade atividade) throws MensagemDAOException;

    void update(Mensagem mensagem) throws MensagemDAOException;

    void remove(Mensagem mensagem) throws MensagemDAOException;
}