package com.geektech;

public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        HavingSuperAbility[] SuperAbility = {magic, medic, warrior};

        for (int i = 0; i < SuperAbility.length; i++) {

            System.out.println(SuperAbility[i].applySuperAbility("применил супер способность"));
        }
    }
}
