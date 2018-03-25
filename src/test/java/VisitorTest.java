import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Michael Jackson",55);
    }

    @Test
    public void canGetVistorName(){
        assertEquals("Michael Jackson", visitor.getName());
    }

    @Test
    public void canGetVisitorAge(){
        assertEquals(55, visitor.getAge());
    }

}
