package it.develhope.randomese2;

public class Skill {

    private String name;
    private int damage;

    private int mana;

    public Skill(String name, int damage, int mana) {
        this.name = name;
        this.damage = damage;
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
