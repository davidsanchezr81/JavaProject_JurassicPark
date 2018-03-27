import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
import Paddocks.HerbPaddock;
import Paddocks.Paddock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HerbPaddockTest {

    HerbPaddock herbPaddock;
    HerbPaddock herbPaddock1;
    Dinosaur dinosaur;
    Herbivore herbivore;
    Carnivore carnivore;

    @Before
    public void before(){
        herbPaddock = new HerbPaddock("The red praire", 5, DinosaurType.HERBIVORE);
        herbPaddock1 = new HerbPaddock("Herbivore", 5, DinosaurType.HERBIVORE);
        herbivore = new Herbivore("Antony", DinosaurType.HERBIVORE, 10);
        carnivore = new Carnivore("Antony", DinosaurType.CARNIVORE, 10, "T-REX");

    }

    @Test
    public void canGetPaddockName(){
        assertEquals("The red praire", herbPaddock.getPaddockName());
    }

    @Test
    public void canSetPaddockName(){
        herbPaddock.setPaddockName("The Lost Dinosaurs");
        assertEquals("The Lost Dinosaurs", herbPaddock.getPaddockName());
    }

    @Test
    public void canGetDinoType(){
        assertEquals("HERBIVORE", herbPaddock.getDinoType());
    }

    @Test
    public void canAddDinosaur(){
        herbPaddock.addDinosaur(herbivore);
        assertEquals(1, herbPaddock.getDinosaursCount());
    }

    @Test
    public void cannotAddDinosaurAtCapacity(){
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        assertEquals(5, herbPaddock.getDinosaursCount());
    }

    @Test
    public void canAddDinosaurNoMatterWhat(){
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        assertEquals(8, herbPaddock.getDinosaursCount());
    }

    @Test
    public void canRemoveDinosaur() {
        herbPaddock.addDinosaur(herbivore);
        assertEquals(1, herbPaddock.getDinosaursCount());
        herbPaddock.removeDinosaur(herbivore);
        assertEquals(0, herbPaddock.getDinosaursCount());
    }

    @Test
    public void canGetDinosaursInPaddock(){
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        ArrayList<Dinosaur> availableDinosaurs = herbPaddock.getDinosaursInPaddock();
        assertEquals(2, availableDinosaurs.size());
    }

    @Test
    public void cannotHappenRampage(){
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        assertEquals(5, herbPaddock.getDinosaursCount());
        assertEquals("All good, no danger so far", herbPaddock.rampageNotification());
    }


    @Test
    public void canHappenRampage(){
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaur(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        herbPaddock.addDinosaurNoMatterWhat(herbivore);
        assertEquals(8, herbPaddock.getDinosaursCount());
        assertEquals("Rampage Situation! Run for your Life", herbPaddock.rampageNotification());
    }

    @Test
    public void canRemoveNonMatchingDinosaur(){
        herbPaddock1.addDinosaur(carnivore);
        herbPaddock1.addDinosaur(herbivore);
        herbPaddock1.addDinosaur(carnivore);
        herbPaddock1.addDinosaur(herbivore);
        assertEquals(4, herbPaddock1.getDinosaursCount());
        herbPaddock1.removeNonMatchingDinosaur();
        assertEquals(2, herbPaddock1.getDinosaursCount());

    }


}
