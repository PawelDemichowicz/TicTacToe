package com.kodilla.TicTacToe;

import com.google.common.collect.Sets;
import javafx.scene.image.Image;

import java.util.Set;

import static com.kodilla.TicTacToe.FieldContainer.field00;
import static com.kodilla.TicTacToe.FieldContainer.field01;
import static com.kodilla.TicTacToe.FieldContainer.field02;
import static com.kodilla.TicTacToe.FieldContainer.field10;
import static com.kodilla.TicTacToe.FieldContainer.field11;
import static com.kodilla.TicTacToe.FieldContainer.field12;
import static com.kodilla.TicTacToe.FieldContainer.field20;
import static com.kodilla.TicTacToe.FieldContainer.field21;
import static com.kodilla.TicTacToe.FieldContainer.field22;

public class Game {

    private static Game instance;

    private Game() {
    }

    static Game getInstance(){
        if(instance == null){
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
            return false;
        }

        if (checkIfWinner(Constans.CIRCLE)) {
            System.out.println("The winner is CIRCLE");
            return false;
        }

        System.out.println("The game is on");
        return true;
    }

    private boolean checkIfWinner(Image image) {
        return this.rows
                .stream()
                .anyMatch(r->r.checkIfWinner(image));
    }

    public static void finishTheGame() {
        System.out.print("The Game is ending....");
        TicTacToe.window.setScene(TicTacToe.endScene);
    }

}
