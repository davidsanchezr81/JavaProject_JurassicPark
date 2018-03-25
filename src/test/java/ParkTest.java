import Park.Visitor;
import Park.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){
        park = new Park("Jurassic Park");
        visitor1 = new Visitor("Michael Jackson",55);
        visitor2 = new Visitor("Miguel Moli",60);
        visitor3 = new Visitor("Chayanne",50);
    }

    @Test
    public void canGetPArkName(){
        assertEquals("Jurassic Park", park.getName());
    }

    @Test
    public void canCheckInVisitor(){
        park.countVisitors();
        assertEquals(0, park.countVisitors());
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        park.checkInVisitor(visitor3);
        assertEquals(3, park.countVisitors());
    }

    @Test
    public void canCheckOutVisitor(){
        park.checkInVisitor(visitor1);
        park.checkInVisitor(visitor2);
        assertEquals(2, park.countVisitors());
        park.checkOutVisitor(visitor2);
        assertEquals(1, park.countVisitors());
    }

}
