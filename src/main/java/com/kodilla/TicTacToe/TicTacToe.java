package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TicTacToe extends Application {
    static Stage window;
    static Button button;
    static Scene scene, endScene;
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
        window = primaryStage;
        button = new Button("Game is end. Click me for get back to application");

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

        StackPane endLayout = new StackPane();
        endLayout.getChildren().add(button);

        scene = new Scene(grid, 900, 600, Color.GREEN);
        endScene = new Scene(endLayout,300,300);

        button.setOnAction(event -> window.setScene(scene));

        window.setTitle("TicTacToe");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}