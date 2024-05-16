package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortList {
    public static void main(String[] args) {
        List<Integer> unsorted = Arrays.asList(7,3,1,6,4,9,8,2);
//        Stream<Integer> integerStream = unsorted.stream();
        List<Integer> result = unsorted.stream().sorted().toList();
        System.out.println(result);
    }
}
