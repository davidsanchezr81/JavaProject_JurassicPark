import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.Herbivore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivoreTest {
    Dinosaur dinosaur;
    Herbivore herbivore;

    @Before
    public void before(){
        herbivore = new Herbivore("Jack", "Herbivore", 20);
    }

    @Test
    public void cenGetDinoName(){
        assertEquals("Jack", herbivore.getName());
    }

    @Test
    public void cenSetDinoName(){
        herbivore.setName("Fred");
        assertEquals("Fred", herbivore.getName());
    }


    @Test
    public void cenGetDinoType(){
        assertEquals("Herbivore", herbivore.getType());
    }

    @Test
    public void cenSetDinoType(){
        herbivore.setType("Herbivore Type 3");
        assertEquals("Herbivore Type 3", herbivore.getType());
    }

    @Test
    public void cenGetDinoHealthPoints(){
        assertEquals(20, herbivore.getHealthPoints());
    }

    @Test
    public void cenSetDinoHealthPoints(){
        herbivore.setHealthPoints(15);
        assertEquals(15, herbivore.getHealthPoints());
    }


}
