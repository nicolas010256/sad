package boundary.orientador;

import java.io.IOException;
import java.util.List;

import controller.MensagemController;
import entity.Atividade;
import entity.Mensagem;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Atividad extends BorderPane {
    @FXML
    private Text lblTitulo;

    @FXML
    private Text lblDescricao;

    @FXML
    private VBox box;

    public Atividad(Atividade atividade) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/atividade.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblTitulo.setText(atividade.getTitulo());
            lblDescricao.setText(atividade.getDescricao());

            List<Mensagem> mensagens = new MensagemController().getByAtividade(atividade);

            for (Mensagem mensagem : mensagens) {
                box.getChildren().add(new CardMensagem(mensagem));
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}