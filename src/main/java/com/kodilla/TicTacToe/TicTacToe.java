package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private Image imageback = new Image("file:resources/image1.gif");

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);

        grid.add(new Field(Constans.EMPTY, 0, 0), 0, 0);
        grid.add(new Field(Constans.EMPTY, 1, 0), 1, 0);
        grid.add(new Field(Constans.EMPTY, 2, 0), 2, 0);

        grid.add(new Field(Constans.EMPTY, 0, 1), 0, 1);
        grid.add(new Field(Constans.EMPTY, 1, 1), 1, 1);
        grid.add(new Field(Constans.EMPTY, 2, 1), 2, 1);

        grid.add(new Field(Constans.EMPTY, 0, 2), 0, 2);
        grid.add(new Field(Constans.EMPTY, 1, 2), 1, 2);
        grid.add(new Field(Constans.EMPTY, 2, 2), 2, 2);

        Scene scene = new Scene(grid, 700, 700, Color.BLACK);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}