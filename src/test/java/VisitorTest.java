import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor(13, 145, 10.00);
        visitor2 = new Visitor(18, 200, 20.00);
    }

    @Test
    public void hasAge(){
        assertEquals(13, visitor1.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(145, visitor1.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(20.00, visitor2.getMoney(), 0.01);
    }



}
