package com.smurf;

import java.util.ArrayList;
import java.util.List;

public class Smurf {

    private String name;
    private static final List<String> usedName = new ArrayList<>();

    public static Smurf createSmurf(String name) {
        if (usedName.contains(name)){
            System.out.println("Cannot create "+name + " Smurf");
            return null;
        }
        else {
            System.out.println("Creating " + name + " Smurf");
            return new Smurf(name);
        }
    }

    private Smurf(String name) {
        if (usedName.contains(name)){
            return;
        }
        this.name = name;
        usedName.add(name);
    }


    public void printName() {
        System.out.println("My name is " + name + " Smurf.");
    }

    public void eat() {
        System.out.println(name + " Smurf is eating Smurfberries.");
    }

}
