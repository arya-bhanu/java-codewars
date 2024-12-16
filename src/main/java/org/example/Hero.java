package org.example;

public class Hero {
    public String name, position;
    public Integer health, damage, experience;
    Hero(String name){
        this.name = name;
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }
    Hero(){
        this.name = "Hero";
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }
}
