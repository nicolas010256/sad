package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Referencia;

public class ReferenciaController implements Controller<Referencia> {
    private static List<Referencia> referencias = new ArrayList<Referencia>();
    private static long count = 1;

    @Override
    public void add(Referencia referencia) {
        referencia.setId(count);
        referencias.add(referencia);
        count++;
    }

    @Override
    public Referencia get(long id) {
        for (Referencia referencia : referencias) {
            if (referencia.getId() == id) {
                return referencia;
            }
        }
        return null;
    }

    @Override
    public List<Referencia> getAll() {
        return referencias;
    }

    @Override
    public void update(Referencia referencia) {
        Referencia r = get(referencia.getId());
        if (r != null) {
            r.setReferencia(referencia.getReferencia());
        }
    }

    @Override
    public void remove(Referencia referencia) {
        Referencia r = get(referencia.getId());
        referencias.remove(r);
	}
}