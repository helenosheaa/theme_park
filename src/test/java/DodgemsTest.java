import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;

    @Before
    public void before(){
        dodgems = new Dodgems("Doi Dodgems", 10);
        visitor1 = new Visitor(13,140,5.00);
    }

    @Test
    public void hasName(){
        assertEquals("Doi Dodgems", dodgems.getName());
    }

    @Test
    public void canVisitAttraction(){
        assertEquals(true, dodgems.isAllowedToVisit(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(10, dodgems.getRating());
    }
}
