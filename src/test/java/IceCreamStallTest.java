import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Super Freeze", "Jonah Jay", "2A");
    }

    @Test
    public void hasName(){
        assertEquals("Super Freeze", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Jonah Jay", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("2A", iceCreamStall.getParkingSpot());
    }
}
