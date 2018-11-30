package boundary.orientador;

import java.io.IOException;

import entity.Mensagem;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class CardMensagem extends AnchorPane{

    @FXML
    private Text lblMensagem;

    @FXML
    private FlowPane pane;

    public CardMensagem(Mensagem mensagem) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/card_mensagem.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblMensagem.setText(mensagem.getConteudo());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}