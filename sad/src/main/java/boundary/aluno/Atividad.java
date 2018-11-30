package boundary.aluno;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

import controller.AnexoController;
import controller.MensagemController;
import entity.Anexo;
import entity.Atividade;
import entity.Mensagem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class Atividad extends BorderPane {
    @FXML
    private Text lblTitulo;

    @FXML
    private Text lblDescricao;

    @FXML
    private TextArea txtMensagem;

    @FXML
    private VBox box;

    @FXML
    private HBox boxAnexo;

    private Atividade atividade;

    private List<Anexo> anexos = new ArrayList<Anexo>();

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

        long id = new MensagemController().add(mensagem, atividade);

        mensagem = new MensagemController().get(id);
        AnexoController aController = new AnexoController();
        for (Anexo anexo : anexos) {
            aController.add(anexo, mensagem);
        }

        Home.setContent((Parent) new Atividad(atividade));
    }

    @FXML
    protected void clickAdicionarAnexo(MouseEvent e) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecione um Arquivo");
        File arquivo = fileChooser.showOpenDialog(getScene().getWindow());
        try {
            
            String nome = FilenameUtils.getBaseName(arquivo.getPath());
            String tipo = FilenameUtils.getExtension(arquivo.getPath());

            Anexo anexo = new Anexo(nome, tipo, Files.readAllBytes(arquivo.toPath()));
            anexos.add(anexo);

            TextoAnexo text = new TextoAnexo(anexo);
            text.setOnMouseClicked((event) -> {
                anexos.remove(text.getAnexo());
                boxAnexo.getChildren().remove(text);
            });

            boxAnexo.getChildren().add(text);

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}