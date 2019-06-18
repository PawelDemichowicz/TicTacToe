package com.kodilla.game;

import com.kodilla.game.controller.ConfirmBox;
import com.kodilla.game.controller.FieldContainer;
import com.kodilla.game.controller.Game;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    public static Stage window;
    public static Button button;
    public static Button reset;
    public static Scene scene, endScene;
    public static Label winner = new Label();
    public static VBox endLayout = new VBox(10);


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        button = new Button("New game");
        reset = new Button("Reset");

        reset.setTranslateX(-15);
        reset.setTranslateY(60);
        reset.setFont(new Font("Arial", 20));

        Label turn = new Label("Turn: ");
        turn.setFont(new Font("Arial", 30));
        turn.setTranslateX(20);

        Label wins = new Label("Wins");
        wins.setFont(new Font("Arial", 30));
        wins.setTranslateX(95);
        wins.setTranslateY(-60);

        Label cross = new Label("Cross: " + Game.getInstance().crossScore);
        cross.setFont(new Font("Arial", 25));
        cross.setTranslateX(20);

        Label circle = new Label("Circle: " + Game.getInstance().circleScore);
        circle.setFont(new Font("Arial", 25));
        circle.setTranslateX(40);

        winner.setFont(new Font("Arial", 40));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(0, 0, 0, 25));
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

        grid.add(turn, 4, 0);
        grid.add(FieldContainer.fieldTurn, 5, 0);

        grid.add(wins, 4, 1);
        grid.add(cross, 4, 1);
        grid.add(circle, 5, 1);

        grid.add(reset, 5, 1);

        endLayout.getChildren().addAll(winner, button);
        endLayout.setAlignment(Pos.CENTER);

        scene = new Scene(grid, 900, 600, Color.BLACK);
        endScene = new Scene(endLayout, 300, 300, Color.BLACK);

        button.setOnAction(event -> {
            window.setScene(scene);
            Game.getInstance().clearApp();
            cross.setText("Cross: " + Game.getInstance().crossScore);
            circle.setText("Circle: " + Game.getInstance().circleScore);
        });

        reset.setOnAction(event -> {
            Game.getInstance().crossScore = 0;
            Game.getInstance().circleScore = 0;
            cross.setText("Cross: " + Game.getInstance().crossScore);
            circle.setText("Circle: " + Game.getInstance().circleScore);
        });

        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });
        window.setTitle("TicTacToe");
        window.setResizable(false);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Exit", "Sure you want to exit?");
        if (answer) {
            window.close();
        }
    }

    public static void main(String[] args) {
        launch(args);

    }
}