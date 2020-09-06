package assignment;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class SuspicousDate {

    public static void main(String[] args) {
        //FIXME FIX THE DATE FORMAT BY RUNNING INSPECTION
        DateTimeFormatter.ofPattern("yyyy-MM-DD");
        for (Integer integer : List.of(1,2,3,4,5)) {
            System.out.println("integer = " + integer);
        }
    }
}
