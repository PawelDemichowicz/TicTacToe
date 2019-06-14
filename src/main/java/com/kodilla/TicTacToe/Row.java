package com.kodilla.TicTacToe;

import com.google.common.collect.Lists;
import javafx.scene.image.Image;

import java.util.List;

public class Row {

    private List<Field> rows;

    public Row(Field... f) {
        this.rows = Lists.newArrayList(f);
    }

    boolean checkIfWinner(Image image) {

        return this.rows.get(0).getImage().equals(image) &&
                this.rows.get(0).getImage().equals(this.rows.get(1).getImage())
                && this.rows.get(1).getImage().equals(this.rows.get(2).getImage());

    }

    public List<Field> getRows() {
        return rows;
    }
}
