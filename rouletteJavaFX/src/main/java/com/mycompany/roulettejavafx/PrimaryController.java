/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

package com.mycompany.roulettejavafx;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import static javafx.scene.paint.Color.color;
import javafx.util.Duration;

public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;


    @FXML // fx:id="GPaneCronologia"
    private GridPane GPaneCronologia; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn0"
    private Button btn0; // Value injected by FXMLLoader

    @FXML // fx:id="btn1"
    private Button btn1; // Value injected by FXMLLoader

    @FXML // fx:id="btn10"
    private Button btn10; // Value injected by FXMLLoader

    @FXML // fx:id="btn11"
    private Button btn11; // Value injected by FXMLLoader

    @FXML // fx:id="btn12"
    private Button btn12; // Value injected by FXMLLoader

    @FXML // fx:id="btn13"
    private Button btn13; // Value injected by FXMLLoader

    @FXML // fx:id="btn13_24"
    private Button btn13_24; // Value injected by FXMLLoader

    @FXML // fx:id="btn14"
    private Button btn14; // Value injected by FXMLLoader

    @FXML // fx:id="btn15"
    private Button btn15; // Value injected by FXMLLoader

    @FXML // fx:id="btn16"
    private Button btn16; // Value injected by FXMLLoader

    @FXML // fx:id="btn17"
    private Button btn17; // Value injected by FXMLLoader

    @FXML // fx:id="btn18"
    private Button btn18; // Value injected by FXMLLoader

    @FXML // fx:id="btn19"
    private Button btn19; // Value injected by FXMLLoader

    @FXML // fx:id="btn19_36"
    private Button btn19_36; // Value injected by FXMLLoader

    @FXML // fx:id="btn1_12"
    private Button btn1_12; // Value injected by FXMLLoader

    @FXML // fx:id="btn1_18"
    private Button btn1_18; // Value injected by FXMLLoader

    @FXML // fx:id="btn2"
    private Button btn2; // Value injected by FXMLLoader

    @FXML // fx:id="btn20"
    private Button btn20; // Value injected by FXMLLoader

    @FXML // fx:id="btn21"
    private Button btn21; // Value injected by FXMLLoader

    @FXML // fx:id="btn22"
    private Button btn22; // Value injected by FXMLLoader

    @FXML // fx:id="btn23"
    private Button btn23; // Value injected by FXMLLoader

    @FXML // fx:id="btn24"
    private Button btn24; // Value injected by FXMLLoader

    @FXML // fx:id="btn25"
    private Button btn25; // Value injected by FXMLLoader

    @FXML // fx:id="btn25_36"
    private Button btn25_36; // Value injected by FXMLLoader

    @FXML // fx:id="btn26"
    private Button btn26; // Value injected by FXMLLoader

    @FXML // fx:id="btn27"
    private Button btn27; // Value injected by FXMLLoader

    @FXML // fx:id="btn28"
    private Button btn28; // Value injected by FXMLLoader

    @FXML // fx:id="btn29"
    private Button btn29; // Value injected by FXMLLoader

    @FXML // fx:id="btn2a1_1"
    private Button btn2a1_1; // Value injected by FXMLLoader

    @FXML // fx:id="btn2a1_2"
    private Button btn2a1_2; // Value injected by FXMLLoader

    @FXML // fx:id="btn2a1_3"
    private Button btn2a1_3; // Value injected by FXMLLoader

    @FXML // fx:id="btn3"
    private Button btn3; // Value injected by FXMLLoader

    @FXML // fx:id="btn30"
    private Button btn30; // Value injected by FXMLLoader

    @FXML // fx:id="btn31"
    private Button btn31; // Value injected by FXMLLoader

    @FXML // fx:id="btn32"
    private Button btn32; // Value injected by FXMLLoader

    @FXML // fx:id="btn33"
    private Button btn33; // Value injected by FXMLLoader

    @FXML // fx:id="btn34"
    private Button btn34; // Value injected by FXMLLoader

    @FXML // fx:id="btn35"
    private Button btn35; // Value injected by FXMLLoader

    @FXML // fx:id="btn36"
    private Button btn36; // Value injected by FXMLLoader

    @FXML // fx:id="btn4"
    private Button btn4; // Value injected by FXMLLoader

    @FXML // fx:id="btn5"
    private Button btn5; // Value injected by FXMLLoader

    @FXML // fx:id="btn6"
    private Button btn6; // Value injected by FXMLLoader

    @FXML // fx:id="btn7"
    private Button btn7; // Value injected by FXMLLoader

    @FXML // fx:id="btn8"
    private Button btn8; // Value injected by FXMLLoader

    @FXML // fx:id="btn9"
    private Button btn9; // Value injected by FXMLLoader

    @FXML // fx:id="btnDispari"
    private Button btnDispari; // Value injected by FXMLLoader

    @FXML // fx:id="btnNero"
    private Button btnNero; // Value injected by FXMLLoader

    @FXML // fx:id="btnPari"
    private Button btnPari; // Value injected by FXMLLoader

    @FXML // fx:id="btnRosso"
    private Button btnRosso; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumero"
    private Label lblNumero; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumeroEstratto"
    private Label lblNumeroEstratto; // Value injected by FXMLLoader
        
    @FXML // fx:id="rootPane"
    private AnchorPane rootPane; // Value injected by FXMLLoader
    
    @FXML // fx:id="sldPuntata"
    private Slider sldPuntata; // Value injected by FXMLLoader
    
    @FXML // fx:id="lblPuntata"
    private Label lblPuntata; // Value injected by FXMLLoader

    @FXML // fx:id="lblValorePuntato"
    private Label lblValorePuntato; // Value injected by FXMLLoader
    
    @FXML // fx:id="lblVincita"
    private Label lblVincita; // Value injected by FXMLLoader


    int rigaCrono=0;
    int colCrono=0;
    ArrayList<Integer> listapari= new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36));
    ArrayList<Integer> listadispari= new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35));
    ArrayList<Integer> lista2a1_1= new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,18,21,24,27,30,33,36));
    ArrayList<Integer> lista2a1_2= new ArrayList<Integer>(Arrays.asList(2,5,8,11,14,17,20,23,26,29,32,35));
    ArrayList<Integer> lista2a1_3= new ArrayList<Integer>(Arrays.asList(1,4,7,10,13,16,19,22,25,28,31,34));
    ArrayList<Integer> lista1a12= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
    ArrayList<Integer> lista13a24 =new ArrayList<Integer>(Arrays.asList(13,14,15,16,17,18,19,20,21,22,23,24));
    ArrayList<Integer> lista25a36=new ArrayList<Integer>(Arrays.asList(25,26,27,28,29,30,31,32,33,34,35,36));
    ArrayList<Integer> lista1a18=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18));
    ArrayList<Integer> lista19a36=new ArrayList<Integer>(Arrays.asList(19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36));
    ArrayList<Integer> listarosso=new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36));
    ArrayList<Integer> listanero=new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35));
    private Integer Generanumeri(){
        Random rand = new Random();
        Integer numerogenerato=rand.nextInt(37);
        return numerogenerato;
    }
    
    private int scommetti (List<Integer> ListaVincente, int moltiplicatore){
            Integer numeroestratto =Generanumeri();
            
            if (sldPuntata.getValue()==0){
                lblValorePuntato.setText("Inserire puntata");
                return -1;
            }
            double valoreVinto= sldPuntata.getValue()*moltiplicatore;
            rootPane.setDisable(true);
            Timeline timeline =new Timeline(new KeyFrame(Duration.millis(200),e ->{
            lblNumero.setText(Generanumeri().toString());
            }
            ));
            timeline.setCycleCount(10);
            timeline.setOnFinished(event-> {
            lblNumero.setText(String.valueOf(numeroestratto));
            GestioneCronologia(numeroestratto);
            if (ListaVincente != null && ListaVincente.contains(numeroestratto)){
                lblNumero.setText(numeroestratto+" Hai Vinto!");
                lblVincita.setText("Vincita: "+String.format("%.2f", valoreVinto)+"€");
            }else {
                lblNumero.setText(numeroestratto+" Hai Perso!");
                lblVincita.setText("Vincita: 0.0€");
            }rootPane.setDisable(false);
            });
            timeline.play();
            if (ListaVincente != null && ListaVincente.contains(numeroestratto)){
                return 0;
            }else return 1;
            
    }
    
    
    @FXML
    void hdnl2a1_2(ActionEvent event) {
        scommetti(lista2a1_2,3);
    }

    @FXML
    void hdnlPari(ActionEvent event) {
        scommetti(listapari,2);
    }

    @FXML
    void hndl13_24(ActionEvent event) {
        scommetti(lista13a24,3);
    }

    @FXML
    void hndl19_36(ActionEvent event) {
        scommetti(lista19a36,2);
    }

    @FXML
    void hndl1_12(ActionEvent event) {
        scommetti(lista1a12,3);
    }

    @FXML
    void hndl1_18(ActionEvent event) {
        scommetti(lista1a18,2);
    }

    @FXML
    void hndl25_36(ActionEvent event) {
        scommetti(lista25a36,3);
    }

    @FXML
    void hndl2a1_1(ActionEvent event) {
        scommetti(lista2a1_1,3);
    }

    @FXML
    void hndl2a1_3(ActionEvent event) {
        scommetti(lista2a1_3,3);
    }

    @FXML
    void hndlDispari(ActionEvent event) {
        scommetti(listadispari,2);
    }

    @FXML
    void hndlNero(ActionEvent event) {
        scommetti(listanero,2);
    }

    @FXML
    void hndlNumeroSingolo(ActionEvent event) {
        String numeroScelto= ((Button)event.getSource()).getText();
        Integer numeroConvertito = Integer.parseInt(numeroScelto);
        scommetti(Arrays.asList(numeroConvertito),36);
    }   

    @FXML
    void hndlRosso(ActionEvent event) {
        scommetti(listarosso,2);
    }
    
    
    
    void GestioneCronologia(int numero){
        Button btn = new Button(String.valueOf(numero));
    btn.setPrefSize(30, 30);
    
    if(numero == 0) btn.getStyleClass().add("zero-btn");
    else if(listarosso.contains(numero)) btn.getStyleClass().add("red-btn");
    else btn.getStyleClass().add("black-btn");

    GPaneCronologia.add(btn, colCrono, rigaCrono);

    colCrono++;
    if (colCrono > 2) {
        colCrono = 0;
        rigaCrono++;
    }
    if (rigaCrono > 9) {
        GPaneCronologia.getChildren().clear();
        rigaCrono = 0;
        colCrono = 0;
                
            }
        }
    
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn10 != null : "fx:id=\"btn10\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn11 != null : "fx:id=\"btn11\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn12 != null : "fx:id=\"btn12\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn13 != null : "fx:id=\"btn13\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn13_24 != null : "fx:id=\"btn13_24\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn14 != null : "fx:id=\"btn14\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn15 != null : "fx:id=\"btn15\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn16 != null : "fx:id=\"btn16\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn17 != null : "fx:id=\"btn17\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn18 != null : "fx:id=\"btn18\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn19 != null : "fx:id=\"btn19\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn19_36 != null : "fx:id=\"btn19_36\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn1_12 != null : "fx:id=\"btn1_12\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn1_18 != null : "fx:id=\"btn1_18\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn20 != null : "fx:id=\"btn20\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn21 != null : "fx:id=\"btn21\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn22 != null : "fx:id=\"btn22\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn23 != null : "fx:id=\"btn23\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn24 != null : "fx:id=\"btn24\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn25 != null : "fx:id=\"btn25\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn25_36 != null : "fx:id=\"btn25_36\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn26 != null : "fx:id=\"btn26\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn27 != null : "fx:id=\"btn27\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn28 != null : "fx:id=\"btn28\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn29 != null : "fx:id=\"btn29\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn2a1_1 != null : "fx:id=\"btn2a1_1\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn2a1_2 != null : "fx:id=\"btn2a1_2\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn2a1_3 != null : "fx:id=\"btn2a1_3\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn30 != null : "fx:id=\"btn30\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn31 != null : "fx:id=\"btn31\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn32 != null : "fx:id=\"btn32\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn33 != null : "fx:id=\"btn33\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn34 != null : "fx:id=\"btn34\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn35 != null : "fx:id=\"btn35\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn36 != null : "fx:id=\"btn36\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnDispari != null : "fx:id=\"btnDispari\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnNero != null : "fx:id=\"btnNero\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnPari != null : "fx:id=\"btnPari\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnRosso != null : "fx:id=\"btnRosso\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblNumero != null : "fx:id=\"lblNumero\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblNumeroEstratto != null : "fx:id=\"lblNumeroEstratto\" was not injected: check your FXML file 'primary.fxml'.";
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'primary.fxml'.";
        assert GPaneCronologia != null : "fx:id=\"GPaneCronologia\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblValorePuntato != null : "fx:id=\"lblValorePuntato\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblPuntata != null : "fx:id=\"lblPuntata\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblVincita != null : "fx:id=\"lblVincita\" was not injected: check your FXML file 'primary.fxml'.";
        assert sldPuntata != null : "fx:id=\"sldPuntata\" was not injected: check your FXML file 'primary.fxml'.";

        sldPuntata.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observable,Number oldValue,Number newValue){
                double puntata=newValue.doubleValue();
                lblValorePuntato.setText(String.format("%.2f",puntata));
            }
        });

    }

}
