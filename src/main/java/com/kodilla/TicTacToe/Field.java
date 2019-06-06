package com.kodilla.TicTacToe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Field extends ImageView {

    private int col;
    private int row;

    public Field(Image image, int col, int row) {
        super(image);
        this.col = col;
        this.row = row;
        this.setOnMouseClicked(event -> handleMouseClicked());

    }

    private void handleMouseClicked() {
        System.out.println("Field clicked col: " + col + ", row: " + row);
        this.setImage(Constans.CROSS);

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


}
