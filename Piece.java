package com.company;

import java.util.Random;

public class Piece {
    Integer name;
    Integer colour;
    Integer x;
    Integer y;
    String n;
    String c;

    void getName() {
        Random r = new Random();

        name = r.nextInt(3);
        colour = r.nextInt(2);
        x = r.nextInt(10);  //10
        y = r.nextInt(10);  //10

        if (colour < 1) {
            c= "b";
        } else  if (colour > 0) {
            c= "w";
        }

        switch (name) {
            case 0:
                n = "R";
                break;
            case 1:
                n = "K";
                break;
            case 2:
                n = "Q";

        }
        System.out.println(x + " " + y + " " + c  + n);  // wyświtlanie wylosowanych współrzędnych i figur

        }

    }


