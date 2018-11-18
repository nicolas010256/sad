package controller;

import java.util.List;

import dao.AlunoDAO;
import dao.AlunoDAOException;
import dao.AlunoDAOimpl;
import entity.Aluno;
import entity.Trabalho;

public class AlunoController {
    private AlunoDAO dao = new AlunoDAOimpl();

    public void add(Aluno aluno) {
        try {
            dao.add(aluno); 
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public Aluno get(long id) {
        Aluno aluno = null;
        try {
            aluno = dao.get(id);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
        return aluno;
    }

    public Aluno getByEmailAndSenha(String email, String senha) {
        Aluno aluno = null;
        try {
            aluno = dao.getByEmailAndSenha(email, senha);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
        return aluno;
    }

    public List<Aluno> getByTrabalho(Trabalho trabalho) {
        List<Aluno> alunos = null;
        try {
            alunos = dao.getByTrabalho(trabalho);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public List<Aluno> getAll() {
        List<Aluno> alunos = null;
        try {
            alunos = dao.getAll();
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
        return alunos;
    }

}