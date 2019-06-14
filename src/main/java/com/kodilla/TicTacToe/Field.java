package com.kodilla.TicTacToe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Field extends ImageView {

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
            } else {
                this.setImage(Constans.CIRCLE);
                turnX = true;
            }
        }
        boolean isGameOn = Game.getInstance().checkIfGameIsOn();

        if (!isGameOn) {
            Game.getInstance().showWhoWins();
        }
        FieldContainer.fieldTurn.whoseTurn();
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
