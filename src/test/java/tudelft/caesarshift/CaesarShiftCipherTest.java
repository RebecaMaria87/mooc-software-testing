package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void validMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("abc",2);
        Assertions.assertEquals("cde", ms);
    }

    @Test
    public void endMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("xyz",4);
        Assertions.assertEquals("bcd", ms);
    }

    @Test
    public void negativeShiftMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("abc",-3);
        Assertions.assertEquals("xyz", ms);
    }

    @Test
    public void bigShiftMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("abc",28);
        Assertions.assertEquals("cde", ms);
    }

    @Test
    public void invalidMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("a2Y",28);
        Assertions.assertEquals("invalid", ms);
    }

    @Test
    public void validInvalidMessage() {
        String ms = new CaesarShiftCipher().CaesarShiftCipher("invalid",0);
        Assertions.assertEquals("invalid", ms);
    }
}
