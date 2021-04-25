package com.praktikum4;

public class Main {

    public static void main(String[] args) {
        Tabung tabung = new Tabung(20,10);
        tabung.getLuasPermukaan();
        tabung.getVolume();

        Balok balok = new Balok(24,12,4);
        balok.getLuasPermukaan();
        balok.getVolume();
    }
}
