package com.company.players;

import java.util.Random;

public class IronMan extends Avenger {

    public IronMan(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        Random random = new Random();
        int count = 0;
        while (count <= avengers.length) {
            for (int i = 0; i < avengers.length; i++) {

                if (avengers[i].getHealth() > 0 && avengers[i] != this) {
                    avengers[i].setDamage(avengers[i].getDamage() + random.nextInt(60));
                    count++;
                    int point = random.nextInt(60);
                    for (int j = 0; j < avengers.length; j++) {

                        if (avengers[j].getHealth() > 0 && avengers[j] != this) {
                            if (avengers[j].getName().equals("Captain America")) {
                                avengers[j].setDamage(25);
                            } else if (avengers[j].getName().equals("Hulk")) {
                                avengers[j].setDamage(35);
                            } else if (avengers[j].getName().equals("Doctor")) {
                                avengers[j].setDamage(5);
                            } else if (avengers[j].getName().equals("Assistant")) {
                                avengers[j].setDamage(5);
                            }
                        }
                        avengers[i].setDamage(avengers[i].getDamage() + point);
                    }
                    System.out.println(this.getName() + " увеличил атаку " + avengers[i].getName() + " на " + point);
                }
            }
        }
    }
}
