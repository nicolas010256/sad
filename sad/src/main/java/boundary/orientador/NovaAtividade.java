package boundary.orientador;

import java.io.IOException;

import controller.AtividadeController;
import entity.Atividade;
import entity.Trabalho;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class NovaAtividade extends BorderPane {
    @FXML
    private TextField txtTitulo;

    @FXML
    private TextArea txtDescricao;

    private Trabalho trabalho;

    public NovaAtividade(Trabalho trabalho) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/nova_atividade.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            this.trabalho = trabalho;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickCriar(ActionEvent e) {
        String titulo = txtTitulo.getText();
        String descricao = txtDescricao.getText();

        try {
            if ("".equals(titulo))
                throw new RuntimeException("Campo 'Título' vazio.");
            if ("".equals(descricao))
                throw new RuntimeException("Campo 'Descrição' vazio.");

            Atividade atividade = new Atividade(titulo, descricao, "");

            new AtividadeController().add(atividade, trabalho);

            Home.setContent((Parent) new Atividades(trabalho));

        } catch (RuntimeException err) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText(err.getMessage());
            alert.showAndWait();
        }
    }
}