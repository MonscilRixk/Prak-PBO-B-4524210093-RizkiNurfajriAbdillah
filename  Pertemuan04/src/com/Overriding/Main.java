package com.Overriding;

public class Main {
    public static void main(String[] args) {
        
        Kucing Kucing = new Kucing();
        Kucing.suara();

        Sapi Sapi = new Sapi();
        Sapi.makan();

        Burung Burung = new Burung();
        Burung.makan();
    }
}
