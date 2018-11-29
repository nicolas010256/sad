package boundary.orientador;

import java.io.IOException;
import java.util.List;

import boundary.AlterarSenha;
import controller.AreaController;
import controller.OrientadorController;
import entity.Area;
import entity.Orientador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Perfil extends BorderPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblEmail;

    @FXML
    private VBox box;

    public Perfil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/perfil.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();

            Orientador orientador = Home.getOrientador();        

            lblNome.setText(orientador.getNome());
            lblEmail.setText(orientador.getEmail());

            List<Area> areas = new AreaController().getByOrientador(orientador);

            for (Area area : areas) {
                Text text = new Text(area.getNome());
                text.setFill(Color.WHITE);
                text.setStyle("-fx-font-size: 16px");
                box.getChildren().add(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAlterarSenha(MouseEvent e) {
        Orientador orientador = Home.getOrientador();

        AlterarSenha altSenha = new AlterarSenha(getScene().getWindow(), orientador);
        if (altSenha.getStatus()) {
            OrientadorController oController = new OrientadorController();
            oController.update(orientador);
        }
        altSenha = null;
    }
}