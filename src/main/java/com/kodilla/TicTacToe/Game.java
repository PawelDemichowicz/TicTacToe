package com.kodilla.TicTacToe;

import javafx.scene.image.Image;

public class Game extends TicTacToe {


    public static boolean gameIsOn() {

        String winner;

        if (checkWinner(Constans.CROSS)) {

            winner = "The winner is CROSS";

        } else if (checkWinner(Constans.CIRCLE)) {

            winner = "The winner is CIRCLE";

        } else winner = "The game is on";
        return winner;
    }

    private static boolean checkWinner(Image cross) {
        return field00.getImage() == cross && field01.getImage() == cross && field02.getImage() == cross ||
                field10.getImage() == cross && field11.getImage() == cross && field12.getImage() == cross ||
                field20.getImage() == cross && field21.getImage() == cross && field22.getImage() == cross ||
                field00.getImage() == cross && field10.getImage() == cross && field20.getImage() == cross ||
                field01.getImage() == cross && field11.getImage() == cross && field21.getImage() == cross ||
                field02.getImage() == cross && field12.getImage() == cross && field22.getImage() == cross ||
                field00.getImage() == cross && field11.getImage() == cross && field22.getImage() == cross ||
                field20.getImage() == cross && field11.getImage() == cross && field02.getImage() == cross;
    }

    public static void whenFinished() {
        if (!gameIsOn()) {
            System.out.printf("The Game is ending....");
            TicTacToe.window.setScene(TicTacToe.endScene);
        }
    }

}
