package Paddocks;

import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;

import java.util.ArrayList;

public abstract class  Paddock {

    public ArrayList<Dinosaur> dinosaurs;
    String name;
    int capacity;
    Food food;
    DinosaurType dinoType;



    public Paddock(String name, int capacity,DinosaurType dinoType ) {
        this.name = name;
        this.dinoType = dinoType;
        this.capacity = capacity;
        this.dinosaurs = new ArrayList<Dinosaur>();

    }

    public String getPaddockName() {
        return this.name;
    }

    public void setPaddockName(String name) {
        this.name = name;
    }

    public int getPaddockCapacity() {
        return this.capacity;
    }

    public void setPaddockCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDinoType(){
        return this.dinoType.getDinoType();
    }

    public String getDinoSubType(){
        return this.dinoType.toString();
    }

    public void addDinosaur(Dinosaur dinosaur) {
        if (!isPaddockFull() ) {
            dinosaurs.add(dinosaur);
        }
    }

    public void addDinosaurNoMatterWhat(Dinosaur dinosaur) {
        dinosaurs.add(dinosaur);
    }

    public void removeDinosaur(Dinosaur dinosaur) {
        this.dinosaurs.remove(dinosaur);
    }

    public ArrayList<Dinosaur> getDinosaursInPaddock() {
        return new ArrayList<Dinosaur>(dinosaurs);
    }

    public int getDinosaursCount() {
        return this.dinosaurs.size();
    }

    public boolean isPaddockFull() {
        return this.dinosaurs.size() == this.capacity;
    }

    ///////////////////////////////// TRANSFER HERBIVORE /////////////////////////////////

    public ArrayList<Dinosaur> removeNonMatchingDinosaur() {
        ArrayList<Dinosaur> nonMatchingDinosaur = new ArrayList<Dinosaur>();

        for (Dinosaur dinosaur : dinosaurs) {
            if (!dinosaur.getType().equals(getDinoType())) {
                nonMatchingDinosaur.add(dinosaur);
            }
        }
        for (Dinosaur dinosaur : nonMatchingDinosaur){
            removeDinosaur(dinosaur);
        }
        return nonMatchingDinosaur;
    }


    public void addNonMatchingDinosaur(ArrayList<Dinosaur> nonMatchingDinosaur){
        for (Dinosaur dinosaur : nonMatchingDinosaur){
            if (dinosaur.getType().equals(getDinoType()))
            addDinosaur(dinosaur);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////


    //////////////////////// NO DINOSAURS OF SAME CARNIVORE TYPE ////////////////////////












    /////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////// RAMPAGE /////////////////////////////////////

    public boolean rampage() {  return this.dinosaurs.size() > this.capacity; }

    public String rampageNotification(){
        if(rampage()){
            return "Rampage Situation! Run for your Life";}
        return "All good, no danger so far";
    }

}
    /////////////////////////////////////////////////////////////////////////////////////




//    public void rampage(Dinosaur dinosaur) {
//        for (Dinosaur dinosaur1 : dinosaurs) {
//            if (rampage1() || dinosaur1.hungryDinosaur()){
//            return; }
//
//        }
//    }





    // RAMPAGE VACIA BARRIGA DE DINOSAURIO







