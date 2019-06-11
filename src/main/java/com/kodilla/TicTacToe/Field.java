package com.kodilla.TicTacToe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import static com.kodilla.TicTacToe.TicTacToe.*;

public class Field extends ImageView{

    private static boolean turnX = true;
    private int col;
    private int row;

    public Field(Image image, int col, int row) {
        super(image);
        this.col = col;
        this.row = row;
        this.setOnMouseClicked(event -> handleMouseClicked());

    }

    private void handleMouseClicked() {

        if (getImage() == Constans.EMPTY) {
            if (turnX) {
                this.setImage(Constans.CROSS);
                turnX = false;
                System.out.println(turnX);
            } else {
                this.setImage(Constans.CIRCLE);
                turnX = true;
                System.out.println(turnX);
            }
        }
        String winner = Game.gameIsOn(field00,field01,field02,field10,field11,field12,field20,field21,field22);
        System.out.println(winner);
        Game.whenFinished();

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public static boolean isTurnX() {
        return turnX;
    }

}
