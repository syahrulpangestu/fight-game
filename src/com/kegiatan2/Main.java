package com.kegiatan2;

public class Main {
    public static void main(String[] args) {
        int i =0;
        Assassin assassin = new Assassin(2);
        Tank tank = new Tank(0);
        System.out.println("===Player 1===");
        System.out.println("level : "+assassin.getLevel());
        System.out.println("health poin : "+assassin.getHealthPoint()+"\tdefense : "+assassin.getDefense());
        System.out.println("attack damage : "+assassin.getAttackDamage()+"\tlife status : "+assassin.getLifeStatus());
        System.out.println("\n===Player 2===");
        System.out.println("level : "+tank.getLevel());
        System.out.println("health poin : "+tank.getHealthPoint()+"\tdefense : "+tank.getDefense());
        System.out.println("attack damage : "+tank.getAttackDamage()+"\tlife status : "+tank.getLifeStatus());

        System.out.println("\n####### ROUND START ######");
        while (tank.getLifeStatus() && assassin.getLifeStatus()) {
            System.out.println("\n====TURN "+(i+1)+"====");
            System.out.println("---Player 1 Move---");
            assassin.spawnIntro();
            assassin.attack(tank);
            System.out.print("Player 2 HP remaining : ");
            tank.checkStatus();

            System.out.println("---Player 2 Move---");
            tank.spawnIntro();
            tank.attack(assassin);
            System.out.print("Player 1 HP remaining : ");
            assassin.checkStatus();
            i++;
            if (!tank.getLifeStatus() || !assassin.getLifeStatus()){
                if (tank.getHealthPoint()>assassin.getHealthPoint()){
                    System.out.println("\nplayer 2 win");
                }else if (assassin.getHealthPoint()>tank.getHealthPoint()){
                    System.out.println("\nplayer 1 win");
                }
            }
        }
    }
}
