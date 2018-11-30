package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.MensagemController;
import entity.Atividade;
import entity.Mensagem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Atividad extends BorderPane {
    @FXML
    private Text lblTitulo;

    @FXML
    private Text lblDescricao;

    @FXML
    private TextArea txtMensagem;

    @FXML
    private VBox box;

    private Atividade atividade;

    public Atividad(Atividade atividade) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/atividade.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            this.atividade = atividade;

            lblTitulo.setText(atividade.getTitulo());
            lblDescricao.setText(atividade.getDescricao());

            List<Mensagem> mensagens = new MensagemController().getByAtividade(atividade);

            for (Mensagem mensagem : mensagens) {
                box.getChildren().add(new CardMensagem(mensagem));
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickSalvar(ActionEvent e) {
        String conteudo = txtMensagem.getText();
        Mensagem mensagem = new Mensagem(conteudo);

        new MensagemController().add(mensagem, atividade);

        Home.setContent((Parent) new Atividad(atividade));
    }

}