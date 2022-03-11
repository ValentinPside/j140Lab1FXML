/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stages;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Valentin
 */
public class NewUser extends Stage{
    public NewUser() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/NewUser.fxml"));
        Scene scene = new Scene(root);
        setScene(scene);
        show();
    }
}
