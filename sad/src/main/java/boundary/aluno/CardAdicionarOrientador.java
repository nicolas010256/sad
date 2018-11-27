package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.AreaController;
import controller.CursoController;
import entity.Aluno;
import entity.Area;
import entity.Curso;
import entity.Orientador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;

public class CardAdicionarOrientador extends AnchorPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblEmail;

    @FXML
    private VBox box;

    private Orientador orientador;

    public CardAdicionarOrientador(Orientador orientador) {
        this.orientador = orientador;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/card_adicionar_orientador.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblNome.setText(orientador.getNome());
            lblEmail.setText(orientador.getEmail());

            List<Area> areas = new AreaController().getByOrientador(orientador);
            
            for (Area area : areas) {
                Text text = new Text(area.getNome());
                text.setStyle("-fx-font-size: 16px;");
                box.getChildren().add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickConvidar(ActionEvent e) {

    }
}