package champion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Quiz1read implements Initializable {

    @FXML
    private Button backto;

    @FXML
    private ImageView read;

    @FXML
    private Button back;

    @FXML
    private Label reading;

    @FXML
    void backtocategory(ActionEvent event) {
        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("quiz1.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) back.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();

    }

    @FXML
    void backtoquiz(ActionEvent event) {
        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("quiz1.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) backto.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file1 = new File("src/sample/Resource/read.PNG ");
        Image image1 = new Image(file1.toURI().toString());
        read.setImage(image1);
    }
}
