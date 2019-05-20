package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Kalam Project");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


        //Parent root1= FXMLLoader
    }


    public static void main(String[] args) {
        launch(args);
    }
}
