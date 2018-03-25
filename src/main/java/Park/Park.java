package Park;

import Dinosaurs.DinosaurType;
import Paddocks.Food;

import java.util.ArrayList;

public class Park {

    private String name;
    private ArrayList<Visitor> visitors;

    public Park(String name){
        this.name = name;
        this.visitors = new ArrayList<Visitor>();
    }

    public String getName(){ return this.name; }

    public ArrayList<Visitor> getVisitors() { return visitors; }

    public int countVisitors(){ return this.visitors.size(); }

    public void checkInVisitor(Visitor visitor){ this.visitors.add(visitor); }

    public void checkOutVisitor(Visitor visitor){ this.visitors.remove(visitor);}

}
