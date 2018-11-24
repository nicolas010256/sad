package boundary;

import java.io.IOException;

import controller.AlunoController;
import controller.OrientadorController;
import entity.Aluno;
import entity.Orientador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;

public class Login {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField pwdSenha;

    @FXML
    private ComboBox cbTipoUsuario;

    public Login() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/login.fxml"));
            loader.setController(this);
            root = (Parent) loader.load();
            scene = new Scene(root);
            stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
    }

    @FXML
    protected void clickEntrar(ActionEvent e) {
        String email = txtEmail.getText();
        String senha = pwdSenha.getText();
        int tipo = cbTipoUsuario.getSelectionModel().getSelectedIndex();

        if (tipo != -1) {
            if (tipo == 0) {
                AlunoController aController = new AlunoController();
                Aluno aluno = aController.getByEmailAndSenha(email, senha);
                if (aluno != null) {
                    System.out.println(aluno.getNome());
                }
            } else {
                OrientadorController cController = new OrientadorController();
                Orientador orientador = cController.getByEmailAndSenha(email, senha);
                System.out.println(orientador.getNome());
            }
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Escolha um tipo de usuário");
            alert.showAndWait();
        }
    }
}