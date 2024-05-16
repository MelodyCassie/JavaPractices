package leetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    public void testRotateArray(){

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] result = {4,5,6,7,1,2,3};
        int[] expected = RotateArray.rotateArray(nums,k);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected,result);

    }

}