package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.AlunoController;
import controller.CursoController;
import entity.Aluno;
import entity.Curso;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class AdicionarIntegrante extends BorderPane {
    @FXML
    private Text lblTitulo;
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField txtNome;

    @FXML
    private VBox box;

    private List<Curso> cursos;


    public AdicionarIntegrante() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/adicionar.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblTitulo.setText("Adicionar Integrante");
            comboBox.setPromptText("Selecione um curso");
            txtNome.setPromptText("Digite o nome do aluno aqui...");

            cursos = new CursoController().getAll();
            comboBox.getItems().add("Todos");

            for (Curso curso : cursos) {
                comboBox.getItems().add(curso.getNome());
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
        List<Aluno> alunos = null;
        if (index == -1)
            return ;
        if (index == 0) {
            alunos = new AlunoController().getByCursoAndNome(null, nome);
        } else {
            alunos = new AlunoController().getByCursoAndNome(cursos.get(index -1 ), nome);
        }

        for (Aluno aluno : alunos) {
            box.getChildren().add(new CardAdicionarIntegrante(aluno));
        }
    }
}