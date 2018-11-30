package boundary.aluno;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import controller.AlunoController;
import controller.CursoController;
import controller.NotificacaoController;
import controller.TipoTrabalhoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Curso;
import entity.Notificacao;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class CardAdicionarIntegrante extends AnchorPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblEmail;

    @FXML
    private Text lblCurso;

    @FXML
    private Circle image;

    private Aluno aluno;

    public CardAdicionarIntegrante(Aluno aluno) {
        this.aluno = aluno;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/card_adicionar_integrante.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblNome.setText(aluno.getNome());
            lblEmail.setText(aluno.getEmail());

            Curso curso = new CursoController().getByAluno(aluno);
            
            lblCurso.setText(curso != null ? curso.getNome() : "–");

            new Thread(() -> {
                byte[] foto = new AlunoController().getFoto(aluno);
                Platform.runLater(() -> {
                    if (foto != null) {
                        image.setFill(new ImagePattern(new Image(new ByteArrayInputStream(foto))));
                    } else {
                        image.setFill(new ImagePattern(new Image(getClass().getResource("../../images/fotoAluno.png").toExternalForm())));
                    }
                });
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickConvidar(ActionEvent e) {
        Aluno usuario = Home.getAluno();
        Trabalho trabalho = new TrabalhoController().getByAluno(usuario);
        TipoTrabalho tipoTrabalho = new TipoTrabalhoController().getByTrabalho(trabalho);

        Notificacao notificacao = new Notificacao(usuario.getId(), Notificacao.ALUNO, aluno.getId(), Notificacao.ALUNO);

        notificacao.setMensagem( usuario.getNome() + " o convidou para participar do Trabalho de Graduação:\n " +
            "\nTítulo: " + trabalho.getTitulo() + 
            "\nTema: " + trabalho.getTema() + 
            "\nTipo de Trabalaho:" + tipoTrabalho.getNome());

        notificacao.setTipoNotificacao(Notificacao.CONVITE);
        
        new NotificacaoController().add(notificacao);

        Home.setContent((Parent) new TrabalhoGraduacao());
    }
}