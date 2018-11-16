package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class AlunoController implements Controller<Aluno>{
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private static long count = 1;

    @Override
    public void add(Aluno aluno) {
        aluno.setId(count);
        alunos.add(aluno);
        count++;
    }

    @Override
    public Aluno get(long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    public Aluno getByEmailAndSenha(String email, String senha) {
        for (Aluno aluno : alunos) {
            if (aluno.getEmail().equals(email) && aluno.getSenha().equals(senha)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunos;
    }

    @Override
    public void update(Aluno aluno) {
        Aluno a = get(aluno.getId());
        if (a != null) {
            a.setEmail(aluno.getEmail());
            a.setSenha(aluno.getSenha());
            a.setNome(aluno.getNome());
            a.setTrabalho(aluno.getTrabalho());
            a.setCurso(aluno.getCurso());
            a.setNotaTG1(aluno.getNotaTG1());
            a.setNotaTG2(aluno.getNotaTG2()); 
        }
    }

    @Override
    public void remove(Aluno aluno) {
        alunos.remove(aluno);
    }
}