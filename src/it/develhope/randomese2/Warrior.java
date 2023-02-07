package it.develhope.randomese2;

import java.util.ArrayList;

public class Warrior extends Character{
    public Warrior(String name, int lifePoints, int manaPoints,int strenght, ArrayList<Skill> skills) {
        super(name, lifePoints, manaPoints, skills);
        this.strenght=strenght;
    }

    @Override
    public void attack(Character pg, Skill s) {
    pg.setLifePoints(pg.getLifePoints()-(this.strenght+s.getDamage()));
    }

    private int strenght;

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
