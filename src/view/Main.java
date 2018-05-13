/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**  Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("ChoosePlayer.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
 *
 * @author ooomooo
 */
public class Main extends Application {
    MediaPlayer mediaplayer;
    @Override
    public void start(Stage stage) throws Exception {
     
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
