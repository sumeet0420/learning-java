package concurrency;

public class Trying {

    public static void main(String[] args) {
        System.out.println(trying());
    }

    private static int trying() {
        String hello = "hello";
        try {
            System.out.println(hello.split("")[9]);
            return 0;

        } catch (Exception exception) {
            System.out.println("Exception");
            return 1;
        } finally {
            System.out.println("after hello");
            return 3;
        }
    }
}
