package controller;

import java.util.ArrayList;
import java.util.List;

import entity.TipoTrabalho;

public class TipoTrabalhoController implements Controller<TipoTrabalho> {
    private static List<TipoTrabalho> tipos = new ArrayList<TipoTrabalho>();
    private static long count = 1;

    @Override
    public void add(TipoTrabalho tipoTrabalho) {
        tipoTrabalho.setId(count);
        tipos.add(tipoTrabalho);
        count++;
    }

    @Override
    public TipoTrabalho get(long id) {
        for (TipoTrabalho tipoTrabalho : tipos) {
            if (tipoTrabalho.getId() == id) {
                return tipoTrabalho;
            }
        }
        return null;
    }

    @Override
    public List<TipoTrabalho> getAll() {
        return tipos;
    }

    @Override
    public void update(TipoTrabalho tipoTrabalho) {
        TipoTrabalho t = get(tipoTrabalho.getId());
        if (t != null) {
            t.setNome(tipoTrabalho.getNome());
        }
    }

    @Override
    public void remove(TipoTrabalho tipoTrabalho) {
        TipoTrabalho t = get(tipoTrabalho.getId());
        tipos.remove(t);
	}
    
}