/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdonation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ANIL
 */
public class MainPageController implements Initializable {
    
    @FXML
    private Button rLogout,nLogout,sLogout,lLogin;
    @FXML
    private TabPane AnaEkran;
    @FXML
    private GridPane GridLogin;
    @FXML
    private Tab TabNurse, TabStorage, TabReceptionist;
    /*
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    */
    
    public static int hangi = 0;
    public void tabSecer(){
    
    }
    
    
    public void chooseType(){
        
    }
    public void save(){
    
    }

    public void Search(){
        
    }
    @FXML
    public void loginout(ActionEvent event) throws IOException {
     Stage stage; 
     Parent root;
     if(event.getSource()==rLogout || event.getSource()== sLogout || event.getSource()==nLogout ){
        stage=(Stage) rLogout.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("BloodLogin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
     }
     else if(event.getSource()==lLogin){
        stage=(Stage) lLogin.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();    
     }

    }
    

    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        if(AnaEkran != null){
//            SingleSelectionModel<Tab> selam = AnaEkran.getSelectionModel();
//            selam.select(TabSecer);
//        }
    }    
}
