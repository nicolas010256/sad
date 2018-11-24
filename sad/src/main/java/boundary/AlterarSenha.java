package boundary;

import java.io.IOException;

import entity.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.stage.Window;

public class AlterarSenha {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Usuario usuario;
    private boolean status = false;

    @FXML
    private PasswordField pwdSenha;

    @FXML
    private PasswordField pwdNovaSenha;

    @FXML
    private PasswordField pwdConfSenha;

    public AlterarSenha(Window owner, Usuario usuario) {
        this.usuario = usuario;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/alterar_senha.fxml"));
            loader.setController(this);
            root = (Parent) loader.load();
            scene = new Scene(root);
            stage = new Stage();
            stage.setScene(scene);
            stage.initOwner(owner);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean getStatus() {
        return status;
    }

    @FXML
    protected void clickAlterar(ActionEvent e) {
        String senha = pwdSenha.getText();
        String novaSenha = pwdNovaSenha.getText();
        String confSenha = pwdConfSenha.getText();
        try {
            if ("".equals(senha))
                throw new RuntimeException("Campo 'Senha atual' em branco.");
            if ("".equals(novaSenha))
                throw new RuntimeException("Campo 'Nova senha' em branco.");
            if ("".equals(confSenha))
                throw new RuntimeException("Campo 'Confirmar nova senha' em branco.");
            if (!novaSenha.equals(confSenha))
                throw new RuntimeException("'Nova senha' e 'Confirmar nova senha' não coincidem");
            if (!senha.equals(usuario.getSenha()))
                throw new RuntimeException("Senha atual inválida");

            usuario.setSenha(novaSenha);
            status = true;
            stage.close();
        } catch (RuntimeException err) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText(err.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    protected void clickCancelar(ActionEvent e) {
        stage.close();
    }
}