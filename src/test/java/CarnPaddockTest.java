import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
import Paddocks.CarnPaddock;
import Paddocks.Food;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CarnPaddockTest {

    CarnPaddock carnPaddock;
    CarnPaddock carnPaddock1;
    Dinosaur dinosaur;
    Carnivore carnivore;
    Herbivore herbivore;


    @Before
    public void before(){
        carnPaddock = new CarnPaddock("The yellow praire", 4);
        carnPaddock1 = new CarnPaddock("The yellow praire", 14);
        carnivore = new Carnivore("Antony", DinosaurType.CARNIVORE, 10, "T-REX");
        herbivore = new Herbivore("Antony", DinosaurType.HERBIVORE, 10);
    }

    @Test
    public void canGetPaddockName(){
        assertEquals("The yellow praire", carnPaddock.getPaddockName());
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

//    @Test
//    public void canTransferHerbivorous(){
//        carnPaddock.addDinosaur(carnivore);
//        carnPaddock.addDinosaur(herbivore);
//        carnPaddock.transferHerbivorous(carnivore);
////        assertEquals(" Done ",carnPaddock.transferHerbivorous(herbivore));
//        assertEquals(1,carnPaddock.getDinosaursCount());
//    }

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
        assertEquals("Rampage - Run", carnPaddock.rampageNotification());
    }


// Colocar condicional para llenar el paddock en base a la cantidad de animales

}
