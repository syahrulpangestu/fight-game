package com.kegiatan2;

public class Warrior extends Character {

    public Warrior(){
        super.setAttackDamage(800);
        super.setHealthPoint(3000);
        super.setDefense(250);
        super.setLevel(0);
        super.setLifeStatus(true);
    }
    public Warrior(int level){
        super.setAttackDamage(800+(15*level));
        super.setHealthPoint(3000+(100*level));
        super.setDefense(250+(10*level));
        super.setLevel(level);
        super.setLifeStatus(true);
    }
    @Override
    public void spawnIntro() {
        if (getHealthPoint() <= 0){
            System.out.println("mati tidak bisa nyerang");
        }else {
            System.out.println("ape looh");
        }
    }

}
