package com.kegiatan2;

public class Tank extends Character {

    public Tank(){
        super.setAttackDamage(400);
        super.setHealthPoint(5000);
        super.setDefense(400);
        super.setLevel(0);
        super.setLifeStatus(true);
    }
    public Tank(int level){
        super.setAttackDamage(400+(10*level));
        super.setHealthPoint(5000+(150*level));
        super.setDefense(400+(10*level));
        super.setLevel(level);
        super.setLifeStatus(true);
    }
    @Override
    public void spawnIntro() {
        if (getHealthPoint() <= 0){
            System.out.println("mati tidak bisa nyerang");
        }else {
            System.out.println("u cant defeat me");
        }
    }
}
