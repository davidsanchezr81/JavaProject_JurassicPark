import Dinosaurs.Carnivore;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurType;
import Dinosaurs.Herbivore;
import Paddocks.Food;
import Paddocks.FoodType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivoreTest {
    Dinosaur dinosaur;
    Herbivore herbivore;
    Food food;

    @Before
    public void before(){

        herbivore = new Herbivore("Jack", DinosaurType.HERBIVORE, 4);
        food = new Food(FoodType.HERBS);
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
    public void cenGetDinoHealthPoints(){
        assertEquals(4, herbivore.getHealthPoints());
    }

    @Test
    public void cenSetDinoHealthPoints(){
        herbivore.setHealthPoints(15);
        assertEquals(15, herbivore.getHealthPoints());
    }

    @Test
    public void canFillBelly(){
        herbivore.addFoodToDinosaurBelly(food);
        assertEquals(1,herbivore.countFoodInDinosaursBelly());
    }

    @Test
    public void canFeedDinosaur(){
        herbivore.feedDinosaur(food);
        assertEquals(1, herbivore.countFoodInDinosaursBelly());
        assertEquals(6, herbivore.getHealthPoints());
    }




}
