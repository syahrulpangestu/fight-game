package com.kegiatan2;

public class Assassin extends Character implements CriticalDamage {

    public Assassin(){
        super.setAttackDamage(750+(750*plusDamage));
        super.setHealthPoint(2500);
        super.setDefense(200);
        super.setLevel(0);
        super.setLifeStatus(true);
    }
    public Assassin(int level){
        super.setAttackDamage(750+(25*level)+(750*plusDamage)+10);
        super.setHealthPoint(2500+(80*level));
        super.setDefense(200+(10*level));
        super.setLevel(level);
        super.setLifeStatus(true);
    }
    @Override
    public void spawnIntro() {
        if (getHealthPoint() <= 0){
            System.out.println("mati tidak bisa nyerang");
        }else {
            System.out.println("aku akan menyerang mu");
        }
    }
}
