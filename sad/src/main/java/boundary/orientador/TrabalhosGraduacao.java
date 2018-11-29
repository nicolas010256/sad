package boundary.orientador;

import java.io.IOException;
import java.util.List;

import controller.TrabalhoController;
import entity.Orientador;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class TrabalhosGraduacao extends BorderPane {

    @FXML
    private VBox box;

    public TrabalhosGraduacao() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/trabalhos.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            Orientador orientador = Home.getOrientador();
            List<Trabalho> trabalhos = new TrabalhoController().getByOrientador(orientador);

            for (Trabalho trabalho : trabalhos) {
                box.getChildren().add(new CardTrabalho(trabalho));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}