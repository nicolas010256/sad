package boundary.aluno;

import java.io.IOException;

import boundary.AlterarSenha;
import controller.AlunoController;
import controller.CursoController;
import controller.OrientadorController;
import controller.TipoTrabalhoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Curso;
import entity.Orientador;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.MouseEvent;

public class Perfil extends BorderPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblCurso;

    @FXML
    private Text lblEmail;

    @FXML
    private Text lblNotaTG1;

    @FXML
    private Text lblNotaTG2;

    @FXML
    private Text lblTitulo;

    @FXML
    private Text lblTema;

    @FXML
    private Text lblTipoTrabalho;

    @FXML
    private Text lblOrientador;

    public Perfil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/perfil.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();

            Aluno aluno = Home.getAluno();
            Curso curso = new CursoController().getByAluno(aluno);
            Trabalho trabalho = new TrabalhoController().getByAluno(aluno);
            TipoTrabalho tipoTrabalho = new TipoTrabalhoController().getByTrabalho(trabalho);
            Orientador orientador = new OrientadorController().getByTrabalho(trabalho);            

            lblNome.setText(aluno.getNome());
            lblCurso.setText(curso != null ? curso.getNome() : "–");
            lblEmail.setText(aluno.getEmail());
            lblNotaTG1.setText(String.valueOf(aluno.getNotaTG1()));
            lblNotaTG2.setText(String.valueOf(aluno.getNotaTG2()));
            lblTitulo.setText(trabalho != null ? trabalho.getTitulo() : "–");
            lblTema.setText(trabalho != null ? trabalho.getTema() : "–");
            lblTipoTrabalho.setText(tipoTrabalho != null ? tipoTrabalho.getNome() : "–");
            lblOrientador.setText(orientador != null ? orientador.getNome() : "–");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAlterarSenha(MouseEvent e) {
        Aluno aluno = Home.getAluno();

        AlterarSenha altSenha = new AlterarSenha(getScene().getWindow(), aluno);
        if (altSenha.getStatus()) {
            AlunoController aController = new AlunoController();
            aController.update(aluno);
        }
        altSenha = null;
    }
}