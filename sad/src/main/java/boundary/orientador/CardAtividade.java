package boundary.orientador;

import java.io.IOException;

import entity.Atividade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class CardAtividade extends AnchorPane{

    @FXML
    private Text lblTitulo;

    private Atividade atividade;

    public CardAtividade(Atividade atividade) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/card_atividade.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            this.atividade = atividade;

            lblTitulo.setText(atividade.getTitulo());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAbrirAtividade(MouseEvent e) {
        Home.setContent((Parent) new Atividad(atividade));
    }
}