package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Anexo;

public class AnexoController implements Controller<Anexo> {
    private static List<Anexo> anexos = new ArrayList<Anexo>();
    private static long count = 1;
    
    @Override
    public void add(Anexo anexo) {
        anexo.setId(count);
        anexos.add(anexo);
        count++;
    }

    @Override
    public Anexo get(long id) {
        for (Anexo anexo : anexos) {
            if (anexo.getId() == id) {
                return anexo;
            }
        }
        return null;
    }

    @Override
    public List<Anexo> getAll() {
        return anexos;
    }

    @Override
    public void update(Anexo anexo) {
        Anexo a = get(anexo.getId());
        if (a != null) {
            a.setLocal(anexo.getLocal());
            a.setTipo(anexo.getTipo());
        }
    }

    @Override
    public void remove(Anexo anexo) {
        Anexo a = get(anexo.getId());
        anexos.remove(a);		
	}

}