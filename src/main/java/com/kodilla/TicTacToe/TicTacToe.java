package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
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

       static Field field00 = new Field(Constans.EMPTY,0,0);
       static Field field10 = new Field(Constans.EMPTY,1,0);
       static Field field20 = new Field(Constans.EMPTY,2,0);
       static Field field01 = new Field(Constans.EMPTY,0,1);
       static Field field11 = new Field(Constans.EMPTY,1,1);
       static Field field21 = new Field(Constans.EMPTY,2,1);
       static Field field02 = new Field(Constans.EMPTY,0,2);
       static Field field12 = new Field(Constans.EMPTY,1,2);
       static Field field22 = new Field(Constans.EMPTY,2,2);


    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(0,0,0,25));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(field00, 0, 0);
        grid.add(field10, 1, 0);
        grid.add(field20, 2, 0);

        grid.add(field01, 0, 1);
        grid.add(field11, 1, 1);
        grid.add(field21, 2, 1);

        grid.add(field02, 0, 2);
        grid.add(field12, 1, 2);
        grid.add(field22, 2, 2);

        Scene scene = new Scene(grid, 900, 600, Color.BLACK);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}