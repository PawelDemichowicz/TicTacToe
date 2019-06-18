package com.kodilla.game.controller;

import com.google.common.collect.Sets;
import com.kodilla.game.TicTacToe;
import javafx.scene.image.Image;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Game {

    public int crossScore = 0;
    public int circleScore = 0;
    private static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public Set<Row> rows = Sets.newHashSet(
            new Row(FieldContainer.field00, FieldContainer.field01, FieldContainer.field02),
            new Row(FieldContainer.field10, FieldContainer.field11, FieldContainer.field12),
            new Row(FieldContainer.field20, FieldContainer.field21, FieldContainer.field22),

            new Row(FieldContainer.field00, FieldContainer.field10, FieldContainer.field20),
            new Row(FieldContainer.field01, FieldContainer.field11, FieldContainer.field21),
            new Row(FieldContainer.field02, FieldContainer.field12, FieldContainer.field22),

            new Row(FieldContainer.field00, FieldContainer.field11, FieldContainer.field22),
            new Row(FieldContainer.field20, FieldContainer.field11, FieldContainer.field02)
    );

    public boolean checkIfGameIsOn() {

        if (checkIfWinner(Constants.CROSS)) {
            crossScore++;
            return false;
        }

        if (checkIfWinner(Constants.CIRCLE)) {
            circleScore++;
            return false;
        }
        if (checkIfDraw()) {
            return false;
        }
        return true;
    }

    public boolean checkIfWinner(Image image) {
        return this.rows
                .stream()
                .anyMatch(r -> r.checkIfWinner(image));
    }

    public boolean checkIfDraw() {
        return this.rows
                .stream()
                .map(Row::getRows)
                .flatMap(Collection::stream)
                .noneMatch(r -> r.getImage().equals(Constants.EMPTY));
    }

    public void showWhoWins() {
        if (checkIfWinner(Constants.CROSS)) {
            TicTacToe.winner.setText("Cross is winner");
        }
        if (checkIfWinner(Constants.CIRCLE)) {
            TicTacToe.winner.setText("Circle is winner");
        }
        if (checkIfDraw()) {
            TicTacToe.winner.setText("Draw");
        }
        TicTacToe.window.setScene(TicTacToe.endScene);
    }

    public void clearApp() {
        List<Field> collect = rows.stream()
                .map(Row::getRows)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        collect.forEach(x -> x.setImage(Constants.EMPTY));
    }
}
