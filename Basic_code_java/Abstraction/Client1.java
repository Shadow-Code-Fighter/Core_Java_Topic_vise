package Abstraction;

// Abstraction is a java concept that allow incomplete and complete 
// method.

// Abstraction in Java is a concept that allows you to define 
// a blueprint for a class without providing a complete implementation

abstract class Parent{
    void M1(){
        System.out.println("M1 Method");
    }
    abstract void M2();
}

class Child extends Parent{
    @Override
    void M2() {
        System.out.println("M2 Method");
    }
}
public class Client1 {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.M1();
        p1.M2();
    }
}
