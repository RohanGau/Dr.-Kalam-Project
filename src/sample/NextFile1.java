package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NextFile1 implements Initializable {

    @FXML
    private AnchorPane EPID2;

    @FXML
    private ImageView completepicture;

    @FXML
    private ImageView HomeImage;

    private AnchorPane pane;

    @FXML
    private ImageView userimage;

    @FXML
    private ImageView BookImage;

    @FXML
    private ImageView StarImage;

    @FXML
    private  AnchorPane EPID;

    @FXML
    private AnchorPane home;
    public void initialize(URL location, ResourceBundle resources) {

        File file = new File("src/sample/Resource/Capture1.PNG");
        Image image =  new Image(file.toURI().toString());
        completepicture.setImage(image);

        File file1 = new File("src/sample/Resource/home.PNG");
        Image image1 =  new Image(file1.toURI().toString());
        HomeImage.setImage(image1);

        File file2 = new File("src/sample/Resource/star.PNG");
        Image image2 =  new Image(file2.toURI().toString());
        StarImage.setImage(image2);

        File file3 = new File("src/sample/Resource/circular activity.PNG");
        Image image3 =  new Image(file3.toURI().toString());
        BookImage.setImage(image3);

        File file4 = new File("src/sample/Resource/user.PNG");
        Image image4 =  new Image(file4.toURI().toString());
        userimage.setImage(image4);

        HomeImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                try {
                    pane = FXMLLoader.load(getClass().getResource("nextFile1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) home.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();

            }

        });

        BookImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                try {
                    pane = FXMLLoader.load(getClass().getResource("extfile2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) BookImage.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();

            }
        });
        StarImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                try {
                    pane = FXMLLoader.load(getClass().getResource("next3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) StarImage.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();

            }
        });




    }
}
