package com.company.players;

import java.util.Random;

public class Hulk extends Avenger{

    public Hulk(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avenger) {
        Random randomHulk = new Random();
        int helpHul = randomHulk.nextInt(3) + 2;
        for (int i = 0; i < avenger.length; i++) {
            if(avenger[i].getHealth() > 0 && avenger[i] == this){
                avenger[i].setDamage(avenger[i].getDamage() * helpHul);
            }
        }
        System.out.println(this.getName() + " умножает  на " + helpHul);
    }
}
