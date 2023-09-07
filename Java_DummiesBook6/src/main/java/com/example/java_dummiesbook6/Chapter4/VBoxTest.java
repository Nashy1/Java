package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class VBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        Button btn1 = new Button("Button One");
//        Button btn2 = new Button("Button Two");
//        Button btn3 = new Button("Button Three");

        Button btn1 = new Button("Number One");
        Button btn2 = new Button("Number Two");
        Button btn3 = new Button("Number Three");
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MIN_VALUE);
        btn3.setMaxWidth(20);
//
//        VBox vbox = new VBox(btn1,btn2,btn3);
//        Scene scene = new Scene(vbox,750,750);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(btn1, btn2, btn3);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);




        Scene scene = new Scene(vbox,750,750);

        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox Testing");
        primaryStage.show();
    }
}
