package sample.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Sample {

    public void OnClicked(ActionEvent event) throws IOException {
        Parent sampleParent = FXMLLoader.load(getClass() .getResource("Profile.fxml"));
        Scene sampleScene = new Scene(sampleParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(sampleScene);
        window.show();


    }
}
