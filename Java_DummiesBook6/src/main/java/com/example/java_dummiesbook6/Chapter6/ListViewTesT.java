package com.example.java_dummiesbook6.Chapter6;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListViewTesT extends Application {
    ListView list =new ListView<>();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Pizza toppings");

        list.getItems().addAll("Sausage", "Pepperoni",
                "Linguica", "Salame", "Olives", "Mushrooms",
                "Onions", "Peppers", "Pineapple", "Spinach",
                "Canadian Bacon", "Tomatoes", "Kiwi",
                "Anchovies", "Gummy Bears");
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        list.setOnMouseClicked(e-> onclick());

        HBox hBox = new HBox(10,lbl,list);

        Scene scene = new Scene(hBox,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza Toppings");
        primaryStage.show();


    }
    public void onclick (){
        String tops = "";
        ObservableList<String> toppings = list.getSelectionModel().getSelectedItems();
        for (String s : toppings){
            tops += s +"\n";
        }
        System.out.println("these are the toppings you chose: \n"+tops);
    }
}
