package com.company.players;

import java.util.Random;

public class CaptainAmerica extends Avenger{
    Random random = new Random();

    public CaptainAmerica(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        for (int i = 0; i < avengers.length; i++) {
            avengers[i].setDamage(25);
            if (avengers[i].getHealth() > 0 && avengers[i] == this){
                if (avengers[i].getHealth() > 0 && avengers[i] == this){
                    avengers[i].setDamage(avengers[i].getDamage() + random.nextInt(thanos.getDamage()));
                    System.out.println(avengers[i].getName() + " получил " + (avengers[i].getDamage() - 25) + " и ударил " + avengers[i].getDamage());
                }
            }
        }
    }
}
