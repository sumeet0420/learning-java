package assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question30 {

    public static void main(String[] args) {
        System.out.println(wordFrequency("AAABBCDA"));
        System.out.println(wordFrequency_Compute("AAABBCDA"));
        System.out.println(wordFrequency_Lambdas("AAABBCDA"));
    }

    private static Map<Character, Integer> wordFrequency(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<word.length();i++) {
            char key = word.charAt(i);
            if(map.containsKey(key))
                map.put(key,(map.get(key)+1));
            else
                map.put(key,1);
        }
        return map;
    }

    private static Map<Character, Integer> wordFrequency_Compute(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<word.length();i++) {
            char key = word.charAt(i);
            map.compute(key,(k1, v1)->map.get(k1)==null?1:v1+1);
        }
        return map;
    }

    private static Map<String, Integer> wordFrequency_Lambdas(String word) {
        //return Stream.of(word.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return Stream.of(word.split(""))
                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(val->1)));
    }
}
