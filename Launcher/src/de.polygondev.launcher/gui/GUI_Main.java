package de.polygondev.launcher.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.collections.*;
import javafx.event.*;
import java.net.*;
import java.util.*;
import java.io.*;


public class GUI_Main extends Application {

  private ImageView imageView1 = new ImageView();
  private Label label1 = new Label();
  private ListView<String> listView1 = new ListView<>();
      private ObservableList<String> listView1ObservableList = 
              FXCollections.observableArrayList();
  private Button button1 = new Button();
  private Button button2 = new Button();
  private Button button3 = new Button();
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 406, 430);
    
    imageView1.setX(152);
    imageView1.setY(24);
    imageView1.setFitWidth(100);
    Image img = null;
    try{
    img = new Image("resources/icon.png");
      } catch(Exception e){
        
      }
    imageView1.setImage(img);  
    imageView1.setFitHeight(100);
    root.getChildren().add(imageView1);
    label1.setLayoutX(104);
    label1.setLayoutY(136);
    label1.setPrefHeight(36);
    label1.setPrefWidth(342);
    label1.setStyle("-fx-font: 24 arial; text-align: middle;");
    label1.setText("Polygon Launcher");
    root.getChildren().add(label1);
    listView1.setLayoutX(32);
    listView1.setLayoutY(200);
    listView1.setPrefHeight(148);
    listView1.setPrefWidth(342);
    listView1.setItems(listView1ObservableList);
    root.getChildren().add(listView1);
    button1.setLayoutX(16);
    button1.setLayoutY(384);
    button1.setText("Info");
    button1.setPrefHeight(25);
    button1.setPrefWidth(107);
    button1.setOnAction(
      (event) -> {button1_Action(event);} 
    );
    root.getChildren().add(button1);
    button2.setLayoutX(128);
    button2.setLayoutY(384);
    button2.setText("Download");
    button2.setPrefHeight(25);
    button2.setPrefWidth(123);
    button2.setOnAction(
      (event) -> {button2_Action(event);} 
    );
    root.getChildren().add(button2);
    button3.setLayoutX(256);
    button3.setLayoutY(384);
    button3.setText("Download & Run");
    button3.setPrefHeight(25);
    button3.setPrefWidth(131);
    button3.setOnAction(
      (event) -> {button3_Action(event);} 
    );
    root.getChildren().add(button3);
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("Polygon Launcher");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public void button1_Action(Event evt) {

  }

  public void button2_Action(Event evt) {
    
  }

  public void button3_Action(Event evt) {
    
  }

}

