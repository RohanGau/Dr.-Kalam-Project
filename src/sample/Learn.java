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
//import  java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.*;

public class Learn implements Initializable {
    @FXML
    private ImageView ques1;
    @FXML
    private ImageView copy1;
    @FXML
    private ImageView ques2;
    @FXML
    private ImageView copy2;

    @FXML
    private ImageView confluence;

    @FXML
    private ImageView learn;

    @FXML
    private ImageView ques;

    @FXML
    private Button backlearn;

    @FXML
    private ImageView copy;

    @FXML
    private ImageView power;

    @FXML
    private ImageView creative;

    @FXML
    void backlearn(ActionEvent event) {

        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("extfile2.fxml"));
        }catch(IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) backlearn.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file= new File("src/sample/Resource/learn.PNG");
        Image image= new Image(file.toURI().toString());
        learn.setImage(image);

        File file1= new File("src/sample/Resource/creative.PNG");
        Image image1= new Image(file1.toURI().toString());
        creative.setImage(image1);

        File file2= new File("src/sample/Resource/confluence.PNG");
        Image image2= new Image(file2.toURI().toString());
        confluence.setImage(image2);

        File file3= new File("src/sample/Resource/power.PNG");
        Image image3= new Image(file3.toURI().toString());
        power.setImage(image3);

        File file4= new File("src/sample/Resource/copy.PNG");
        Image image4= new Image(file4.toURI().toString());
        copy.setImage(image4);

        File file5= new File("src/sample/Resource/ques.PNG");
        Image image5= new Image(file5.toURI().toString());
        ques.setImage(image5);

        ques1.setImage(image5);
        copy1.setImage(image4);

        ques2.setImage(image5);
        copy2.setImage(image4);

    }
}

