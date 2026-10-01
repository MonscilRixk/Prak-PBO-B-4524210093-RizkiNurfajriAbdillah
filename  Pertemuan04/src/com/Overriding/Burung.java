package com.Overriding;

public class Burung extends Hewan {

    @Override
    void makan() {
        System.out.println("Burung makan biji-bijian");
    }
}
