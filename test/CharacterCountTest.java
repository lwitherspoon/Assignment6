import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {

    @Test
    public void count() {

        String stringToTest = "Bananas are delicious.";
        char charToTest = 'a';
        int expected = 4;

        assertEquals("Incorrect character count", expected, CharacterCount.count(stringToTest, charToTest));

    }

}