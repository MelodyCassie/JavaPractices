package leetCode;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        int indexZero = nums[0];
        for(int i = 0; i< nums.length; i++){
            int newIndex = (i - k) %nums.length;
            if(newIndex < 0) {
                newIndex += nums.length;
            }
            nums[newIndex] = nums[i];

        }
       return nums;

    }
}
