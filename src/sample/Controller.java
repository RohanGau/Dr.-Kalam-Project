package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private  Button clickme;


    @FXML
    private ImageView ButtonLOGO;

    @FXML
    private AnchorPane BPID;

    @FXML
    private ImageView TopBanner;

    @FXML
    private ImageView BottomBanner;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file =new File("src/sample/Resource/Capture.PNG");
        Image image = new Image(file.toURI().toString());
        TopBanner.setImage(image);

        File file2= new File("src/sample/Resource/download.png");
        Image image1=new Image(file2.toURI().toString());
        ButtonLOGO.setImage(image1);



        File file3= new File("src/sample/resource/Capture2.PNG");
        Image image2 = new Image(file3.toURI().toString());
        BottomBanner.setImage(image2);
    }


    public void OnMouseCliCked() throws IOException {


    }


    public void moucsfbbutt() throws IOException {

         AnchorPane pane=FXMLLoader.load(getClass().getResource("nextFile1.fxml"));
        Stage stge = (Stage) BPID.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();
       /*try {
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nextFile1.fxml"));
           Parent root1=(Parent) fxmlLoader.load();
           Stage stage=new Stage();
           stage.setTitle("next window");
           //stage.getScene().getWindow();
           stage.setScene(new Scene(root1));
           stage.show();


       }catch (Exception e){
           System.out.println("cant open ");
       }*/



    }
}
