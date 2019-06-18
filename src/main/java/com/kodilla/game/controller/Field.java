package com.kodilla.game.controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Field extends ImageView {

    private static boolean turnX = true;

    public Field(Image image) {
        super(image);
        this.setOnMouseClicked(event -> handleMouseClicked());

    }

    public static boolean isTurnX() {
        return turnX;
    }

    private void handleMouseClicked() {

        if (getImage() == Constants.EMPTY) {
            if (turnX) {
                this.setImage(Constants.CROSS);
                turnX = false;
            } else {
                this.setImage(Constants.CIRCLE);
                turnX = true;
            }
        }
        boolean isGameOn = Game.getInstance().checkIfGameIsOn();

        if (!isGameOn) {
            Game.getInstance().showWhoWins();
        }
        FieldContainer.fieldTurn.whoseTurn();
    }
}
