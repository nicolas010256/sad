package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Trabalho;

public class TrabalhoController implements Controller<Trabalho> {
    private List<Trabalho> trabalhos = new ArrayList<Trabalho>();
    private static long count = 1;

    @Override
    public void add(Trabalho trabalho) {
        trabalho.setId(count);
        trabalhos.add(trabalho);
        count++;
    }

    @Override
    public Trabalho get(long id) {
        for (Trabalho trabalho : trabalhos) {
            if (trabalho.getId() == id) {
                return trabalho;
            }
        }
        return null;
    }

    @Override
    public List<Trabalho> getAll() {
        return trabalhos;
    }

    @Override
    public void update(Trabalho trabalho) {
        Trabalho t = get(trabalho.getId());
        t.setTema(trabalho.getTema());
        t.setTitulo(trabalho.getTitulo());
        t.setMetodologia(trabalho.getMetodologia());
        t.setRelevancia(trabalho.getRelevancia());
        t.setOrientador(trabalho.getOrientador()); 
        t.setTipoTrabalho(trabalho.getTipoTrabalho());
    }

    @Override
    public void remove(Trabalho trabalho) {
        Trabalho t = get(trabalho.getId());
        trabalhos.remove(t);
    }


}