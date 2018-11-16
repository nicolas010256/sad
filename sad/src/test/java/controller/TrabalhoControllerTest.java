package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

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

    @Test
    public void testGetAll() {
        // Cria classe de controle
        TrabalhoController tController = new TrabalhoController();

        // Adiciona trabalhos
        tController.add(new Trabalho("A", "A", "A", "A"));
        tController.add(new Trabalho("B", "B", "B", "B"));
        tController.add(new Trabalho("C", "C", "C", "C"));

        // Recupera trabalhos
        List<Trabalho> t = tController.getAll();

        // Testa
        assertEquals("A", t.get(0).getTitulo());
        assertEquals("B", t.get(1).getTitulo());
        assertEquals("C", t.get(2).getTitulo());
    }

    @Test
    public void testUpdate() {
        // Cria classe de controle
        TrabalhoController tController = new TrabalhoController();

        // Adiciona trabalhos
        tController.add(new Trabalho("A", "A", "A", "A"));
        tController.add(new Trabalho("B", "B", "B", "B"));
        tController.add(new Trabalho("C", "C", "C", "C"));

        // Recupera trabalhos
        Trabalho t1 = tController.get(1);
        Trabalho t2 = tController.get(2);
        Trabalho t3 = tController.get(3);

        // Altera titulos
        t1.setTitulo("Z");
        t2.setTitulo("Y");
        t3.setTitulo("X");

        // Update
        tController.update(t1);
        tController.update(t2);
        tController.update(t3);

        // Teste
        assertEquals("Z", tController.get(1).getTitulo());
        assertEquals("Y", tController.get(2).getTitulo());
        assertEquals("X", tController.get(3).getTitulo());
    }

    @Test
    public void testRemove() {
        // Cria classe de controle
        TrabalhoController tController = new TrabalhoController();

        // Adiciona trabalhos
        tController.add(new Trabalho("A", "A", "A", "A"));
        tController.add(new Trabalho("B", "B", "B", "B"));
        tController.add(new Trabalho("C", "C", "C", "C"));

        // Recupera trabalhos
        Trabalho t1 = tController.get(1);
        Trabalho t2 = tController.get(2);
        Trabalho t3 = tController.get(3);

        // Remove
        tController.remove(t1);
        tController.remove(t2);
        tController.remove(t3);

        // Teste
        assertNull(tController.get(1));
        assertNull(tController.get(2));
        assertNull(tController.get(3));
    }

}