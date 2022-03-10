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
 * @author user
 */
public class Table extends Stage{
    public Table() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Table.fxml"));
        Scene scene = new Scene(root);
        setScene(scene);
        show();
    }
}
