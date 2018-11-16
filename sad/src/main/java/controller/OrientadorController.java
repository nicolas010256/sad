package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Orientador;

public class OrientadorController implements Controller<Orientador> {
    public List<Orientador> orientadores = new ArrayList<Orientador>();
    private static long count = 1;

    @Override
    public void add(Orientador orientador) {
        orientador.setId(count);
        orientadores.add(orientador);
        count++;
    }

    @Override
    public Orientador get(long id) {
        for (Orientador orientador : orientadores) {
            if (orientador.getId() == id) {
                return orientador;
            }
        }
        return null;
    }

    @Override
    public List<Orientador> getAll() {
        return orientadores;
    }

    public Orientador getByEmailAndSenha(String email, String senha) {
        for (Orientador orientador : orientadores) {
            if (orientador.getEmail().equals(email) && orientador.getSenha().equals(senha)) {
                return orientador;
            }
        }
        return null;
    }

    @Override
    public void update(Orientador orientador) {
        Orientador o = get(orientador.getId());
        if (o != null) {
            o.setNome(orientador.getNome());
            o.setEmail(orientador.getEmail());
            o.setSenha(orientador.getSenha());
        }
    }

    @Override
    public void remove(Orientador orientador) {
        Orientador o = get(orientador.getId());
        orientadores.remove(o);
    }
}