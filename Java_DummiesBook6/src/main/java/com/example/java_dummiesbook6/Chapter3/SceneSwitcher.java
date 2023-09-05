package com.example.java_dummiesbook6.Chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher extends Application {
    //vars for click-counter scene
    int iClickCount =0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSTS2;
    Scene scene1;


    //vars for Add-Subtract scene
    int iCounter =0;
    Label lblcounter;
    Button btnAdd;
    Button btnSub;
    Button btnSTS1;
    Scene scene2;

    //var of stage
    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        //building the click-counter scene
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");

        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e->btnClickMe_Click());


        btnSTS1 =new Button();
        btnSTS1.setText("Swicth!");
        btnSTS1.setOnAction(e->btnSTS2_Click());


        VBox pane1 = new VBox();
        pane1.getChildren().addAll(lblClicks,btnClickMe,btnSTS2);
        scene1 =new Scene(pane1,250,150);


        //build the Add-sub scene
        lblcounter = new Label();
        lblcounter.setText(Integer.toString(iCounter));


        btnAdd =new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e->btnAdd_Click());

        btnSub =new Button();
        btnSub.setText("Subtract");
        btnSub.setOnAction(e->btnSub_Click());

        btnSTS1=new Button();
        btnSTS1.setText("Switch!");
       btnSTS1.setOnAction(
                e -> btnSTS1_Click() );


        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lblcounter, btnAdd,
                btnSub, btnSTS2);

        scene2 = new Scene(pane2, 300, 75);

        // Set the stage with scene 1 and show the stage →84
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();



    }
    public void btnClickMe_Click()
    {
        iClickCount++;
        if (iClickCount == 1)
        {
            lblClicks.setText("You have clicked once.");
        }
        else
        {
            lblClicks.setText("You have clicked "
                    + iClickCount + " times." );
        }
    }
    private void btnSwitchToScene2_Click()
    {
        stage.setScene(scene2);
    }
    // Event handlers for scene 2 →112
    private void btnAdd_Click()
    {
        iCounter++;
        lblcounter.setText(Integer.toString(iCounter));
    }
    private void btnSubtract_Click()
    {
        iCounter--;
        lblcounter.setText(Integer.toString(iCounter));
    }
    private void btnSwitchToScene1_Click()
    {
        stage.setScene(scene1);
    }

}
