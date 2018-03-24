import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Paddocks.CarnPaddock;
import Paddocks.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnPaddockTest {

    CarnPaddock carnPaddock;
    Dinosaur dinosaur;
    Carnivore carnivore;
    Food food;

    @Before
    public void before(){
        carnPaddock = new CarnPaddock("The yellow praire", 15);
        carnivore = new Carnivore("Antony", "Herbivore", 10, "T-REX");

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

//    @Test
//    public void canFeedDinosaur(Food food){
//        food = new Food("Cow",5)
//        carnivore.feedDinosaur();
//    }


}
