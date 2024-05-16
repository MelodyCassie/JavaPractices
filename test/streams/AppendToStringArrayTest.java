package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendToStringArrayTest {
    @Test
    public void testThatCanAppendToString(){
        String[] arrayOfStrings = {"apple","banana","orange"};
        String[] result = {"apple","banana","orange","apple","banana","orange"};
        String[] expected = AppendToStringArray.appendToArrayMethod(arrayOfStrings);
        assertArrayEquals(result,expected);
    }

}