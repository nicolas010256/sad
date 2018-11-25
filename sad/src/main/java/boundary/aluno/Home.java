package boundary.aluno;

import java.io.IOException;

import boundary.Login;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Aluno aluno;

    @FXML
    private Text lblNome;

    public Home(Aluno aluno) {
        this.aluno = aluno;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/home.fxml"));
            loader.setController(this);

            root = (Parent) loader.load();

            scene = new Scene(root, 1270, 710);

            lblNome.setText(aluno.getNome());

            stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setContent(Parent node) {
        ((BorderPane) root).setCenter(node);
    }

    @FXML
    protected void clickPerfil(MouseEvent e) {
        setContent((Parent) new Perfil(aluno));
    }

    @FXML
    protected void clickTrabalho(MouseEvent e) {
        Trabalho trabalho = aluno.getTrabalho();
        if (trabalho == null) {
            trabalho = new TrabalhoController().getByAluno(aluno);
            aluno.setTrabalho(trabalho);
        }
        if (trabalho == null) {
            setContent((Parent) new CriarTrabalho(aluno)); 
        }
    }

    @FXML
    protected void clickNotificacao(MouseEvent e) {

    }

    @FXML
    protected void clickSair(MouseEvent e) {
        stage.close();
        new Login();
    }
}