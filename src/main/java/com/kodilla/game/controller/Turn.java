package com.kodilla.game.controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Turn extends ImageView {

    public Turn(Image image) {
        super(image);
    }

    public void whoseTurn() {
        setImage(Constants.CROSS_TURN);
        if (Field.isTurnX()) {
            setImage(Constants.CROSS_TURN);
        } else {
            setImage(Constants.CIRCLE_TURN);
        }
    }
}
