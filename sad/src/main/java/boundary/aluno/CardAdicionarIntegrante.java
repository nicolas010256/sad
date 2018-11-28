package boundary.aluno;

import java.io.IOException;

import controller.CursoController;
import controller.NotificacaoController;
import entity.Aluno;
import entity.Curso;
import entity.Notificacao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class CardAdicionarIntegrante extends AnchorPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblEmail;

    @FXML
    private Text lblCurso;

    private Aluno usuario;
    private Aluno aluno;

    public CardAdicionarIntegrante(Aluno usuario, Aluno aluno) {
        this.usuario = usuario;
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickConvidar(ActionEvent e) {
        Notificacao notificacao = new Notificacao(usuario.getId(), Notificacao.ALUNO, aluno.getId(), Notificacao.ALUNO);
        notificacao.setMensagem( usuario.getNome() + " o convidou para participar do Trabalho de Graduação:\n " +
            "\nTítulo: " + usuario.getTrabalho().getTitulo() + 
            "\nTema: " + usuario.getTrabalho().getTema() + 
            "\nTipo de Trabalaho:" + usuario.getTrabalho().getTipoTrabalho().getNome());
        notificacao.setTipoNotificacao(Notificacao.CONVITE);
        new NotificacaoController().add(notificacao);
    }
}