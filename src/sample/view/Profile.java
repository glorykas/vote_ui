package sample.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Profile {

    public void setOnAction(ActionEvent event) throws IOException {
        Parent profileParent = FXMLLoader.load(getClass() .getResource("third.fxml"));
        Scene profileScene = new Scene(profileParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(profileScene);
        window.show();


    }
}
