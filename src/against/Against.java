package against;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Against implements Initializable {

    @FXML
    private Button quiz2;

    @FXML
    private Button quiz1;

    @FXML
    private Button back;

    @FXML
    void backtocategory(ActionEvent event) {
        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("/sample/choose.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) back.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();

    }

    @FXML
    void gotoquiz1(ActionEvent event) {
        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("quiz1.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) quiz1.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();

    }

    @FXML
    void gotoquiz2(ActionEvent event) {

        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("quiz2.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) quiz2.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
