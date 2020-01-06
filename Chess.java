package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.RandomAccess;

public class Chess {
Integer r;


    public static void main(String[] args) {

        Random r = new Random();

        String[][] plansza = new String[10][10];  //tworzenie planszy do gry w szachy
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                plansza[i][j] = "__";
            }
        }
        System.out.println();
        System.out.println("Współrzędne wylosowanych figur");
        Piece first = new Piece();      //tworzenie poszczególnych figur
        first.getName();

        Piece sec = new Piece();
        sec.getName();
//        while (plansza[sec.x][sec.y]==("__")){
  //          sec.getName();
    //    }

        Piece third = new Piece();
        third.getName();
 //       while (plansza[third.x][third.y]==("__")){
   //         third.getName();
     //   }

        Piece fourth = new Piece();
        fourth.getName();
  //      while (plansza[fourth.x][fourth.y]==("__")){
    //        fourth.getName();
      //  }


        Piece fifth = new Piece();
        fifth.getName();
   //     while (plansza[fifth.x][fifth.y]==("__")) {
     //       fifth.getName();
       // }






/*
        System.out.println("name " + first.name);
        System.out.println("colour " + first.colour);
        System.out.println("x " + first.x);
        System.out.println("y " + first.y);
        System.out.println("c " + first.c);
        System.out.println("n " + first.n);
*/

        plansza[first.x][first.y] = first.c + first.n;      //umieszczenie figury na planszy
        plansza[sec.x][sec.y] = sec.c + sec.n;
        plansza[third.x][third.y] = third.c + third.n;
        plansza[fourth.x][fourth.y] = fourth.c + fourth.n;
        plansza[fifth.x][fifth.y] = fifth.c + fifth.n;

        System.out.println();
        System.out.println("Figury na planszy");

        for (int i = 0; i < 10; i++) {      //wyświtlenie planszy z figurami
            for (int j = 0; j < 10; j++) {
                System.out.print(plansza[i][j] + "|");
            }
            System.out.println();
        }
    }
}





