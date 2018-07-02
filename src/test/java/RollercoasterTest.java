import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rapid Rollercoaster");
        visitor1 = new Visitor(14, 145,10);
        visitor2 = new Visitor(14, 130, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Rapid Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canRide(){
        assertEquals(true, rollercoaster.isAllowedToVisit(visitor1));
    }

    @Test
    public void cannotRide(){
        assertEquals(false, rollercoaster.isAllowedToVisit(visitor2));
    }
}
