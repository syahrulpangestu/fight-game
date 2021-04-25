package com.praktikum4;

public class Balok extends BangunRuang{
    private int panjang, lebar, tinggi;
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    void getLuasPermukaan() {
        System.out.println("hasil luas permukaan balok : "+2 * (panjang*lebar + panjang*tinggi +lebar*tinggi));
    }

    @Override
    void getVolume() {
        System.out.println("hasil volume balok : "+panjang*lebar*tinggi);
    }
}
