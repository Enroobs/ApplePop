package com.myapp.renderer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FloorRenderer extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Example: Set up a simple scene with a StackPane
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Floor Renderer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
