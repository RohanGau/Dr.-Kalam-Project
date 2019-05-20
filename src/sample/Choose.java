package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Choose implements Initializable  {

    @FXML
    private ImageView tech;

    @FXML
    private ImageView shape;

    @FXML
    private Button backtoext;

    @FXML
    private ImageView again;

    @FXML
    private ImageView know;
    
    private AnchorPane pane;

    @FXML
    private ImageView choose;

    @FXML
    private ImageView champ;

    @FXML
    private ImageView changing;

    @FXML
    private ImageView walk;

    @FXML
    void backtoext(ActionEvent event) {

        AnchorPane pane=null;
        try{
            pane=FXMLLoader.load(getClass().getResource("extfile2.fxml"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Stage stge = (Stage) backtoext.getScene().getWindow();
        stge.setScene(new Scene(pane));
        stge.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        File file = new File("src/sample/Resource/choose.PNG ");
        Image image = new Image(file.toURI().toString());
        choose.setImage(image);

        File file1 = new File("src/sample/Resource/tech.PNG ");
        Image image1 = new Image(file1.toURI().toString());
        tech.setImage(image1);

        File file2 = new File("src/sample/Resource/shaping.PNG ");
        Image image2 = new Image(file2.toURI().toString());
        shape.setImage(image2);

        File file3 = new File("src/sample/Resource/changing.PNG ");
        Image image3 = new Image(file3.toURI().toString());
        changing.setImage(image3);
        File file7 = new File("src/sample/Resource/champion.PNG ");
        Image image7 = new Image(file7.toURI().toString());
        champ.setImage(image7);

        File file4 = new File("src/sample/Resource/against.PNG ");
        Image image4 = new Image(file4.toURI().toString());
        again.setImage(image4);

        File file5 = new File("src/sample/Resource/know.PNG ");
        Image image5 = new Image(file5.toURI().toString());
        know.setImage(image5);

        File file6 = new File("src/sample/Resource/walk.PNG ");
        Image image6 = new Image(file6.toURI().toString());
        walk.setImage(image6);

       /* tech.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                try {
                    pane = FXMLLoader.load(getClass().getResource("quiz.tech.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });*/

       tech.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
           @Override
           public void handle(javafx.scene.input.MouseEvent event) {
               try {
                   pane = FXMLLoader.load(getClass().getResource("/quiz/tech.fxml"));
               } catch (IOException e) {
                   e.printStackTrace();
               }
               Stage stge = (Stage) tech.getScene().getWindow();
               stge.setScene(new Scene(pane));
               stge.show();
           }
       });
        shape.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/quiz/shape.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });

        champ.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/champion/champ.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });

        changing.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/change/changing.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });

        again.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/against/against.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });
        know.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/know/know.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });

        walk.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pane = FXMLLoader.load(getClass().getResource("/walk/walk.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stge = (Stage) tech.getScene().getWindow();
                stge.setScene(new Scene(pane));
                stge.show();
            }
        });

    }}