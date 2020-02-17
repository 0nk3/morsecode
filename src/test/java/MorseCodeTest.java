import org.junit.Test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeTest {

    @Test
    public void shouldReturnHiThere() {
        assertEquals(8, MorseCode.lettersToMorseCode("Hi there").length, " This test case should pass. Same number of characters");
    }
    @Test
    void test1(){
        // Dealing with space count comparison
        String spaces = " ";
        int spacesCounter = 0;
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(spaces);
        while(matcher.find()){
            spacesCounter ++;
        }
        assertEquals(1, spacesCounter, "This test should PASS because there is an equal number of spaces between the output and expected output i.e 1");
    }
    @Test
    public void moresCodeToLett(){

    }
}