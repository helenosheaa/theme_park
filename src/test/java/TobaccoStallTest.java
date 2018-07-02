import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Bonza Backy", "Jim James", "3A");
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
}
