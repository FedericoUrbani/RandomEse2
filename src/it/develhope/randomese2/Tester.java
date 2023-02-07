package it.develhope.randomese2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {


    Skill skillMage1= new Skill("ArcaneComet",10,5);
    Skill skillMage2= new Skill("ArcaneBarrage",20,15);
    Skill skillWarrior= new Skill("Slash",10,5);
    Skill skillWarrior2= new Skill("MountainFall", 90,20);

    ArrayList<Skill> skilltreeWar= new ArrayList();
    skilltreeWar.add(skillWarrior);
    skilltreeWar.add(skillWarrior2);
    ArrayList<Skill> skilltreeMage= new ArrayList();
    skilltreeMage.add(skillMage1);
    skilltreeMage.add(skillMage2);

    Warrior warrior= new Warrior("warrior",100,100,30,skilltreeWar);
    Wizard wizard= new Wizard("wizard",100,100,30,skilltreeMage);

    warrior.attack(wizard,skilltreeWar.get(0));
        warrior.attack(wizard,skilltreeWar.get(1));
        wizard.attack(warrior,skilltreeMage.get(0));
        wizard.attack(warrior,skilltreeMage.get(1));

        System.out.println(wizard.getLifePoints());
        System.out.println(warrior.getLifePoints());

    }
}
