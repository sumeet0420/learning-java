package day3;

public class ChildA extends Parent{

    public int x;

    @Override
    public void  sayHello(){
        System.out.println("Say hello from child");
    }

    public void findChild(){
        System.out.println("Child child");
    }
}
