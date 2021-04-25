package com.kegiatan2;

public abstract class Character {
    private double healthPoint;
    private double attackDamage;
    private double defense;
    private int level;
    private boolean lifeStatus;

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAttackDamage() {
        return attackDamage;
    }
    public void methodName() {
        
    }
    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public boolean getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public void attack(Character target) {
        target.reviewDamage(this.attackDamage);
    }

    public void reviewDamage(double attackDamage) {
        double realDamage;
        if (getHealthPoint() > 0) {
            realDamage = attackDamage - this.defense;
            this.healthPoint -= (int) realDamage;
        }
        if (getHealthPoint()<0){
            this.healthPoint = 0;
            this.lifeStatus = false;
        }
    }

    public abstract void spawnIntro();

    public void checkStatus(){
        System.out.println(this.healthPoint);
    }

}
