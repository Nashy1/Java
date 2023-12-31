package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        //Creating the spacer
        Region spacer = new Region();

        // pane
        HBox hbox = new HBox(20, btn1, btn2,spacer, btn3);
        hbox.setPadding(new Insets(40, 20, 40, 20));



        hbox.setMargin(btn1, new Insets(10));
        hbox.setMargin(btn2, new Insets(10));
        hbox.setMargin(btn3, new Insets(10));

        // Set the Hgrow for the spacer
        hbox.setHgrow(spacer, Priority.ALWAYS);


        // scene
        Scene scene = new Scene(hbox, 500, 500);

        // stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBOX Test");
        primaryStage.show();
    }
}
