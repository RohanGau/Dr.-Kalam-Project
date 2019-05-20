package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import javax.swing.text.html.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Extfile2 implements Initializable {



    @FXML
    private Button back;

    @FXML
    private Button choose;

    @FXML
    private ImageView zero;

    @FXML
    private Button take;

    @FXML
    private ImageView hour;

    @FXML
    private Button learn;

    @FXML
    private ImageView four;

    @FXML
    private ImageView book;

    @FXML
    private ImageView five;
   // private Object ActionEvent;
   @FXML
   void learnaction(ActionEvent event)throws  Exception {

       AnchorPane pane=FXMLLoader.load(getClass().getResource("Learn.fxml"));
       Stage stge = (Stage) learn.getScene().getWindow();
       stge.setScene(new Scene(pane));
       stge.show();
   }
    @FXML
    void chooseaction(ActionEvent event)throws Exception{
         AnchorPane pane=FXMLLoader.load(getClass().getResource("choose.fxml"));
         Stage stage=(Stage) choose.getScene().getWindow();
        stage.setScene(new Scene(pane));
        stage.show();
     }
   @FXML
   void backaction(ActionEvent event) {
       AnchorPane pane= null;
       try {
           pane = FXMLLoader.load(getClass().getResource("nextFile1.fxml"));
       } catch (IOException e) {
           e.printStackTrace();
       }
       Stage stge = (Stage) back.getScene().getWindow();
       stge.setScene(new Scene(pane));

   }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        File file = new File("src/sample/Resource/circular activity.PNG");
        Image im =  new Image(file.toURI().toString());
       book.setImage(im);

        File role2 = new File("src/sample/Resource/hr.PNG");
        Image im2;
        im2 = new Image(role2.toURI().toString());
       hour.setImage(im2);

        File role3 = new File("src/sample/Resource/five.PNG");
        Image im3 =  new Image(role3.toURI().toString());
        five.setImage(im3);

        File role4 = new File("src/sample/Resource/four.PNG");
        Image im4 =  new Image(role4.toURI().toString());
        four.setImage(im4);

        File role5 = new File("src/sample/Resource/0.5.PNG");
        Image im5 =  new Image(role5.toURI().toString());
        zero.setImage(im5);




    }
}
