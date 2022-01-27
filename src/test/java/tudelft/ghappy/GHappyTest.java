package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    @Test
    public void singleG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void doubleG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void falseDoubleG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxggxgx");
        Assertions.assertFalse(result);
    }

    @Test
    public void trueDoubleG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxggxggx");
        Assertions.assertTrue(result);
    }


    @Test
    public void firstDoubleG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("ggxxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void firstG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("gxxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void noG() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxx");
        Assertions.assertFalse(result);
    }
}
