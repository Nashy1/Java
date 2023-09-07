package com.example.java_dummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lblName = new Label("Name");

        TextField txtName = new TextField();

//        ColumnConstraints col1 = new ColumnConstraints(200);
//        ColumnConstraints col2 = new ColumnConstraints(200);
//        ColumnConstraints col3 = new ColumnConstraints(200);


        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);
        GridPane grid = new GridPane();
        grid.getColumnConstraints().addAll(col1, col2, col3);grid.addRow(0,lblName,txtName);
        grid.setColumnSpan(txtName,2);
        grid.setHalignment(lblName, HPos.RIGHT);
        grid.getColumnConstraints().addAll(col1, col2, col3);



        Scene scene =new Scene(grid,550,550);

        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPaneTest");
        primaryStage.show();


    }
}
