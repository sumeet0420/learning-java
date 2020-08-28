package assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class CountLetters {

    public static void main(String[] args) {
        /*String word = "Sumeet Shriya";
        Map<String, Integer> frequncyMap = new LinkedHashMap<>();
        String[] letters = word.split( "");
        for(int i=0; i<letters.length;i++){
         if(frequncyMap.get(letters[i])==null){
             frequncyMap.put(letters[i],1);
         } else {
             int value = frequncyMap.get(letters[i]);
             frequncyMap.put(letters[i],frequncyMap.put(letters[i],1)+1);
         }
        }
        System.out.println(frequncyMap.get("S"));*/

        String original = "aba";
        String reverse = "";
        int length;
        length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" + reverse);

        Optional.of(reverse).map(word->word.equals(original)).filter(CountLetters::isTrue)
                .ifPresentOrElse(print -> System.out.println("The number is palindrome"),
                () -> System.out.println("The number is not palindrome"));
    }

    private static boolean isTrue(Boolean output) {
        return output.equals(Boolean.TRUE);
    }
}
