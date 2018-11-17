package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Atividade;

public class AtividadeController implements Controller<Atividade> {
    private static List<Atividade> atividades = new ArrayList<Atividade>();
    private static long count = 1;

    @Override
    public void add(Atividade atividade) {
        atividade.setId(count);
        atividades.add(atividade);
        count++;
    }

    @Override
    public Atividade get(long id) {
        for (Atividade atividade : atividades) {
            if (atividade.getId() == id) {
                return atividade;
            }
        }
        return null;
    }

    @Override
    public List<Atividade> getAll() {
        return atividades;
    }

    @Override
    public void update(Atividade atividade) {
        Atividade a = get(atividade.getId());
        if (a != null) {
            a.setTitulo(atividade.getTitulo());
            a.setDescticao(atividade.getDescricao());
            a.setStatus(atividade.getStatus());
        }
    }

    @Override
    public void remove(Atividade atividade) {
        Atividade a = get(atividade.getId());
        atividades.remove(a);		
	}

}