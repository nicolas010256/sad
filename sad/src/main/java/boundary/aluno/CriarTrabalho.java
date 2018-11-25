package boundary.aluno;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import controller.TipoTrabalhoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;

public class CriarTrabalho extends BorderPane {
    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtTema;
    
    @FXML
    private TextArea txtMetodologia;

    @FXML
    private TextArea txtRelevancia;

    @FXML
    private ComboBox<String> cbTipoTrabalho;

    @FXML
    private List<TipoTrabalho> tipos;

    private Aluno aluno;

    public CriarTrabalho(Aluno aluno) {
        this.aluno = aluno;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/criar_trabalho.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            TipoTrabalhoController ttController = new TipoTrabalhoController();
            tipos = ttController.getAll();

            for (TipoTrabalho tipo : tipos) {
                cbTipoTrabalho.getItems().add(tipo.getNome());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickCriar(ActionEvent e) {
        String titulo = txtTitulo.getText();
        String tema = txtTema.getText();
        String metodologia = txtMetodologia.getText();
        String relevancia = txtRelevancia.getText();
        int indexTipo = cbTipoTrabalho.getSelectionModel().getSelectedIndex();

        try {
            if ("".equals(titulo))
                throw new RuntimeException("Campo 'Título' vazio.");
            if ("".equals(tema))
                throw new RuntimeException("Campo 'Tema' vazio.");
            if ("".equals(metodologia))
                throw new RuntimeException("Campo 'Metodologia' vazio.");
            if ("".equals(relevancia))
                throw new RuntimeException("Campo 'Relevância' vazio.");
            if (indexTipo == -1)
                throw new RuntimeException("Escolha um tipo de trabalho.");

            Date hoje = Calendar.getInstance().getTime();
            Trabalho trabalho = new Trabalho(tema, titulo, metodologia, relevancia, hoje);
            trabalho.setTipoTrabalho(tipos.get(indexTipo));
            TrabalhoController tController = new TrabalhoController();
            tController.add(trabalho, aluno);
            aluno.setTrabalho(tController.getByAluno(aluno));
        } catch (RuntimeException err) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText(err.getMessage());
            alert.showAndWait();
        }
    }
}