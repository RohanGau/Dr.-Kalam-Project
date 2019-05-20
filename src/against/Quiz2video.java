package against;

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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Quiz2video implements Initializable {

    @FXML
    private ImageView quiz;

    @FXML
    private Button back;

    @FXML
    private ImageView video;

    @FXML
    void backtocategory(ActionEvent event) {
        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("quiz2.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) back.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        File file1 = new File("src/sample/Resource/video.PNG ");
        Image image1 = new Image(file1.toURI().toString());
        video.setImage(image1);

        File file3 = new File("src/sample/Resource/question.PNG ");
        Image image3 = new Image(file3.toURI().toString());
        quiz.setImage(image3);
    }
}
