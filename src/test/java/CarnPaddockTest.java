import Dinosaurs.*;
import Paddocks.CarnPaddock;
import Paddocks.Food;
import Paddocks.HerbPaddock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CarnPaddockTest {

    CarnPaddock carnPaddock;
    CarnPaddock carnPaddock1;
    HerbPaddock herbPaddock;
    Dinosaur dinosaur;
    Carnivore carnivore;
    Herbivore herbivore;


    @Before
    public void before(){
        carnPaddock = new CarnPaddock("The Meat Train", 5,DinosaurType.CARNIVORE);
        carnPaddock1 = new CarnPaddock("Poor little prey", 5,DinosaurType.CARNIVORE);
        herbPaddock = new HerbPaddock("Herbivore", 5, DinosaurType.HERBIVORE);
        carnivore = new Carnivore("Antony", DinosaurType.CARNIVORE, 10, CarnSubType.SMALL);
        herbivore = new Herbivore("Raul", DinosaurType.HERBIVORE, 10);
    }

    @Test
    public void canGetPaddockName(){
        assertEquals("The Meat Train", carnPaddock.getPaddockName());
    }

    @Test
    public void canSetPaddockName(){
        carnPaddock.setPaddockName("The last Monsters");
        assertEquals("The last Monsters", carnPaddock.getPaddockName());
    }

    @Test
    public void canGetDinoType(){
        assertEquals("Carnivore", carnPaddock.getDinoType());

    }

    @Test
    public void canGetPaddockCapacity(){
        assertEquals(5,  carnPaddock1.getPaddockCapacity());
    }

    @Test
    public void canAddDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        assertEquals(4, carnPaddock.getDinosaursCount());
        assertEquals("All good, no danger so far, keep spending money", carnPaddock.rampageNotification());
    }

    @Test
    public void cannotAddDinosaurAtCapacity(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        assertEquals(5, carnPaddock.getDinosaursCount());
    }

    @Test
    public void canAddDinosaurNoMatterWhat(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        assertEquals(8, carnPaddock.getDinosaursCount());
    }

    @Test
    public void canRemoveDinosaur() {
        carnPaddock.addDinosaur(carnivore);
        assertEquals(1, carnPaddock.getDinosaursCount());
        carnPaddock.removeDinosaur(carnivore);
        assertEquals(0, carnPaddock.getDinosaursCount());
    }

    @Test
    public void canGetDinosaursInPaddock(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        ArrayList<Dinosaur> availableDinosaurs = carnPaddock.getDinosaursInPaddock();
        assertEquals(3, availableDinosaurs.size());
    }

    @Test
    public void canHappenRampage(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        carnPaddock.addDinosaurNoMatterWhat(carnivore);
        assertEquals(8, carnPaddock.getDinosaursCount());
        assertEquals("Rampage Situation! Run for your Life", carnPaddock.rampageNotification());
    }

    @Test
    public void cannotHappenRampage(){
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        assertEquals(5, carnPaddock.getDinosaursCount());
        assertEquals("All good, no danger so far, keep spending money", herbPaddock.rampageNotification());
    }

    @Test
    public void canRemoveNonMatchingDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        assertEquals(6, carnPaddock.getDinosaursCount());
        ArrayList<Dinosaur> nonMatchingDinosaurs = carnPaddock.removeNonMatchingDinosaur();
        assertEquals(5, nonMatchingDinosaurs.size());
    }

    @Test
    public void canAddNonMatchingDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        ArrayList<Dinosaur> nonMatchingDinosaurs = carnPaddock.removeNonMatchingDinosaur();
        assertEquals(5, nonMatchingDinosaurs.size());
        assertEquals(0, herbPaddock.getDinosaursCount());
        herbPaddock.addNonMatchingDinosaur(nonMatchingDinosaurs);
        assertEquals(5, herbPaddock.getDinosaursCount());
    }

    @Test
    public void cannotAddNonMatchingDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        ArrayList<Dinosaur> nonMatchingDinosaurs = carnPaddock.removeNonMatchingDinosaur();
        assertEquals(5, nonMatchingDinosaurs.size());
        assertEquals(0,carnPaddock1.getDinosaursCount());
        carnPaddock1.addNonMatchingDinosaur(nonMatchingDinosaurs);
        assertEquals(0, carnPaddock1.getDinosaursCount());
    }


}
