package assignment;

import java.util.stream.Stream;

import static java.lang.Character.*;
import static java.util.stream.IntStream.range;

public class Question37 {

    public static void main(String[] args) {
        String word = "GooD MorNinG!";
        range(0, word.length()).mapToObj(word::charAt).map(Question37::covertCase)
                .forEach(System.out::print);
        System.out.println();
        Stream.of(word.split("")).map(letter->letter.charAt(0))
                .map(Question37::covertCase).forEach(System.out::print);
    }

    private static Character covertCase(Character letter) {
        return isLowerCase(letter) ? toUpperCase(letter) : isUpperCase(letter)
                                   ? toLowerCase(letter) : letter;
    }


}
