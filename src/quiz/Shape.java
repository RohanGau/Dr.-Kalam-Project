package quiz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Shape implements Initializable {

    @FXML
    private Label reading;
    @FXML
    private Label quiz1;

    @FXML
    private Label video1;

    @FXML
    private ImageView quiz;

    @FXML
    private ImageView read;

    @FXML
    private Button back;

    @FXML
    private ImageView video;
    private AnchorPane pane;

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
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        File file1 = new File("src/sample/Resource/video.PNG ");
        Image image1 = new Image(file1.toURI().toString());
        video.setImage(image1);

        File file2 = new File("src/sample/Resource/read.PNG ");
        Image image2 = new Image(file2.toURI().toString());
        read.setImage(image2);

        File file3 = new File("src/sample/Resource/question.PNG ");
        Image image3 = new Image(file3.toURI().toString());
        quiz.setImage(image3);

        video1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("shapevideo.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) video1.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();            }
        });

        reading.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("shapereading.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) video1.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });
         video.setOnMouseClicked(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent event) {
                 try {
                     pane = FXMLLoader.load(getClass().getResource("shapevideo.fxml"));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 Stage stge = (Stage) video1.getScene().getWindow();
                 stge.setScene(new Scene(pane));
                 stge.show();
             }
         });
         read.setOnMouseClicked(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent event) {
                 try {
                     pane = FXMLLoader.load(getClass().getResource("shapereading.fxml"));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 Stage stge = (Stage) video1.getScene().getWindow();
                 stge.setScene(new Scene(pane));
                 stge.show();
             }
         });

    }
}
