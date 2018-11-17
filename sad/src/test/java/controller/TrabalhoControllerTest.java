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

        // Cria Trabalhos
        Trabalho t1 = new Trabalho("A", "A", "A", "A");
        Trabalho t2 = new Trabalho("B", "B", "B", "B");
        Trabalho t3 = new Trabalho("C", "C", "C", "C");

        // Adiciona trabalhos
        tController.add(t1);
        tController.add(t2);
        tController.add(t3);

        // Recupera trabalhos
        Trabalho t01 = tController.get(t1.getId());
        Trabalho t02 = tController.get(t2.getId());
        Trabalho t03 = tController.get(t3.getId());

        // Altera titulos
        t1.setTitulo("Z");
        t2.setTitulo("Y");
        t3.setTitulo("X");

        // Update
        tController.update(t01);
        tController.update(t02);
        tController.update(t03);

        // Teste
        assertEquals("Z", tController.get(t1.getId()).getTitulo());
        assertEquals("Y", tController.get(t2.getId()).getTitulo());
        assertEquals("X", tController.get(t3.getId()).getTitulo());
    }

    @Test
    public void testRemove() {
        // Cria classe de controle
        TrabalhoController tController = new TrabalhoController();

        // Cria Trabalhos
        Trabalho t1 = new Trabalho("A", "A", "A", "A");
        Trabalho t2 = new Trabalho("B", "B", "B", "B");
        Trabalho t3 = new Trabalho("C", "C", "C", "C");

        // Adiciona trabalhos
        tController.add(t1);
        tController.add(t2);
        tController.add(t3);

        // Recupera trabalhos
        Trabalho t01 = tController.get(t1.getId());
        Trabalho t02 = tController.get(t2.getId());
        Trabalho t03 = tController.get(t3.getId());

        // Remove
        tController.remove(t01);
        tController.remove(t02);
        tController.remove(t03);

        // Teste
        assertNull(tController.get(t1.getId()));
        assertNull(tController.get(t2.getId()));
        assertNull(tController.get(t3.getId()));
    }

}