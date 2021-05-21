package com.company.players;

import java.util.Random;

public class Thor extends Avenger{

    public Thor(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avenger) {
        Random random = new Random();
        int randomThor = random.nextInt();
        for (int i = 0; i < avenger.length; i++) {
            if (avenger[i].getHealth() > 0 && avenger[i] != this && avenger[i].getHealth() > 0){
                switch (randomThor){
                    case 1:
                        avenger[i].setHealth(avenger[i].getHealth() + thanos.getDamage());
                        break;
                    default:
                        thanos.setDamage(50);
                }
            }
        }
        System.out.println("Thor оглушил ");
    }
}
