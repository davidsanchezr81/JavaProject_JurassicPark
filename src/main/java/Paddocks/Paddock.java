package Paddocks;

import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public abstract class  Paddock {

    ArrayList<Dinosaur> dinosaurs;
    String name;
    int capacity;
    Food food;


    public Paddock(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.dinosaurs = new ArrayList<Dinosaur>();

    }

    public String getPaddockName(){ return this.name; }

    public void setPaddockName(String name){ this.name = name; }

    public int getPaddockCapacity() { return this.capacity; }

    public void setPaddockCapacity(int capacity){ this.capacity = capacity; }

    public void addDinosaur(Dinosaur dinosaur){ this.dinosaurs.add(dinosaur); }

    public void removeDinosaur(Dinosaur dinosaur){ this.dinosaurs.remove(dinosaur);}

    public ArrayList<Dinosaur> getDinosaursInPaddock(){return new ArrayList<Dinosaur>(dinosaurs);}

    public int getDinosaursCount() { return this.dinosaurs.size();}

    public void transferDinosaur(){
        for (Dinosaur dinosaur : dinosaurs){

        }
    }



    }





