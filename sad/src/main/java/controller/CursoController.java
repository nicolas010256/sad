package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Curso;

public class CursoController implements Controller<Curso> {
    private static List<Curso> cursos = new ArrayList<Curso>();
    private static long count =  1;

    @Override
    public void add(Curso curso) {
        curso.setId(count);
        cursos.add(curso);
        count++;
    }

    @Override
    public Curso get(long id) {
        for (Curso curso : cursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public List<Curso> getAll() {
        return cursos;
    }

    @Override
    public void update(Curso curso) {
        Curso c = get(curso.getId());
        if (c != null) {
            c.setNome(curso.getNome());
        }
    }

    @Override
    public void remove(Curso curso) {
        Curso c = get(curso.getId());
        cursos.remove(c);
	}

}