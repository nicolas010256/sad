package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Banca;

public class BancaController implements Controller<Banca> {
    private List<Banca> bancas = new ArrayList<Banca>();
    private static long count = 1;

    @Override
    public void add(Banca banca) {
        banca.setId(count);
        bancas.add(banca);
        count++;
    }

    @Override
    public Banca get(long id) {
        for (Banca  banca : bancas) {
            if (banca.getId() == id) {
                return banca;
            }
        }
        return null;
    }

    @Override
    public List<Banca> getAll() {
        return bancas;
    }

    @Override
    public void update(Banca banca) {
        Banca b = get(banca.getId());
        if (b != null) {
            b.setDataHorario(banca.getDataHorario());
            b.setLocal(banca.getLocal());
            b.setNota(banca.getNota());
        }
    }   

    @Override
    public void remove(Banca banca) {
        Banca b = get(banca.getId());
        bancas.remove(b);
	}

}