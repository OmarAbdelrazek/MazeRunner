/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import view.*;
import controller.*;
import java.awt.event.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ooomooo
 */
public class ChoosePlayerController implements Initializable {

    @FXML
    private Button kokoBtn;
    private Button timmyBtn;
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void kokoBtnAction(ActionEvent event) {
          Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("Gameplay.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);

         //s.setFullScreen(true);

         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    @FXML
    public void timmyBtnAction(ActionEvent event2){
           Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("Gameplay.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event2.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         //s.setFullScreen(true);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    @FXML
    private void backBtnAction(ActionEvent event) {
        Parent menuParent;
        try {
            menuParent = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene menuScene = new Scene(menuParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(menuScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
            
    
    }

    
    
}
