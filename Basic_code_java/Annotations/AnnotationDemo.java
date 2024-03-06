package Annotations;


class Parent {
    Parent(){
        System.out.println("Parent Constructor");
    }
    public void m1(){
        System.out.println("Parent-m1");
    }

    
}

class Child extends Parent {

    Child(){
        System.out.println("Child Constructor");
    }
    // @Override
    public void m1() {
       System.out.println("Child-m1");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.m1();
    }
}
