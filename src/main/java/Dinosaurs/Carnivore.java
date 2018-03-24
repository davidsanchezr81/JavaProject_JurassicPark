package Dinosaurs;

import Paddocks.Food;

import java.util.ArrayList;

public class Carnivore extends Dinosaur {

    private String subType;

    public Carnivore(String name, DinosaurType dinoType, int healthPoints, String subType){
        super(name, dinoType, healthPoints);
        this.subType = subType;

    }

    public String getSubType(){return this.subType;}

    public void setSubType(String subType){ this.subType = subType;}


}



