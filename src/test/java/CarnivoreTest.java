import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Paddocks.Food;
import Paddocks.FoodType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarnivoreTest {

    Dinosaur dinosaur;
    Carnivore  carnivore;
    Carnivore carnivore1;
    Food food;
    Food food1;

    @Before
    public void before(){
        carnivore = new Carnivore("George", DinosaurType.CARNIVORE, 3,"T-REX");
        carnivore1 = new Carnivore("Greg", DinosaurType.CARNIVORE, 10,"T-REX");
        food = new Food(FoodType.MEATY);
        food1 = new Food(FoodType.MEATY);
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
    public void cenGetDinoHealthPoints(){
        assertEquals(3, carnivore.getHealthPoints());
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

    @Test
    public void canFillBelly(){
        carnivore.addFoodToDinosaurBelly(food);
        assertEquals(1,carnivore.countFoodInDinosaursBelly());
    }

    @Test
    public void canFeedDinosaur(){
        carnivore.feedDinosaur(food);
        assertEquals(1, carnivore.countFoodInDinosaursBelly());
        assertEquals(8, carnivore.getHealthPoints());
    }

    @Test
    public void cannotFeedDinosaur(){
        carnivore1.feedDinosaur(food1);
        assertEquals(0, carnivore1.countFoodInDinosaursBelly());
        assertEquals(10, carnivore1.getHealthPoints());
    }

}
