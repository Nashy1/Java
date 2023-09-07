package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1  = new Button("Btn1");
        Button btn2 = new Button("Btn2");
        Button btn3  = new Button("Btn3");
        Button btn4  = new Button("Btn4");
        Button btn5  = new Button("Btn5");

        FlowPane pane = new FlowPane(Orientation.VERTICAL,10,10,btn1,btn2,btn3,btn4,btn5);
        pane.setPrefWrapLength(300);

        Scene scene = new Scene(pane,750,750);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Testing FlowPane");
        primaryStage.show();

    }
}
