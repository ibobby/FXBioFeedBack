package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private int windowWidth = 600;
    private int windowHeight = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        primaryStage.setTitle("bio");
        primaryStage.setScene(new Scene(root, windowWidth, windowHeight));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
