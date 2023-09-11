package com.example.java_dummiesbook6.Chapter6;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewTest extends Application {
    TreeItem root = new TreeItem("Spin Offs");
    TreeView tree = new TreeView(root);

    Label lblShowName;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        lblShowName =new Label();
        TreeItem andy,archie,happy,george ,maude;

        root.setExpanded(true);

        andy = makeShow("The Andy Griffith Show" ,root);
        makeShow("Gomer Pyle, U.C.M.C", andy);
        makeShow("Mayberry R.F.D.",andy);


        archie =makeShow("All in the Family",root);
        george = makeShow("The Jefferson",archie);
        makeShow("Checking",george);


        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);

        happy = makeShow("Happy Days", root);
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);



        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tree.setShowRoot(false);
        tree.setOnMouseClicked(e->click());


        VBox box = new VBox(tree);
        Scene scene = new Scene(box,500,500);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Spin Offs");
        primaryStage.show();


    }

    public TreeItem<String> makeShow (String title, TreeItem<String> parent){
        TreeItem<String> show =new TreeItem(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    public void click(){
        String msg = "";
        ObservableList<TreeItem<String>>shows =tree.getSelectionModel().getSelectedItems();
        for(TreeItem show : shows)
        {
            msg += show.getValue() + "\n";
        }
        System.out.println("You selected these shows: \n" +msg);
    }




}
