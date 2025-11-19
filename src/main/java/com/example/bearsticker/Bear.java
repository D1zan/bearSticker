package com.example.bearsticker;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.io.IOException;

public class Bear extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        //Belly
        Ellipse ellipse = new Ellipse(180, 160, 40, 60);
        ellipse.setFill(Color.BROWN);

        //inside of belly
        Ellipse ellipse2 = new Ellipse(180,170,30,40);
        ellipse2.setFill(Color.LIGHTCORAL);

        //Head
        Circle circle = new Circle(180,80, 40, Color.BROWN);

        //foot 1 and inside of foot 1
        Circle circle2 = new Circle(210,210,15, Color.BROWN);
        Circle circle4 = new Circle(210,210,10,Color.LIGHTCORAL );

        //foot 2 and inside of foot 2
        Circle circle3 = new Circle(150, 210,15, Color.BROWN);
        Circle circle5 = new Circle(150,210,10,Color.LIGHTCORAL );

        //Ear1
        Circle circle6 = new Circle(150,45,20, Color.BROWN);

        //Ear2
        Circle circle7 = new Circle(210,45,20,Color.BROWN);

        //Arm Right
        Circle circle8 = new Circle(220,140,15,Color.BROWN);

        //Arm Left
        Circle circle9 = new Circle(140,140,15,Color.BROWN);

        //Right eye
        Circle circleRight = new Circle(195,70,8,Color.WHITE);
        Circle circlePupil = new Circle(195,73,5, Color.BLACK);

        //Left eye
        Circle circleLeft = new Circle(165, 70,8,Color.WHITE );
        Circle circlePupilLeft = new Circle(165, 73,5, Color.BLACK );

        //nose
        Circle circleNose = new Circle(180, 85,3, Color.BLACK);
        //line right
        Arc arcRight = new Arc();
        arcRight.setCenterX(190.0f);
        arcRight.setCenterY(90.0f);
        arcRight.setRadiusX(10.0f);
        arcRight.setRadiusY(10.0f);
        arcRight.setStartAngle(160.0f);
        arcRight.setLength(150.0f);
        arcRight.setType(ArcType.OPEN);
        arcRight.setFill(Color.TRANSPARENT);
        arcRight.setStroke(Color.BLACK);
        //line Left
        Arc arcLeft = new Arc();
        arcLeft.setCenterX(170.0f);
        arcLeft.setCenterY(90.0f);
        arcLeft.setRadiusX(10.0f);
        arcLeft.setRadiusY(10.0f);
        arcLeft.setStartAngle(210.0f);
        arcLeft.setLength(150.0f);
        arcLeft.setType(ArcType.OPEN);
        arcLeft.setFill(Color.TRANSPARENT);
        arcLeft.setStroke(Color.BLACK);








        group.getChildren().addAll(ellipse, ellipse2, circle, circle2,circle4, circle3,circle5,circle6,circle7,circle8,circle9,circleRight,circlePupil, circleLeft, circlePupilLeft,circleNose,arcRight, arcLeft);

        Scene scene = new Scene( group, 350, 230, Color.LIGHTBLUE);
        stage.setTitle("Bear");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}