package boundary.orientador;

import java.io.IOException;
import java.util.List;

import controller.AlunoController;
import controller.TipoTrabalhoController;
import entity.Aluno;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;

public class CardTrabalho extends AnchorPane{

    @FXML
    private Text lblTitulo;
    
    @FXML
    private Text lblTema;
    
    @FXML
    private Text lblTipo;

    @FXML
    private VBox box;

    private Trabalho trabalho;

    public CardTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/card_trabalho.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            TipoTrabalho tipo = new TipoTrabalhoController().getByTrabalho(trabalho);

            lblTitulo.setText(trabalho.getTitulo());
            lblTema.setText(trabalho.getTema());
            lblTipo.setText(tipo.getNome());
            
            List<Aluno> alunos  = new AlunoController().getByTrabalho(trabalho);

            for (Aluno aluno : alunos) {
                Text text = new Text(aluno.getNome());
                text.setStyle("-fx-font-size: 18px");
                box.getChildren().add(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAbrirTrabalho(MouseEvent e) {
        Home.setContent((Parent) new TrabalhoGraduacao(trabalho));
    }
}