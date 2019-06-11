package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TicTacToe extends Application {
    static Stage window;
    static Button button;
    static Scene scene, endScene;



    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        button = new Button("Game is end. Click me for get back to application");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(0,0,0,25));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(FieldContainer.field00, 0, 0);
        grid.add(FieldContainer.field10, 1, 0);
        grid.add(FieldContainer.field20, 2, 0);

        grid.add(FieldContainer.field01, 0, 1);
        grid.add(FieldContainer.field11, 1, 1);
        grid.add(FieldContainer.field21, 2, 1);

        grid.add(FieldContainer.field02, 0, 2);
        grid.add(FieldContainer.field12, 1, 2);
        grid.add(FieldContainer.field22, 2, 2);

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