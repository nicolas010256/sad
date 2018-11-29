package boundary.aluno;

import java.io.IOException;

import controller.AlunoController;
import controller.NotificacaoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Notificacao;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class CardNotificacao extends AnchorPane{

    @FXML
    private Text lblMensagem;

    @FXML
    private Button btnAceitar;

    private Notificacao notificacao;

    public CardNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/card_notificacao.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblMensagem.setText(notificacao.getMensagem());
            if (notificacao.getTipoNotificacao() != Notificacao.CONVITE)
                btnAceitar.setVisible(false);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAceitar(ActionEvent e) {
        long id = notificacao.getIdRemetente();
        Aluno a = new AlunoController().get(id);

        Trabalho t = new TrabalhoController().getByAluno(a);

        Aluno aluno = Home.getAluno();
        
        new AlunoController().updateTrabalho(aluno, t);

        notificacao.setStatus(Notificacao.READ);

        new NotificacaoController().update(notificacao);

        Home.setContent((Parent) new Perfil());
    }

    @FXML
    protected void clickDescartar(ActionEvent e) {

    }
}