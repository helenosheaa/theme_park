import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Bonza Backy", "Jim James", "3A");
        visitor1 = new Visitor(18, 145, 20.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bonza Backy", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Jim James", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("3A", tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisitStall(){
        assertEquals(true, tobaccoStall.isAllowedToVisit(visitor1));
    }

}
