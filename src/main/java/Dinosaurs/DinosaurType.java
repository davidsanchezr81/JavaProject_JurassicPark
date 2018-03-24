package Dinosaurs;

public enum DinosaurType {

    CARNIVORE("Carnivore","Aggresive"),
    HERBIVORE("Herbivore","Peaceful");

    private String dinoType;
    private String temper;

    DinosaurType(String dinoType, String temper){
        this.dinoType = dinoType;
        this.temper = temper;
    }

    public String getDinoType(){ return this.dinoType; }

    public String getDinoTemper(){ return this.temper; }
}
