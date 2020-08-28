package assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Question34 {

    public static void main(String[] args) {
        String word = "HELLO, HOW ARE YOU";
        List<String> vowels = List.of("A", "E", "I", "O", "U");
        //Print the count of vowels
        System.out.println(Stream.of(word.split(""))
                .filter(vowels::contains).collect(toSet()));
    }
}
