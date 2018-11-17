package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Mensagem;

public class MensagemController implements Controller<Mensagem> {
    private static List<Mensagem> mensagens = new ArrayList<Mensagem>();
    private static long count = 1;

    @Override
    public void add(Mensagem mensagem) {
        mensagem.setId(count);
        mensagens.add(mensagem);
        count++;
    }

    @Override
    public Mensagem get(long id) {
        for (Mensagem mensagem : mensagens) {
            if (mensagem.getId() == id) {
                return mensagem;
            }
        }
        return null;
    }

    @Override
    public List<Mensagem> getAll() {
        return mensagens;
    }

    @Override
    public void update(Mensagem mensagem) {
        Mensagem m = get(mensagem.getId());
        if (m != null) {
            m.setConteudo(mensagem.getConteudo());
        }
    }

    @Override
    public void remove(Mensagem mensagem) {
        Mensagem m = get(mensagem.getId());
        mensagens.remove(m);
	}

}