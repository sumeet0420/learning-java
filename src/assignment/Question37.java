package assignment;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.*;
import static java.util.stream.IntStream.range;

public class Question37 {

    public static void main(String[] args) {
        String word = "GooD MorNinG!";
        List<String> upperLetters = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        List<String> lowerLetters = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            final String letter = String.valueOf(word.charAt(i));
            final int indexOfLetter = lowerLetters.indexOf(letter);
            if (indexOfLetter != -1) {
                output = output + upperLetters.get(indexOfLetter);
            }else {
                output = output+letter;
            }
        }
        System.out.println(output);
    }


}
