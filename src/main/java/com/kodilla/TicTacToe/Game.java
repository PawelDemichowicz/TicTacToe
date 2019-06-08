package com.kodilla.TicTacToe;

import static com.kodilla.TicTacToe.TicTacToe.*;

public class Game {

    public String whoWins(Field field00, Field field01, Field field02, Field field10, Field field11,Field field12, Field field20, Field field21, Field field22){

        String winner;

        if(field00.getImage() == Constans.CROSS && field01.getImage() == Constans.CROSS && field02.getImage() == Constans.CROSS ||
            field10.getImage() == Constans.CROSS && field11.getImage() == Constans.CROSS && field12.getImage()==Constans.CROSS ||
            field20.getImage() == Constans.CROSS && field21.getImage() == Constans.CROSS && field22.getImage()==Constans.CROSS ||
            field00.getImage() == Constans.CROSS && field10.getImage() == Constans.CROSS && field20.getImage()==Constans.CROSS ||
            field01.getImage() == Constans.CROSS && field11.getImage() == Constans.CROSS && field21.getImage()==Constans.CROSS ||
            field02.getImage() == Constans.CROSS && field12.getImage() == Constans.CROSS && field22.getImage()==Constans.CROSS ||
            field00.getImage() == Constans.CROSS && field11.getImage() == Constans.CROSS && field22.getImage()==Constans.CROSS ||
            field20.getImage() == Constans.CROSS && field11.getImage() == Constans.CROSS && field02.getImage()==Constans.CROSS){

        winner = "The winner is CROSS";

        } else if(field00.getImage() == Constans.CIRCLE && field01.getImage() == Constans.CIRCLE && field02.getImage() == Constans.CIRCLE ||
            field10.getImage() == Constans.CIRCLE && field11.getImage() == Constans.CIRCLE && field12.getImage()==Constans.CIRCLE ||
            field20.getImage() == Constans.CIRCLE && field21.getImage() == Constans.CIRCLE && field22.getImage()==Constans.CIRCLE ||
            field00.getImage() == Constans.CIRCLE && field10.getImage() == Constans.CIRCLE && field20.getImage()==Constans.CIRCLE ||
            field01.getImage() == Constans.CIRCLE && field11.getImage() == Constans.CIRCLE && field21.getImage()==Constans.CIRCLE ||
            field02.getImage() == Constans.CIRCLE && field12.getImage() == Constans.CIRCLE && field22.getImage()==Constans.CIRCLE ||
            field00.getImage() == Constans.CIRCLE && field11.getImage() == Constans.CIRCLE && field22.getImage()==Constans.CIRCLE ||
            field20.getImage() == Constans.CIRCLE && field11.getImage() == Constans.CIRCLE && field02.getImage()==Constans.CIRCLE){

        winner = "The winner is CIRCLE";

        }else winner = "The game is on";
        return winner;
    }

    public void whenFinished(){

        if (whoWins(field00,field01,field02,field10,field11,field12,field20,field21,field22) != "The game is on")
            System.out.printf("The Game is ending....");

    }
}
