package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.AlunoController;
import controller.AreaController;
import controller.OrientadorController;
import entity.Aluno;
import entity.Area;
import entity.Orientador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class AdicionarOrientador extends BorderPane {
    @FXML
    private Text lblTitulo;
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField txtNome;

    @FXML
    private VBox box;

    private List<Area> areas;

    public AdicionarOrientador() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/adicionar.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblTitulo.setText("Adicionar Orientador");
            comboBox.setPromptText("Selecione uma área de atuação");
            txtNome.setPromptText("Digite o nome do orientador aqui...");

            areas = new AreaController().getAll();
            comboBox.getItems().add("Todas");

            for (Area area : areas) {
                comboBox.getItems().add(area.getNome());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void actionGet(ActionEvent e) {
        box.getChildren().clear();
        String nome = txtNome.getText();
        int index = comboBox.getSelectionModel().getSelectedIndex();
        if (index == -1) return;

        List<Orientador> orientadores = null;

        if (index == 0) {
            orientadores = new OrientadorController().getByAreaAndNome(null, nome);
        } else {
            orientadores = new OrientadorController().getByAreaAndNome(areas.get(index - 1), nome);
        }

        for (Orientador orientador : orientadores) {
            box.getChildren().add(new CardAdicionarOrientador(orientador));
        }
    }
}