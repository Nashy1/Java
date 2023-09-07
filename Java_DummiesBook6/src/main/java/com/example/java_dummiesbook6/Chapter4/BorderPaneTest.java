package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");
        Button btn3 = new Button("Btn3");
        Button btn4 = new Button("Btn4");
        Button btn5 = new Button("Btn5");
        Button btn6 = new Button("Btn6");
        Button btn7 = new Button("Btn7");
        Button btn8 = new Button("Btn8");
        Button btn9 = new Button("Btn9");
        Button btn10 = new Button("Btn10");
        Button btn11 = new Button("Btn11");
        Button btn12 = new Button("Btn12");
        Button btn13 = new Button("Btn13");
        Button btn14 = new Button("Btn14");
        Button btn15 = new Button("Btn15");

        VBox vbox1 = new VBox(btn1, btn2, btn3);
        VBox vbox2 = new VBox(btn4, btn5, btn6);
        VBox vbox3 = new VBox(btn7, btn8, btn9);
        VBox vbox4 = new VBox(btn10, btn11, btn12);
        VBox vbox5 = new VBox(btn13, btn14, btn15);


        BorderPane bpane = new BorderPane(vbox1,vbox2,vbox3,vbox4,vbox5);
        vbox1.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);
        vbox3.setAlignment(Pos.CENTER);
        vbox4.setAlignment(Pos.CENTER);
        vbox5.setAlignment(Pos.CENTER);


        Scene scene = new Scene(bpane,750,750);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane Testing");
        primaryStage.show();
    }
}
