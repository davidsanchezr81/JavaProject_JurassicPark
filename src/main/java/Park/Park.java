package Park;

import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Paddocks.Food;
import Paddocks.Paddock;
import Paddocks.*;

import java.util.ArrayList;

public class Park {

    private String name;
    private ArrayList<Visitor> visitors;
    private ArrayList<Paddock> paddocks;



    public Park(String name){
        this.name = name;
        this.visitors = new ArrayList<Visitor>();
        this.paddocks = new ArrayList<Paddock>();

    }

    public String getName(){ return this.name; }

    public ArrayList<Visitor> getVisitors() { return visitors; }

//    public Paddock getPaddockNeedTransfer(){
//        for(Paddock paddock : paddocks) {
//            for (Dinosaur dinosaur : paddock.dinosaurs) {
//                if (paddock.getPaddockName().equals(dinosaur.getName())) ;
//                return paddock;
//            }
//        }
//        return null;
//    }



    public ArrayList<Paddock> getPaddocks() { return paddocks; }

    public int countVisitors(){ return this.visitors.size(); }

    public int countPaddocks(){ return this.paddocks.size(); }

//    public void checkInVisitor1(Visitor visitor) {
//        for (Paddock paddock : paddocks) {
//            if (!paddock.rampage() || visitor.getAge() >= 18) {
//                this.visitors.add(visitor);
//            }
//        }
//    }

    public void checkInVisitor(Visitor visitor) {
        for (Paddock paddock : paddocks) {
            if (!paddock.rampage())  {
                this.visitors.add(visitor);
            }
        }
    }


    public void checkOutVisitor(Visitor visitor) {
        for (Paddock paddock : paddocks) {
            if (!paddock.rampage()) {
                this.visitors.remove(visitor);
            }
        }
    }

    public void addPaddock(Paddock paddock){ this.paddocks.add(paddock);}

    public void removePaddock(Paddock paddock){ this.paddocks.remove(paddock);}



}
