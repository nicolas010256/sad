package boundary.orientador;

import java.io.IOException;
import java.util.List;

import controller.AtividadeController;
import entity.Atividade;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Atividades extends BorderPane {

    @FXML
    private VBox box;

    private Trabalho trabalho;

    public Atividades(Trabalho trabalho) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/atividades.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            this.trabalho = trabalho;

            List<Atividade> atividades = new AtividadeController().getByTrabalho(trabalho);

            for (Atividade atividade : atividades) {
                box.getChildren().add(new CardAtividade(atividade));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickNovaAtividade(MouseEvent e) {
        Home.setContent((Parent) new NovaAtividade(trabalho));
    }
}