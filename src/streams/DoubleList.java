package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleList {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(2,3,6,1,8,4,2);
        Stream<Integer> convertedToStreams = listOfNumbers.stream();
        Stream<Integer> doubledNumbers = convertedToStreams.map(nums -> nums * 2);
        List<Integer> newList = doubledNumbers.toList();
        System.out.println(newList);
//        Object toStringed = doubledNumbers.toString();

    }
}
