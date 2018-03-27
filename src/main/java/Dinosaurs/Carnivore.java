package Dinosaurs;

import Paddocks.Food;

import java.util.ArrayList;

public class Carnivore extends Dinosaur {

    private CarnSubType subType;

    public Carnivore(String name, DinosaurType dinoType, int healthPoints, CarnSubType subType){
        super(name, dinoType, healthPoints);
        this.subType = subType;
    }

    public String getSubType(){return this.subType.getName();}


}



