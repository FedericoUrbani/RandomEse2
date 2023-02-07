package it.develhope.randomese2;

import java.util.ArrayList;

public class Wizard extends Character {
    private int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints, int abilitypower,ArrayList<Skill> skills) {
        super(name, lifePoints, manaPoints, skills);
        this.abilityPower=abilitypower;
    }

    @Override
    public void attack(Character pg, Skill s) {
    pg.setLifePoints(getLifePoints()-(s.getDamage()+this.abilityPower));
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }
}
