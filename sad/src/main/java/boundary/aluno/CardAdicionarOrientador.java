package boundary.aluno;

import java.io.IOException;
import java.util.List;

import controller.AreaController;
import controller.NotificacaoController;
import controller.TipoTrabalhoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Area;
import entity.Notificacao;
import entity.Orientador;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;

public class CardAdicionarOrientador extends AnchorPane {
    @FXML
    private Text lblNome;

    @FXML
    private Text lblEmail;

    @FXML
    private VBox box;

    private Orientador orientador;

    public CardAdicionarOrientador(Orientador orientador) {
        this.orientador = orientador;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/card_adicionar_orientador.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            lblNome.setText(orientador.getNome());
            lblEmail.setText(orientador.getEmail());

            List<Area> areas = new AreaController().getByOrientador(orientador);
            
            for (Area area : areas) {
                Text text = new Text(area.getNome());
                text.setStyle("-fx-font-size: 16px;");
                box.getChildren().add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickConvidar(ActionEvent e) {
        Aluno usuario = Home.getAluno();
        Trabalho trabalho = new TrabalhoController().getByAluno(usuario);
        TipoTrabalho tipoTrabalho = new TipoTrabalhoController().getByTrabalho(trabalho);

        Notificacao notificacao = new Notificacao(usuario.getId(), Notificacao.ALUNO, orientador.getId(), Notificacao.ORIENTADOR);

        notificacao.setMensagem( usuario.getNome() + " o convidou para participar do Trabalho de Graduação:\n " +
            "\nTítulo: " + trabalho.getTitulo() + 
            "\nTema: " + trabalho.getTema() + 
            "\nTipo de Trabalaho:" + tipoTrabalho.getNome());

        notificacao.setTipoNotificacao(Notificacao.CONVITE);
        
        new NotificacaoController().add(notificacao);
        Home.setContent((Parent) new TrabalhoGraduacao());
    }
}