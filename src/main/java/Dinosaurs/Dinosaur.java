package Dinosaurs;

import Paddocks.Food;

import java.util.ArrayList;

public abstract class Dinosaur {
    private String name;
    private String type;
    private ArrayList<Food> belly;
    private int healthPoints;



    public Dinosaur(String name, String type, int healthPoints) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;

    }

    public String getName() {return this.name;}

    public void setName(String name ){this.name = name;}

    public String getType(){return this.type;}

    public void setType(String type){this.type = type;}

    public int getHealthPoints(){ return this.healthPoints;}

    public void setHealthPoints(int healthPoints){this.healthPoints = healthPoints;}

    public void increaseHealthPoints(int food){ this.healthPoints = healthPoints + food;}

    public void addFoodToDinosaurBelly(Food food){ this.belly.add(food);}

    public void feedDinosaur(Food food) {
        if(healthPoints > 5 ){
            addFoodToDinosaurBelly(food);
            increaseHealthPoints(food.getEnergy());


        }
    }

}