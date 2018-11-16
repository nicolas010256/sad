package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

import entity.Orientador;

public class OrientadorControllerTest {
    
    @Test
    public void testAddAndGet() {
        // Cria classe de controle
        OrientadorController oController = new OrientadorController();

        // Adiciona Orientadores
        oController.add(new Orientador("manuel@gmail.com", "123456", "Manuel"));
        oController.add(new Orientador("cleiton@gmail.com", "123456", "Cleiton"));
        oController.add(new Orientador("sylvio@gmail.com", "123456", "Sylvio"));

        // Testa
        assertEquals("manuel@gmail.com", oController.get(1).getEmail());
        assertEquals("cleiton@gmail.com", oController.get(2).getEmail());
        assertEquals("sylvio@gmail.com", oController.get(3).getEmail());
    }

    @Test
    public void testGetAll() {
        // Cria classe de controle
        OrientadorController oController = new OrientadorController();

        // Adiciona Orientadores
        oController.add(new Orientador("manuel@gmail.com", "123456", "Manuel"));
        oController.add(new Orientador("cleiton@gmail.com", "123456", "Cleiton"));
        oController.add(new Orientador("sylvio@gmail.com", "123456", "Sylvio"));

        // Recupera Orientadores
        List<Orientador> lista = oController.getAll();

        // Testa
        assertEquals(3, lista.size());
        assertEquals("Manuel", lista.get(0).getNome());
        assertEquals("Cleiton", lista.get(1).getNome());
        assertEquals("Sylvio", lista.get(2).getNome());
    }

    @Test
    public void testGetByEmailAndSenha() {
        // Cria a classe de controle
        OrientadorController oController = new OrientadorController();

        // Adiciona Orientadores
        oController.add(new Orientador("manuel@gmail.com", "123456", "Manuel"));
        oController.add(new Orientador("cleiton@gmail.com", "123456", "Cleiton"));
        oController.add(new Orientador("sylvio@gmail.com", "123456", "Sylvio"));

        // Testa
        assertEquals("Manuel", oController.getByEmailAndSenha("manuel@gmail.com", "123456").getNome());
        assertEquals("Sylvio", oController.getByEmailAndSenha("sylvio@gmail.com", "123456").getNome());
        assertEquals("Cleiton", oController.getByEmailAndSenha("cleiton@gmail.com", "123456").getNome());
    }

    @Test
    public void testUpdate() {
        // Cria a classe de controle
        OrientadorController oController = new OrientadorController();

        // Adiciona Orientadores
        oController.add(new Orientador("manuel@gmail.com", "123456", "Manuel"));
        oController.add(new Orientador("cleiton@gmail.com", "123456", "Cleiton"));
        oController.add(new Orientador("sylvio@gmail.com", "123456", "Sylvio"));

        // Recupera Orientadores
        Orientador orientador1 = oController.getByEmailAndSenha("manuel@gmail.com", "123456");
        Orientador orientador2 = oController.getByEmailAndSenha("cleiton@gmail.com", "123456");
        Orientador orientador3 = oController.getByEmailAndSenha("sylvio@gmail.com", "123456");

        // Altera a senha dos orientadores
        orientador1.setSenha("987654");
        orientador2.setSenha("963852");
        orientador3.setSenha("852741");

        // Chama o update
        oController.update(orientador1);
        oController.update(orientador2);
        oController.update(orientador3);

        // Testa
        assertEquals("Manuel", oController.getByEmailAndSenha("manuel@gmail.com", "987654").getNome());
        assertEquals("Cleiton", oController.getByEmailAndSenha("cleiton@gmail.com", "963852").getNome());
        assertEquals("Sylvio", oController.getByEmailAndSenha("sylvio@gmail.com", "852741").getNome());
    }

    @Test
    public void testRemove() {
        // Cria a classe de controle
        OrientadorController oController = new OrientadorController();

        // Adiciona Orientadores
        oController.add(new Orientador("manuel@gmail.com", "123456", "Manuel"));
        oController.add(new Orientador("cleiton@gmail.com", "123456", "Cleiton"));
        oController.add(new Orientador("sylvio@gmail.com", "123456", "Sylvio"));

        // Recupera Orientadores
        Orientador orientador1 = oController.getByEmailAndSenha("manuel@gmail.com", "123456");
        Orientador orientador2 = oController.getByEmailAndSenha("cleiton@gmail.com", "123456");
        Orientador orientador3 = oController.getByEmailAndSenha("sylvio@gmail.com", "123456");

        // Remove Orientadores
        oController.remove(orientador1);
        oController.remove(orientador2);
        oController.remove(orientador3);

        // Testa
        assertNull(oController.getByEmailAndSenha("manuel@gmail.com", "987654"));
        assertNull(oController.getByEmailAndSenha("cleiton@gmail.com", "963852"));
        assertNull(oController.getByEmailAndSenha("sylvio@gmail.com", "852741"));
    }
}