package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

import entity.Aluno;

public class AlunoControllerTest {

    @Test
    public void testAddAndGet() {
        // Cria alunos
        Aluno aluno1 = new Aluno("tavinho@gmail.com", "123456", "Gustavo");
        Aluno aluno2 = new Aluno("henrique@gmail.com", "123456", "Henrique");
        Aluno aluno3 = new Aluno("lucas@gmail.com", "123456", "Lucas");

        //Cria controller
        AlunoController aController = new AlunoController();

        // Adiciona alunos
        aController.add(aluno1);
        aController.add(aluno2);
        aController.add(aluno3);


        // Recupera alunos
        Aluno a1 = aController.get(3);
        Aluno a2 = aController.get(2);
        Aluno a3 = aController.get(1);

        // Testa se os alunos foram recuperados corretamente
        assertEquals("lucas@gmail.com", a1.getEmail());
        assertEquals("123456", a1.getSenha());
        assertEquals("Lucas", a1.getNome());

        assertEquals("henrique@gmail.com", a2.getEmail());
        assertEquals("123456", a2.getSenha());
        assertEquals("Henrique", a2.getNome());

        assertEquals("tavinho@gmail.com", a3.getEmail());
        assertEquals("123456", a3.getSenha());
        assertEquals("Gustavo", a3.getNome());
    }

    @Test
    public void testGetAll() {
        // Cria alunos
        Aluno aluno1 = new Aluno("tavinho@gmail.com", "123456", "Gustavo");
        Aluno aluno2 = new Aluno("henrique@gmail.com", "123456", "Henrique");
        Aluno aluno3 = new Aluno("lucas@gmail.com", "123456", "Lucas");

        //Cria controller
        AlunoController aController = new AlunoController();

        // Adiciona alunos
        aController.add(aluno1);
        aController.add(aluno2);
        aController.add(aluno3);

        // Recupera todos os alunos
        List<Aluno> alunos = aController.getAll();
        Aluno a0 = alunos.get(0);
        Aluno a1 = alunos.get(1);
        Aluno a2 = alunos.get(2);

        // Testa alunos
        assertEquals("tavinho@gmail.com", a0.getEmail());
        assertEquals("henrique@gmail.com", a1.getEmail());
        assertEquals("lucas@gmail.com", a2.getEmail());

    }

    @Test
    public void testGetByEmailAndSenha() {
        // Cria alunos
        Aluno aluno1 = new Aluno("tavinho@gmail.com", "123456", "Gustavo");
        Aluno aluno2 = new Aluno("henrique@gmail.com", "123456", "Henrique");
        Aluno aluno3 = new Aluno("lucas@gmail.com", "123456", "Lucas");

        //Cria controller
        AlunoController aController = new AlunoController();

        // Adiciona alunos
        aController.add(aluno1);
        aController.add(aluno2);
        aController.add(aluno3);

        // Testa alunos
        assertEquals("Gustavo", aController.getByEmailAndSenha("tavinho@gmail.com", "123456").getNome());
        assertEquals("Henrique", aController.getByEmailAndSenha("henrique@gmail.com", "123456").getNome());
        assertEquals("Lucas", aController.getByEmailAndSenha("lucas@gmail.com", "123456").getNome());
    }

    @Test
    public void testGetByTrabalho() {
        // TO DO
    }

    @Test
    public void testUpdate() {
        //Cria controller
        AlunoController aController = new AlunoController();

        // Adiciona aluno
        aController.add(new Aluno("tavinho@gmail.com", "123456", "Gustavo"));

        // Recupera aluno
        Aluno aluno = aController.getByEmailAndSenha("tavinho@gmail.com", "123456");

        // Altera nome do aluno
        aluno.setNome("Gustavo Alves");

        // Chama método update da classe de controle
        aController.update(aluno);

        // Testa alunos
        assertEquals("Gustavo Alves", aController.get(aluno.getId()).getNome());
    }

    @Test
    public void testRemove() {
        //Cria controller
        AlunoController aController = new AlunoController();

        // Adiciona alunos
        aController.add(new Aluno("tavinho@gmail.com", "123456", "Gustavo"));
        aController.add(new Aluno("henrique@gmail.com", "123456", "Henrique"));
        aController.add(new Aluno("lucas@gmail.com", "123456", "Lucas"));

        // Recupera aluno
        Aluno aluno = aController.getByEmailAndSenha("tavinho@gmail.com", "123456");

        // Remove aluno
        aController.remove(aluno);

        // Testa alunos
        assertNull(aController.getByEmailAndSenha("tavinho@gmail.com", "123456"));
    }
}