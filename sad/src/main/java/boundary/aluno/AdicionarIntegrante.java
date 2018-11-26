package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.AlunoController;
import entity.Aluno;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AdicionarIntegrante extends BorderPane {
    @FXML
    private ComboBox<String> cbCurso;

    @FXML
    private TextField txtNome;

    @FXML
    private VBox box;

    public AdicionarIntegrante() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/adicionar_integrante.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            List<Aluno> alunos = new AlunoController().getAll();

            for (Aluno aluno : alunos) {
                box.getChildren().add(new CardAdicionarIntegrante(aluno));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}