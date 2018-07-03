import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark("CodeClan Wondahs", 5);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Wondahs", themePark.getName());
    }

}
