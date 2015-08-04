package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.LabelBuilder;
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

        root.getChildren().add(createLabel());

        primaryStage.show();
    }

    private Label createLabel() {
        Label label = LabelBuilder.create().
                text("some").
                prefWidth(100).
                prefHeight(50).
                alignment(Pos.CENTER).
                layoutX(500).
                layoutY(550).
                style("-fx-background-color: orange;").
                build();

        return label;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
