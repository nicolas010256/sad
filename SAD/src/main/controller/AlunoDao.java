package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Aluno;

public class AlunoDao implements Dao<Aluno> {
    private List<Aluno> alunos = new ArrayList<Aluno>();

    @Override
    public Optional<Aluno> get(long id) {
        return Optional.ofNullable(alunos.get((int) id));
    }

    @Override
    public List<Aluno> getAll() {
        return null;
    }

    @Override
    public void save(Aluno t) {

    }

    @Override
    public void update(Aluno t, String[] params) {

    }

    @Override
	public void delete(Aluno t) {
		
	}

}