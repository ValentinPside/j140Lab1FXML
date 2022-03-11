/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import resurces.RoW;

/**
 * FXML Controller class
 *
 * @author user
 */
public class NoteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextArea text;
    
    @FXML
    private void save(ActionEvent event) throws Exception {
        RoW.saveFile(user, text.getText());
    }
    
    @FXML
    private void clear(ActionEvent event) throws Exception {
        text.clear();
    }
    
    @FXML
    private void openFile(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
            Stage stage = new Stage();
            File file = fileChooser.showOpenDialog(stage);
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT", "*.txt"));
            try (FileReader fileReader = new FileReader(file)){
                text.clear();
                char[] temp = new char[1024];
                int i;
                while ((i = fileReader.read(temp)) > 0){
                    String line = new String(temp, 0, i);
                    text.appendText(line);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
