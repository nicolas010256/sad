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
    private static Parent root;

    private static Aluno aluno;

    @FXML
    private Text lblNome;

    public Home(Aluno aluno) {
        Home.aluno = aluno;

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

    public static void setContent(Parent node) {
        ((BorderPane) root).setCenter(node);
    }

    @FXML
    protected void clickPerfil(MouseEvent e) {
        setContent((Parent) new Perfil());
    }

    @FXML
    protected void clickTrabalho(MouseEvent e) {
        Trabalho trabalho = new TrabalhoController().getByAluno(aluno);

        if (trabalho == null) {
            setContent((Parent) new CriarTrabalho()); 
        } else {
            setContent((Parent) new TrabalhoGraduacao());
        }
    }

    @FXML
    protected void clickNotificacao(MouseEvent e) {
        setContent((Parent) new Notificacoes());
    }

    @FXML
    protected void clickSair(MouseEvent e) {
        Home.aluno = null;
        stage.close();
        new Login();
    }

    public static Aluno getAluno() {
        return aluno;
    }
}