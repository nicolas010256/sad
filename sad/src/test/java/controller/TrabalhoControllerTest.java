package controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.Trabalho;

public class TrabalhoControllerTest {
    @Test
    public void testAddAndGet() {
        // Cria classe de controle
        TrabalhoController tController = new TrabalhoController();

        // Adiciona trabalhos
        tController.add(new Trabalho("A", "A", "A", "A"));
        tController.add(new Trabalho("B", "B", "B", "B"));
        tController.add(new Trabalho("C", "C", "C", "C"));

        // Testa
        assertEquals("A", tController.get(1).getTitulo());
        assertEquals("B", tController.get(2).getTitulo());
        assertEquals("C", tController.get(3).getTitulo());
    }

}