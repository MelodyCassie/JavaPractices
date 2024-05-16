package leetCode;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] numsOne, int m, int[] numsTwo, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;


        while (i >= 0 && j >= 0){
            if(numsOne[i] > numsTwo[j]){
                numsOne[k--] = numsOne[i--];

            }
            else {
                numsOne[k--] = numsTwo[j--];
            }
        }
        while (j > 0){
            numsOne[k--] = numsTwo[j--];
        }
    }
}
