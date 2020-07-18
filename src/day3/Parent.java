package day3;

public class Parent {

    public int x;

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b + c;
    }

    public int sum(double a, double b){
        return (int) (a+b);
    }

    public void sayHello(){
        System.out.println("Hello from parent");
    }


    public static void sayHelloStatic(){
        System.out.println("Hello from parent");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.sayHello();
        Parent.sayHelloStatic();

        System.out.println("************************");
        ChildA c = new ChildA();
        c.sayHello();
        System.out.println("**************after**********");
        //Compile       //Runtime
        Parent p = new ChildA();
        p.sayHello();
    }
}
