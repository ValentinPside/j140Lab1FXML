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
import resurces.User;
import resurces.UserController;
import resurces.UserException;
import stages.Table;
import stages.Note;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AuthorizationController implements Initializable {

    
    @FXML
    TextField field1;
    TextField field2;
    TextField field3;

    @FXML
    private void openUserList(ActionEvent event) throws Exception {
        new Table();
    }
    
    @FXML
    private void signIn(ActionEvent event) throws Exception {
        String name = field1.getText();
            String lastName = field2.getText();
            Integer age = Integer.parseInt(field3.getText().replaceAll("[^\\d]", ""));
            try {
                if(UserController.checkData(name, lastName, age)){
                    User user = new User(name, lastName, age);
                    new Note();
                }
            } catch (UserException ex) {
                System.out.println(ex.getMessage());
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
