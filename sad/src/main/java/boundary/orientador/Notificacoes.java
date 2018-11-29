package boundary.orientador;

import java.io.IOException;
import java.util.List;

import controller.NotificacaoController;
import entity.Notificacao;
import entity.Orientador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Notificacoes extends BorderPane {

    @FXML
    private VBox box;

    public Notificacoes() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/notificacoes.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            Orientador orientador = Home.getOrientador();
            List<Notificacao> notificacoes = new NotificacaoController().getByOrientador(orientador);

            for (Notificacao notificacao : notificacoes) {
                box.getChildren().add(new CardNotificacao(notificacao));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}