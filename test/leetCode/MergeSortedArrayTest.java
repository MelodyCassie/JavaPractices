package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {
    @Test
    public void testMergeSortedArray(){
        int[] numsOne = {1,2,3,0,0,0};
        int m = 3;
        int[] numsTwo = {2,5,6};
        int n = 3;
        int[] result = {1,2,2,3,5,6};
        int[] expected = MergeSortedArray.mergeSortedArray(numsOne,m,numsTwo,n);
        assertArrayEquals(expected,result);
    }


}