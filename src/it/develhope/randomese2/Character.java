package it.develhope.randomese2;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int lifePoints;
    private int manaPoints;

    private ArrayList<Skill> skills;

    public Character(String name, int lifePoints, int manaPoints, ArrayList<Skill> skills) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    private void addSkill(Skill s){
        this.skills.add(s);
    }

    private Skill getSkill(int i){
        return this.skills.get(i);
    }
    private boolean isAlive(){
        if(lifePoints>0)
            return true;
        else
            return false;
    }
    public abstract void attack(Character pg,Skill s);

    public void setName(String name) {
        this.name = name;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
