package controller;

import java.util.ArrayList;
import java.util.List;

import entity.AreaAtuacao;

public class AreaAtuacaoController {
    private static List<AreaAtuacao> areasAtuacao = new ArrayList<AreaAtuacao>();

    public void add(AreaAtuacao areaAtuacao) {
        areasAtuacao.add(areaAtuacao);
    }

    public void remove(AreaAtuacao areaAtuacao) {
        areasAtuacao.remove(areaAtuacao);
    }
}