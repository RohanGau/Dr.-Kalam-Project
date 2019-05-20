package sample;

import com.sun.deploy.util.FXLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Next3 implements Initializable{


    @FXML
    private ImageView invent;

    @FXML
    private Button backinvent;

    @FXML
    void backtostart(ActionEvent event) {

        AnchorPane pane= null;
        try {
            pane = FXMLLoader.load(getClass().getResource("nextFile1.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) backinvent.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        File file= new File("src/sample/Resource/invent.PNG ");
        Image image= new Image(file.toURI().toString());
        invent.setImage(image);

    }
}
