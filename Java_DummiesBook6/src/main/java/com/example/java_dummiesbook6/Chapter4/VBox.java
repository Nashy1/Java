package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;


public class VBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        VBox vbox = new VBox(btn1, btn2, btn3);

        Scene scene = new Scene(vbox,750,750);


        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox Testing");
        primaryStage.show();
    }
}
