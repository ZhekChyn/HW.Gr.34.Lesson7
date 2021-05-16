package com.geektech;

public class Medic extends Hero{

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic " + superAbilityType + " Ultimate Healing";
    }
}
