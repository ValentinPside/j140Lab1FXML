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
import stages.NewUser;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TableController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void addUser(ActionEvent event) throws Exception {
        new NewUser();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
