package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    static Stage window;
    static Button button;
    static Scene scene, endScene;
    static Label winner = new Label();
    static VBox endLayout = new VBox(10);


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        button = new Button("New game");

        Label turn = new Label("Turn: ");
        turn.setFont(new Font("Arial", 30));
        turn.setTranslateX(50);

        Label statistics = new Label("Wygrane");
        statistics.setFont(new Font("Arial", 30));
        statistics.setTranslateX(70);
        statistics.setTranslateY(-70);

        Label cross = new Label("Cross: " + Game.getInstance().crossScore);
        cross.setFont(new Font("Arial", 25));

        Label circle = new Label("Circle: " + Game.getInstance().circleScore);
        circle.setFont(new Font("Arial", 25));

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

        grid.add(statistics, 4, 1);
        grid.add(cross, 4, 1);
        grid.add(circle, 5, 1);

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