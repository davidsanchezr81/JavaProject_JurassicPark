package Dinosaurs;

public class Carnivore extends Dinosaur {

    private String subType;

    public Carnivore(String name, String type , int healthPoints, String subType){
        super(name, type, healthPoints);
        this.subType = subType;

    }

    public String getSubType(){return this.subType;}

    public void setSubType(String subType){ this.subType = subType;}


}



