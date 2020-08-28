package assignment;

import java.util.LinkedHashMap;
import java.util.Map;

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

        String original = "aba", reverse = "";
        int length;
        System.out.println("Enter the number or String");
        length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" + reverse);

        if (original.equals(reverse))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");

    }
}
