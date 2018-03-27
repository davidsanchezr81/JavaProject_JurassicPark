import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
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
        carnPaddock = new CarnPaddock("Carnivore", 4);
        carnPaddock1 = new CarnPaddock("The yellow praire", 14);
        herbPaddock = new HerbPaddock("Herbivore", 4);
        carnivore = new Carnivore("Antony", DinosaurType.CARNIVORE, 10, "T-REX");
        herbivore = new Herbivore("Raul", DinosaurType.HERBIVORE, 10);
    }

    @Test
    public void canGetPaddockName(){
        assertEquals("Carnivore", carnPaddock.getPaddockName());
    }

    @Test
    public void canSetPaddockName(){
        carnPaddock.setPaddockName("The last Monsters");
        assertEquals("The last Monsters", carnPaddock.getPaddockName());
    }

    @Test
    public void canAddDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        assertEquals(4, carnPaddock.getDinosaursCount());
        assertEquals("All good, no danger so far", carnPaddock.rampageNotification());
    }

    @Test
    public void cannotAddDinosaurAtCapacity(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(carnivore);
        assertEquals(4, carnPaddock.getDinosaursCount());
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
        assertEquals(7, carnPaddock.getDinosaursCount());
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
        assertEquals(7, carnPaddock.getDinosaursCount());
        assertEquals("Rampage Situation! Run for your Life", carnPaddock.rampageNotification());
    }

    @Test
    public void canRemoveMatchingDinosaur(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
        carnPaddock.addDinosaurNoMatterWhat(herbivore);
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
        carnPaddock1.addNonMatchingDinosaur(nonMatchingDinosaurs);
        assertEquals(0, carnPaddock1.getDinosaursCount());
        herbPaddock.addNonMatchingDinosaur(nonMatchingDinosaurs);
        assertEquals(4, herbPaddock.getDinosaursCount());
    }


// Colocar condicional para llenar el paddock en base a la cantidad de animales

}
