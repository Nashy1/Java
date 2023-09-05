package com.example.java_dummiesbook6.Chapter2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubAnnon extends Application {


        Button btnAdd;
        Button btnSub;
        Label lbl;
        int iCounter;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {


            //Add btn setup
            btnAdd = new Button();
            btnAdd.setText("Add");
            btnAdd.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                    iCounter++;
                    lbl.setText(Integer.toString(iCounter));
                }
            } );

            //Sub btn setup
            btnSub = new Button();
            btnSub.setText("Subtract");
            btnSub.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {

                    iCounter--;
                    lbl.setText(Integer.toString(iCounter));
                }
            } );

            //label setup
            lbl=new Label();
            lbl.setText(Integer.toString(iCounter));

            //pane setup
            HBox pane = new HBox(10);
            pane.getChildren().addAll(lbl,btnAdd,btnSub);

            //scene setup
            Scene scene =new Scene(pane,200,75);

            //stage setup
            primaryStage.setScene(scene);
            primaryStage.setTitle("Add/Subtract");
            primaryStage.show();
        }

}
