package com.example.java_dummiesbook6.Chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {
Button btn;
Label lbl;
int iClickcounter =0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //button setup
        btn = new Button();
        btn.setText("Click me please");
        btn.setOnAction(e->buttonClick());

        //label setup
        lbl= new Label();
        lbl.setText("You  have not clicked the button");

        //pane setup
        BorderPane pane =new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        //scene setup
        Scene scene = new Scene(pane,250,150);

        //stage setup
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click counter");
        primaryStage.show();

    }

    public void buttonClick(){
        iClickcounter++;
        if (iClickcounter == 1){
            lbl.setText("You have clicked once.");
        }else{
            lbl.setText("You have clicked "+ iClickcounter + " times.");
        }
    }
}
