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
import stages.Table;
import stages.Note;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AuthorizationController implements Initializable {

    @FXML
    private void openUserList(ActionEvent event) throws Exception {
        new Table();
    }
    
    @FXML
    private void signIn(ActionEvent event) throws Exception {
        new Note();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
