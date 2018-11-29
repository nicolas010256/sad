package boundary.aluno;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import controller.AlunoController;
import controller.BancaController;
import controller.OrientadorController;
import controller.TipoTrabalhoController;
import controller.TrabalhoController;
import entity.Aluno;
import entity.Banca;
import entity.Orientador;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class TrabalhoGraduacao extends BorderPane {
    @FXML
    private Text lblTitulo;

    @FXML
    private Text lblTema;

    @FXML
    private Text lblTipoTrabalho;

    @FXML
    private Text lblMetodologia;

    @FXML
    private Text lblRelevancia;

    @FXML
    private Text lblIntegrante1;

    @FXML
    private Text lblIntegrante2;

    @FXML
    private Text lblIntegrante3;

    @FXML
    private Text lblOrientador;

    @FXML
    private Text lblLocal;

    @FXML
    private Text lblData;

    @FXML
    private Text lblHora;

    @FXML
    private Text lblNota;

    @FXML
    private Button btnAdicionarIntegrante;

    @FXML
    private Button btnAdicionarOrientador;

    public TrabalhoGraduacao() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/aluno/trabalho_graduacao.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            Aluno aluno = Home.getAluno();
            Trabalho trabalho = new TrabalhoController().getByAluno(aluno);

            TipoTrabalho tipoTrabalho = new TipoTrabalhoController().getByTrabalho(trabalho);

            List<Text> t = new ArrayList<Text>();
            t.add(lblIntegrante1);
            t.add(lblIntegrante2);
            t.add(lblIntegrante3);
            List<Aluno> integrantes = new AlunoController().getByTrabalho(trabalho);
            for (int i = 0; i < integrantes.size(); i++) {
                t.get(i).setText(integrantes.get(i).getNome());
            }

            if (integrantes.size() == 3)
                btnAdicionarIntegrante.setVisible(false);



            lblTitulo.setText(trabalho.getTitulo());
            lblTema.setText(trabalho.getTema());
            lblTipoTrabalho.setText(tipoTrabalho != null ? tipoTrabalho.getNome() : "–");
            lblMetodologia.setText(trabalho.getMetodologia());
            lblRelevancia.setText(trabalho.getRelevancia());

            Orientador orientador = new OrientadorController().getByTrabalho(trabalho);

            if (orientador != null)
                btnAdicionarOrientador.setVisible(false);

            lblOrientador.setText(orientador != null ? orientador.getNome() : "–");

            Banca banca = new BancaController().getByTrabalho(trabalho);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            lblLocal.setText(banca != null ? banca.getLocal() : "–");
            lblData.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");

            dateFormat = new SimpleDateFormat("HH:mm");

            lblHora.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");
            lblNota.setText(banca != null ? String.valueOf(banca.getNota()) : "–");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAdicionarIntegrante(ActionEvent e) {
        ((BorderPane) getScene().getRoot()).setCenter(new AdicionarIntegrante());
    }

    @FXML
    protected void clickAdicionarOrientador(ActionEvent e) {
        ((BorderPane) getScene().getRoot()).setCenter(new AdicionarOrientador());
    }
}