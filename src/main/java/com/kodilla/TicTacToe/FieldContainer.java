package com.kodilla.TicTacToe;

public class FieldContainer {

    static Field field00 = new Field(Constans.EMPTY,0,0);
    static Field field10 = new Field(Constans.EMPTY,1,0);
    static Field field20 = new Field(Constans.EMPTY,2,0);
    static Field field01 = new Field(Constans.EMPTY,0,1);
    static Field field11 = new Field(Constans.EMPTY,1,1);
    static Field field21 = new Field(Constans.EMPTY,2,1);
    static Field field02 = new Field(Constans.EMPTY,0,2);
    static Field field12 = new Field(Constans.EMPTY,1,2);
    static Field field22 = new Field(Constans.EMPTY,2,2);

    static Turn fieldTurn = new Turn(Constans.CROSS_TURN);



}
