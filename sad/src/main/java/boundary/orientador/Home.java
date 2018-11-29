package boundary.orientador;

import java.io.IOException;

import boundary.Login;
import entity.Orientador;
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

    private static Orientador orientador;

    @FXML
    private Text lblNome;

    public Home(Orientador orientador) {
        Home.orientador = orientador;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/home.fxml"));
            loader.setController(this);

            root = (Parent) loader.load();

            scene = new Scene(root, 1270, 710);

            lblNome.setText(orientador.getNome());

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
        setContent((Parent) new TrabalhosGraduacao());
    }

    @FXML
    protected void clickNotificacao(MouseEvent e) {
        setContent((Parent) new Notificacoes());
    }

    @FXML
    protected void clickSair(MouseEvent e) {
        Home.orientador = null;
        stage.close();
        new Login();
    }

    public static Orientador getOrientador() {
        return orientador;
    }
}