import Dinosaurs.Dinosaur;
import Dinosaurs.Herbivore;
import Paddocks.HerbPaddock;
import Paddocks.Paddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbPaddockTest {

    HerbPaddock herbPaddock;
    Dinosaur dinosaur;
    Herbivore herbivore;

    @Before
    public void before(){
        herbPaddock = new HerbPaddock("The yellow praire", 15);
        herbivore = new Herbivore("Antony", "Herbivore", 10);
    }

    @Test
    public void canAddDinosaur(){
        herbPaddock.addDinosaur(herbivore);
        assertEquals(1, herbPaddock.getDinosaursCount());
    }

    @Test
    public void canRemoveDinosaur() {
        herbPaddock.addDinosaur(herbivore);
        assertEquals(1, herbPaddock.getDinosaursCount());
        herbPaddock.removeDinosaur(herbivore);
        assertEquals(0, herbPaddock.getDinosaursCount());

    }

}
