package boundary.aluno;


import entity.Anexo;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class TextoAnexo extends Text {
    
    private Anexo anexo;

    public TextoAnexo(Anexo anexo) {
        super();
        this.anexo = anexo;
        this.setText(anexo.getNome());
        this.setFill(Color.web("#4D70FF"));
        this.setStyle("-fx-font-size: 14px");
    }

    public Anexo getAnexo() {
        return anexo;
    }
}