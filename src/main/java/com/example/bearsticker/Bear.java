package com.example.bearsticker;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class Bear extends Application {

    // Creates ONE bear at a given x/y origin
    private Group createBear(double x, double y) {
        Group g = new Group();

        // Belly
        Ellipse ellipse = new Ellipse(x, y + 80, 40, 60);
        ellipse.setFill(Color.BROWN);

        // Inside belly
        Ellipse ellipse2 = new Ellipse(x, y + 90, 30, 40);
        ellipse2.setFill(Color.LIGHTCORAL);

        // Head
        Circle circle = new Circle(x, y, 40, Color.BROWN);

        // Foot R
        Circle circle2 = new Circle(x + 30, y + 130, 15, Color.BROWN);
        Circle circle4 = new Circle(x + 30, y + 130, 10, Color.LIGHTCORAL);

        // Foot L
        Circle circle3 = new Circle(x - 30, y + 130, 15, Color.BROWN);
        Circle circle5 = new Circle(x - 30, y + 130, 10, Color.LIGHTCORAL);

        // Ear1
        Circle circle6 = new Circle(x - 30, y - 35, 20, Color.BROWN);

        // Ear2
        Circle circle7 = new Circle(x + 30, y - 35, 20, Color.BROWN);

        // Arm R
        Circle circle8 = new Circle(x + 40, y + 60, 15, Color.BROWN);

        // Arm L
        Circle circle9 = new Circle(x - 40, y + 60, 15, Color.BROWN);

        // Right eye + pupil
        Circle circleRight = new Circle(x + 15, y - 10, 8, Color.WHITE);
        Circle circlePupil = new Circle(x + 15, y - 7, 5, Color.BLACK);

        // Left eye + pupil
        Circle circleLeft = new Circle(x - 15, y - 10, 8, Color.WHITE);
        Circle circlePupilLeft = new Circle(x - 15, y - 7, 5, Color.BLACK);

        // Nose
        Circle circleNose = new Circle(x, y + 5, 3, Color.BLACK);

        // Mouth lines
        Arc arcRight = new Arc(x + 10, y + 10, 10, 10, 160, 150);
        arcRight.setType(ArcType.OPEN);
        arcRight.setFill(Color.TRANSPARENT);
        arcRight.setStroke(Color.BLACK);

        Arc arcLeft = new Arc(x - 10, y + 10, 10, 10, 210, 150);
        arcLeft.setType(ArcType.OPEN);
        arcLeft.setFill(Color.TRANSPARENT);
        arcLeft.setStroke(Color.BLACK);

        g.getChildren().addAll(
                ellipse, ellipse2, circle, circle2, circle4, circle3, circle5,
                circle6, circle7, circle8, circle9,
                circleRight, circlePupil, circleLeft, circlePupilLeft,
                circleNose, arcRight, arcLeft);

        return g;
    }

    @Override
    public void start(Stage stage) {
        Group group1 = new Group();

        int numberOfBears = 6;
        int columns = 3;
        int spacingX = 200;
        int spacingY = 220;
        int startX = 150;
        int startY = 150;

        for (int i = 0; i < numberOfBears; i++) {
            int col = i % columns;
            int row = i / columns;
            group1.getChildren().add(createBear(
                    startX + col * spacingX,
                    startY + row * spacingY
            ));
        }
        stage.setScene(new Scene(group1, 800, 600, Color.LIGHTBLUE));
        stage.setTitle("Bears");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
