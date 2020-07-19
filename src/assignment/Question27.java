package assignment;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.naturalOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

//Write a program to the least occurring character from a given string.
public class Question27 {

    public static void main(String[] args) {
        final Map<String, Long> map = getFrequencyWordMap("fcababcde");
        final var minValue = getMinFromMap(map).orElseGet(()->new Long(0));
        System.out.println(getMinimumFrequencyValues(map, minValue));
    }

    private static List<String> getMinimumFrequencyValues(Map<String, Long> map, Long minValue) {
        return map.keySet().stream().filter(key->map.get(key)==minValue).collect(toList());
    }

    private static Optional<Long> getMinFromMap(Map<String, Long> map) {
        return map.values().stream().min(naturalOrder());
    }

    private static Map<String, Long> getFrequencyWordMap(String word) {
        return Stream.of(word.split("")).collect(groupingBy(identity(), TreeMap::new, counting()));
    }

}
