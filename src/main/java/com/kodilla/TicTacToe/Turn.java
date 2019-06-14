package com.kodilla.TicTacToe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Turn extends ImageView {

    public Turn(Image image) {
        super(image);
    }

    public void whoseTurn() {
        setImage(Constans.CROSS_TURN);
        if (Field.isTurnX()) {
            setImage(Constans.CROSS_TURN);
        } else {
            setImage(Constans.CIRCLE_TURN);
        }
    }
}
