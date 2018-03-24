import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarnivoreTest {

    Dinosaur dinosaur;
    Carnivore  carnivore;

    @Before
    public void before(){
        carnivore = new Carnivore("George", "Carnivore", 10,"T-REX");
    }

    @Test
    public void cenGetDinoName(){
        assertEquals("George", carnivore.getName());
    }

    @Test
    public void cenSetDinoName(){
        carnivore.setName("Peter");
        assertEquals("Peter", carnivore.getName());
    }


    @Test
    public void cenGetDinoType(){
        assertEquals("Carnivore", carnivore.getType());
    }

    @Test
    public void cenSetDinoType(){
        carnivore.setType("Carnivore Type 2");
        assertEquals("Carnivore Type 2", carnivore.getType());
    }

    @Test
    public void cenGetDinoHealthPoints(){
        assertEquals(10, carnivore.getHealthPoints());
    }

    @Test
    public void cenSetDinoHealthPoints(){
        carnivore.setHealthPoints(15);
        assertEquals(15, carnivore.getHealthPoints());
    }

    @Test
    public void canGetDinoSubType(){
        assertEquals("T-REX", carnivore.getSubType());
    }

    @Test
    public void canSetDinoSubType(){
        carnivore.setSubType("VelociRaptor");
        assertEquals("VelociRaptor", carnivore.getSubType());
    }






}
