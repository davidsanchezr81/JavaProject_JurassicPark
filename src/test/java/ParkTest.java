import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
import Paddocks.CarnPaddock;
import Paddocks.HerbPaddock;
import Paddocks.Paddock;
import Park.Visitor;
import Park.Park;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.debugger.win32.coff.DebugVC50TypeLeafIndices;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParkTest {

    Park park;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    CarnPaddock carnPaddock1;
    HerbPaddock herbPaddock1;
    HerbPaddock herbPaddock2;
    Herbivore herbivore1;
    Carnivore carnivore1;


    @Before
    public void before(){
        park = new Park("Jurassic Park");
        visitor1 = new Visitor("Michael Jackson",55);
        visitor2 = new Visitor("Miguel Moli",60);
        visitor3 = new Visitor("Chayanne",50);
        visitor4 = new Visitor("Mark", 18);
        carnPaddock1 = new CarnPaddock("Carnivore", 5,DinosaurType.CARNIVORE);
        herbPaddock1 = new HerbPaddock("Herbivore", 5, DinosaurType.HERBIVORE);
        herbPaddock2 = new HerbPaddock(" Herbivore ", 5,DinosaurType.HERBIVORE);
        herbivore1 = new Herbivore("Frank", DinosaurType.HERBIVORE,10);
        carnivore1 = new Carnivore("Renato",DinosaurType.CARNIVORE,20, "Velociraptor");
    }

    @Test
    public void canGetParkName(){
        assertEquals("Jurassic Park", park.getName());
    }


    @Test
    public void canGetVisitorAge(){
        assertEquals(55, visitor1.getAge());
    }

    @Test
    public void cannotCheckInVisitorDueToAge(){
        park.addPaddock(carnPaddock1);
        park.countVisitors();
        assertEquals(0, park.countVisitors());
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        park.checkInVisitor(visitor4);
        assertEquals(3, park.countVisitors());
    }

    @Test
    public void canCheckInVisitor(){
        park.addPaddock(carnPaddock1);
        park.countVisitors();
        assertEquals(0, park.countVisitors());
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        park.checkInVisitor(visitor3);
        assertEquals(3, park.countVisitors());
    }

    @Test
    public void canCheckOutVisitor(){
        park.addPaddock(carnPaddock1);
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        assertEquals(2, park.countVisitors());
        park.checkOutVisitor(visitor2);
        assertEquals(1, park.countVisitors());
    }

    @Test
    public void canGetVisitorsInPark(){
        park.addPaddock(carnPaddock1);
        park.countVisitors();
        assertEquals(0, park.countVisitors());
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        park.checkInVisitor(visitor3);
        ArrayList<Visitor> visitorsInPark = park.getVisitors();
        assertEquals(3,visitorsInPark.size());
    }

    @Test
    public void canAddPaddock(){
        park.addPaddock(carnPaddock1);
        assertEquals(1, park.countPaddocks());
    }

    @Test
    public void canRemovePaddock(){
        park.addPaddock(herbPaddock1);
        park.addPaddock(carnPaddock1);
        park.removePaddock(herbPaddock1);
        assertEquals(1, park.countPaddocks());
    }

    @Test
    public void cannotCheckInInRampageSituation(){
        park.addPaddock(carnPaddock1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaurNoMatterWhat(carnivore1);
        assertEquals(6, carnPaddock1.getDinosaursCount());
        assertEquals("Rampage Situation! Run for your Life",carnPaddock1.rampageNotification());
        assertEquals(0,park.countVisitors());
        park.checkInVisitor(visitor1);
        assertEquals(0,park.countVisitors());
    }

    @Test
    public void cannotCheckOutInRampageSituation(){
        park.addPaddock(carnPaddock1);
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        park.checkInVisitor(visitor3);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaur(carnivore1);
        carnPaddock1.addDinosaurNoMatterWhat(carnivore1);
        assertEquals(6, carnPaddock1.getDinosaursCount());
        assertEquals(3,park.countVisitors());
        assertEquals("Rampage Situation! Run for your Life",carnPaddock1.rampageNotification());
        park.checkOutVisitor(visitor1);
        assertEquals(3,park.countVisitors());
    }


//    @Test
//    public void canTransferDinosaur(){
//        park.addPaddock(carnPaddock1);
//        carnPaddock1.addDinosaur(carnivore1);
//        carnPaddock1.addDinosaur(herbivore1);
//        carnPaddock1.addDinosaur(herbivore1);
//        carnPaddock1.addDinosaur(herbivore1);
//        carnPaddock1.addDinosaurNoMatterWhat(herbivore1);
//        carnPaddock1.addDinosaurNoMatterWhat(herbivore1);
//        park.addPaddock(herbPaddock1);
//        park.transferDinosaur();
//        assertEquals(5,herbPaddock1.getDinosaursCount());
//
//    }

}
