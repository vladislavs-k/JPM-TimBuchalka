package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> monster = new ArrayList<>();
        monster.add(0, name);
        monster.add(1, Integer.toString(hitPoints));
        monster.add(2, Integer.toString(strength));
        return monster;
    }

    @Override
    public void read(List<String> stringList) {
        if (stringList != null && stringList.size() > 0) {
            name = stringList.get(0);
            hitPoints = Integer.parseInt(stringList.get(1));
            strength = Integer.parseInt(stringList.get(2));
        }
    }

    @Override
    public String toString() {
        return ("Monster{name='" + name + "', hitPoints=" +
                hitPoints + ", strength=" + strength + "}");
    }


//    @Override
//    public String toString() {
//        return "Monster{" +
//                "name='" + name + '\'' +
//                ", hitPoints=" + hitPoints +
//                ", strength=" + strength +
//                '}';
//    }
}
