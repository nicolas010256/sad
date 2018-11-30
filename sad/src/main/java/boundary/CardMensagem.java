package boundary;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import controller.AnexoController;
import entity.Anexo;
import entity.Mensagem;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class CardMensagem extends AnchorPane{

    @FXML
    private Text lblMensagem;

    @FXML
    private FlowPane pane;

    public CardMensagem(Mensagem mensagem) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/card_mensagem.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblMensagem.setText(mensagem.getConteudo());

            List<Anexo> anexos = new AnexoController().getByMensagem(mensagem);

            for (Anexo anexo : anexos) {
                TextoAnexo text = new TextoAnexo(anexo);
                text.setOnMouseClicked((e) -> {
                    FileChooser fc = new FileChooser();
                    fc.setTitle("Salvar...");
                    fc.setInitialFileName(anexo.getNome());
                    FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(anexo.getTipo(), "*." + anexo.getTipo());
                    fc.getExtensionFilters().add(filter);
                    File file = fc.showSaveDialog(getScene().getWindow());

                    byte[] arquivo = new AnexoController().getArquivo(anexo);

                    try {
                        FileUtils.writeByteArrayToFile(file, arquivo);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
                pane.getChildren().add(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}