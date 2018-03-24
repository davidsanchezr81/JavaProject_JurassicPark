import Paddocks.Food;
import Paddocks.FoodType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoodTest {

    Food food;

    @Before
    public void before(){
        food = new Food(FoodType.HERBS);
    }

//    @Test
//    public void canGetDiet(){
//        assertEquals("Herbivore", food.getDiet());
//    }

    @Test
    public void canGetPrey(){
        assertEquals("Herbs",food.getPrey());
    }

    @Test
    public void canGetEnergy(){
        assertEquals(2,food.getEnergy());
    }




}
