package com.example.java_dummiesbook6.Chapter5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RolePlay extends Application {
    TextField txtCharacter;
    TextField txtActor;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Creating the Character
        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);


        //Creating the Character text field
        txtCharacter = new TextField();
        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the character here.");

        //Creating the Actor label
        Label lblActor = new Label("Actor's Name:");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);


        //Creating the Actor txt field
        txtActor =new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");

        //Creating the Ok button
        Button btnOk =new Button("Ok");
        btnOk.setMinWidth(75);
        btnOk.setOnAction(e->btnOk_Click());


        //Creating the Character pane
        HBox paneChar = new HBox(20,lblCharacter,txtCharacter);
        paneChar.setPadding(new Insets(10));

        //Creating the Actor pane
        HBox paneAct = new HBox(20,lblActor,txtActor);
        paneAct.setPadding(new Insets(10));

        //creating the btn pane
        HBox paneBtn = new HBox(20,btnOk);
        paneBtn.setPadding(new Insets(10));
        paneBtn.setAlignment(Pos.BOTTOM_RIGHT);

        //adding the char,act,and btn pane to a Vbox
        VBox pane =new VBox(10,paneChar,paneAct,paneAct);

        //setting the scene
        Scene scene =new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOk_Click(){
        String errorMessage = " ";

        if (txtCharacter.getText().length() == 0){
            errorMessage +="\nCharacter is a required field.";
        }
        if (txtActor.getText().length() ==0){
            errorMessage +="\nActor is a required field.";
        }
        if (errorMessage.length() == 0){
            String message = "The role of " + txtCharacter.getText()+ " will be played by " + txtActor.getText()+".";
            Alert a = new Alert(Alert.AlertType.INFORMATION,message);
            a.setTitle("Cast");
            a.showAndWait();
        }else {
            Alert a = new Alert(Alert.AlertType.WARNING,errorMessage);
            a.setTitle("Missg Date");
            a.showAndWait();
        }
    }
}
