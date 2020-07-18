package assignment;

public class Question1 {

    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        for (int i=1; i<=10; i++) {
            if ( i!=4 || i !=7 || i!=8 ) {
                System.out.println(i);
            }
        }
    }
}
