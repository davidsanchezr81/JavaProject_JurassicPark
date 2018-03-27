package Paddocks;

import Dinosaurs.Dinosaur;
import Dinosaurs.Herbivore;

import java.util.ArrayList;

public abstract class  Paddock {

    public ArrayList<Dinosaur> dinosaurs;
    String name;
    int capacity;
    Food food;


    public Paddock(String name, int capacity) {
        this.name = name;
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

    public ArrayList<Dinosaur> removeNonMatchingDinosaur() {
        ArrayList<Dinosaur> nonMatchingDinosaur = new ArrayList<Dinosaur>();
        // "d"=="d"
        // "d".equals("d")
        for (Dinosaur dinosaur1 : dinosaurs) {
            if (!dinosaur1.getType().equals(getPaddockName())) {
                nonMatchingDinosaur.add(dinosaur1);
            }
        }
        for (Dinosaur dinosaur1 : nonMatchingDinosaur){
            removeDinosaur(dinosaur1);
        }
        return nonMatchingDinosaur;
    }

//
//    public void addnonmatching(array)
//        for item in array
//    addDinosaur()










    // RAMPAGE


    public boolean rampage() {  return this.dinosaurs.size() > this.capacity; }

    public String rampageNotification(){
        if(rampage()){
            return "Rampage - Run";}
        return "All good, no danger so far";
    }




}
    // RAMPAGE VACIA BARRIGA DE DINOSAURIO







