package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.NotificacaoController;
import entity.Aluno;
import entity.Notificacao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Notificacoes extends BorderPane {

    @FXML
    private VBox box;

    public Notificacoes() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/notificacoes.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            Aluno aluno = Home.getAluno();
            List<Notificacao> notificacoes = new NotificacaoController().getByAluno(aluno);

            for (Notificacao notificacao : notificacoes) {
                box.getChildren().add(new CardNotificacao(notificacao));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}