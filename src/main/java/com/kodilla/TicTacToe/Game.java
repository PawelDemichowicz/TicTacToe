package com.kodilla.TicTacToe;

import com.google.common.collect.Sets;
import javafx.scene.image.Image;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.kodilla.TicTacToe.FieldContainer.*;

public class Game {

    public int crossScore = 0;
    public int circleScore = 0;
    private static Game instance;

    private Game() {
    }

    static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Set<Row> rows = Sets.newHashSet(
            new Row(field00, field01, field02),
            new Row(field10, field11, field12),
            new Row(field20, field21, field22),

            new Row(field00, field10, field20),
            new Row(field01, field11, field21),
            new Row(field02, field12, field22),

            new Row(field00, field11, field22),
            new Row(field20, field11, field02)
    );

    public boolean checkIfGameIsOn() {

        if (checkIfWinner(Constans.CROSS)) {
            System.out.println("The winner is CROSS");
            crossScore++;
            return false;
        }

        if (checkIfWinner(Constans.CIRCLE)) {
            System.out.println("The winner is CIRCLE");
            circleScore++;
            return false;
        }
        if (checkIfDraw()) {
            System.out.println("Draw");
            return false;
        }
        return true;
    }

    private boolean checkIfWinner(Image image) {
        return this.rows
                .stream()
                .anyMatch(r -> r.checkIfWinner(image));
    }

    private boolean checkIfDraw() {
        return this.rows
                .stream()
                .map(Row::getRows)
                .flatMap(Collection::stream)
                .noneMatch(r -> r.getImage().equals(Constans.EMPTY));
    }

    public void showWhoWins() {
        System.out.print("The Game is ending....");

        if (checkIfWinner(Constans.CROSS)) {
            TicTacToe.winner.setText("Cross is winner");
        }
        if (checkIfWinner(Constans.CIRCLE)) {
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
        collect.forEach(x -> x.setImage(Constans.EMPTY));
    }
}
