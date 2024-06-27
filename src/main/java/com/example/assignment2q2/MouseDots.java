package com.example.assignment2q2;
/*
Christopher Trang
100390022
Assignment 2
Question #2
 */

import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MouseDots extends Application {
    @Override      //Overrides the start method in the Application class

    public void start(Stage primaryStage) {
        //Makes a pane
        Pane pane = new Pane();

        //This is the handle
        pane.setOnMouseClicked(e -> {
            //For circle, also is for adding and removing them
            Circle circle = new Circle(e.getX(), e.getY(), 5);
            circle.setFill(Color.GRAY);
            circle.setStroke(Color.BLACK);
            if (e.getButton() == MouseButton.PRIMARY) {
                pane.getChildren().add(circle);
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                ObservableList<Node> list = pane.getChildren();
                for (int i = 0; i < list.size(); i++) {
                    Circle c = (Circle)list.get(i);
                    if (circle.contains(c.getCenterX(), c.getCenterY())) {
                        list.remove(i);
                    }
                }
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_15_15"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}