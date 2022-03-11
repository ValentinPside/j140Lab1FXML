/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import resurces.DBServer;

/**
 * FXML Controller class
 *
 * @author Valentin
 */
public class NewUserController implements Initializable {

    @FXML
    TextField field1;
    TextField field2;
    TextField field3;
    
    @FXML
    private void addUser(ActionEvent event) throws Exception {
        String name = field1.getText();
           String lastName = field2.getText();
           Integer age = Integer.parseInt(field3.getText().replaceAll("[^\\d]", ""));
            try {
                DBServer db = new DBServer();
                db.addNewUser(name, lastName, age);
            } catch (Exception ex) {
                ex.getMessage();
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
