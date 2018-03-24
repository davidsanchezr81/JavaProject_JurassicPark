import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
import Paddocks.CarnPaddock;
import Paddocks.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnPaddockTest {

    CarnPaddock carnPaddock;
    Dinosaur dinosaur;
    Carnivore carnivore;
    Herbivore herbivore;


    @Before
    public void before(){
        carnPaddock = new CarnPaddock("The yellow praire", 15);
        carnivore = new Carnivore("Antony", DinosaurType.CARNIVORE, 10, "T-REX");
        herbivore = new Herbivore("Antony", DinosaurType.HERBIVORE, 10);

    }

    @Test
    public void canAddDinosaur(){

        carnPaddock.addDinosaur(carnivore);
        assertEquals(1, carnPaddock.getDinosaursCount());
    }

    @Test
    public void canRemoveDinosaur() {
        carnPaddock.addDinosaur(carnivore);
        assertEquals(1, carnPaddock.getDinosaursCount());
        carnPaddock.removeDinosaur(carnivore);
        assertEquals(0, carnPaddock.getDinosaursCount());

    }

    @Test
    public void canTransferHerbivorous(){
        carnPaddock.addDinosaur(carnivore);
        carnPaddock.addDinosaur(herbivore);
        carnPaddock.transferHerbivorous(herbivore);
        assertEquals(1,carnPaddock.getDinosaursCount());


    }


}
