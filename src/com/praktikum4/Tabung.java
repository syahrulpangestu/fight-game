package com.praktikum4;

public class Tabung extends BangunRuang {
    private int tinggi;
    private int jari;

    public Tabung(int tinggi, int jari){
        this.tinggi = tinggi;
        this.jari = jari;
    }

    @Override
    void getLuasPermukaan() {
        System.out.println("hasil luas permukaan tabung " + 2 * 3.14 * jari * (jari + tinggi));
    }

    @Override
    void getVolume() {
        System.out.println("hasil volume tabung " + 3.14*(jari*jari)*tinggi);
    }
}
