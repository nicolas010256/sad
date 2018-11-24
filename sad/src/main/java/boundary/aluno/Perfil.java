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
    private Aluno aluno;

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

    public Perfil(Aluno aluno) {
        this.aluno = aluno;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/perfil.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();

            Curso curso = aluno.getCurso();
            Trabalho trabalho = aluno.getTrabalho();
            TipoTrabalho tipoTrabalho = null;
            Orientador orientador = null;

            if (curso == null) {
                CursoController cController = new CursoController();
                curso = cController.getByAluno(aluno);
                aluno.setCurso(curso);
            }

            if (trabalho == null) {
                TrabalhoController tController = new TrabalhoController();
                trabalho = tController.getByAluno(aluno);
                aluno.setTrabalho(trabalho);
            }

            if (trabalho != null) {
                orientador = trabalho.getOrientador();
                tipoTrabalho = trabalho.getTipoTrabalho();
                if (orientador == null) {
                    OrientadorController oController = new OrientadorController();
                    orientador = oController.getByTrabalho(trabalho);
                    trabalho.setOrientador(orientador);
                }
                if (aluno.getTrabalho().getTipoTrabalho() == null) {
                    TipoTrabalhoController ttController = new TipoTrabalhoController();
                    tipoTrabalho = ttController.getByTrabalho(trabalho);

                }
            }
            

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
        AlterarSenha altSenha = new AlterarSenha(getScene().getWindow(), aluno);
        if (altSenha.getStatus()) {
            AlunoController aController = new AlunoController();
            aController.update(aluno);
        }
        altSenha = null;
    }
}