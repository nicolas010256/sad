package controller;

import java.util.List;

import dao.AlunoDAO;
import dao.exceptions.AlunoDAOException;
import dao.AlunoDAOImpl;
import entity.Aluno;
import entity.Curso;
import entity.Trabalho;

public class AlunoController {
    private AlunoDAO dao = new AlunoDAOImpl();

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

    public List<Aluno> getByCursoAndNome(Curso curso, String nome) {
        List<Aluno> alunos = null;
        try {
            alunos = dao.getByCursoAndNome(curso, nome);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        } return alunos;
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

    public void getFoto(Aluno aluno) {
        try {
            dao.getFoto(aluno);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public void update(Aluno aluno) {
        try {
            dao.update(aluno);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateFoto(Aluno aluno) {
        try {
            dao.updateFoto(aluno);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateCurso(Aluno aluno, Curso curso) {
        try {
            dao.updateCurso(aluno, curso);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public void updateTrabalho(Aluno aluno, Trabalho trabalho) {
        try {
            dao.updateTrabalho(aluno, trabalho);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Aluno aluno) {
        try {
            dao.remove(aluno);
        } catch (AlunoDAOException e) {
            e.printStackTrace();
        }
    }

}