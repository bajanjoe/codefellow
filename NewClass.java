/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eastbound.interview;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author damien
 */
public class NewClass {

    String[] names = {"Bob", "Joe", "Pete", "Maze", "Carie", "Max", "Ian", "Matt", "Bob",
        "Orange", "Silver"};
    String[] color = {"red", "yellow", "blue", "orange", "black", "redish", "pink", "siler", "odd",
        "mix", "rainbow"};
    String[] food = {"hay", "pasturized", "corn"};
    String[] loc = {"Barn", "pasture", "Trails"};

    public static void main(String[] args) {
        NewClass myclass = new NewClass();
        myclass.run();
        //System.out.println("Hello world ");

    }

    public void run() {
        for (int i = 0; i < 11; i++) {
            Unicorn unicorn = new Unicorn(names[i], color[i], food[0], loc[0]);
            System.out.println("Barn Z Unicorns name " + unicorn.getName());
            System.out.println("Barn Z Unicorns color " + unicorn.getColor());
            System.out.println("Barn Z Unicorns food " + unicorn.getFood());
            System.out.println("Barn Z Unicorns location " + unicorn.getlocation() + "\n");
        }

    }

}
