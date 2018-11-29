package boundary.orientador;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import controller.AlunoController;
import controller.BancaController;
import controller.TipoTrabalhoController;
import entity.Aluno;
import entity.Banca;
import entity.TipoTrabalho;
import entity.Trabalho;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
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
    private Text lblLocal;

    @FXML
    private Text lblData;

    @FXML
    private Text lblHora;

    @FXML
    private Text lblNota;

    @FXML
    private Text lblNotaTG1;

    @FXML
    private Text lblNotaTG2;

    @FXML
    private TextField txtTG1;

    @FXML
    private TextField txtTG2;

    @FXML
    private TextField txtLocal;

    @FXML
    private TextField txtData;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtNota;

    private Trabalho trabalho;

    public TrabalhoGraduacao(Trabalho trabalho) {       
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../fxml/orientador/trabalho.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();

            this.trabalho = trabalho;

            TipoTrabalho tipoTrabalho = new TipoTrabalhoController().getByTrabalho(trabalho);

            List<Text> t = new ArrayList<Text>();
            t.add(lblIntegrante1);
            t.add(lblIntegrante2);
            t.add(lblIntegrante3);
            List<Aluno> integrantes = new AlunoController().getByTrabalho(trabalho);
            for (int i = 0; i < integrantes.size(); i++) {
                t.get(i).setText(integrantes.get(i).getNome());
            }


            lblTitulo.setText(trabalho.getTitulo());
            lblTema.setText(trabalho.getTema());
            lblTipoTrabalho.setText(tipoTrabalho != null ? tipoTrabalho.getNome() : "–");
            lblMetodologia.setText(trabalho.getMetodologia());
            lblRelevancia.setText(trabalho.getRelevancia());

            Banca banca = new BancaController().getByTrabalho(trabalho);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            lblLocal.setText(banca != null ? banca.getLocal() : "–");
            lblData.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");
            
            txtLocal.setText(banca != null ? banca.getLocal() : "–");
            txtData.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");

            dateFormat = new SimpleDateFormat("HH:mm");

            lblHora.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");
            lblNota.setText(banca != null ? String.valueOf(banca.getNota()) : "–");

            lblNotaTG1.setText(String.valueOf(integrantes.get(0).getNotaTG1()));
            lblNotaTG2.setText(String.valueOf(integrantes.get(0).getNotaTG2()));

            txtHora.setText(banca != null ? dateFormat.format(banca.getDataHorario()) : "–");
            txtNota.setText(banca != null ? String.valueOf(banca.getNota()) : "–");

            txtTG1.setText(String.valueOf(integrantes.get(0).getNotaTG1()));
            txtTG2.setText(String.valueOf(integrantes.get(0).getNotaTG2()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void clickAlterarNota(ActionEvent e) {
        if (txtTG1.isVisible()) { 
            txtTG1.setVisible(false);
            txtTG2.setVisible(false); 
        } else {
            txtTG1.setVisible(true);
            txtTG2.setVisible(true); 
        }
    }

    @FXML
    protected void clickAlterarBanca(ActionEvent e) {
        if (txtLocal.isVisible()) {
            txtLocal.setVisible(false);
            txtData.setVisible(false);
            txtHora.setVisible(false);
            txtNota.setVisible(false);
        } else {
            txtLocal.setVisible(true);
            txtData.setVisible(true);
            txtHora.setVisible(true);
            txtNota.setVisible(true);
        }
    }

    
}