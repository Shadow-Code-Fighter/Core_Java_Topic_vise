package Abstraction;

// Abstraction is java concept that allow you to define 
// a blueprint of class without complete implementation.

abstract class Government {
    protected void fund(){
        System.out.println("Government Fund");
    }
    abstract protected void fundDist();
}
class States extends Government{

    @Override
    protected void fundDist() {
        System.out.println("Fund Distribution");
    }
}

public class Client2 {
    public static void main(String[] args) {
        Government gm = new States();
        gm.fund();
        gm.fundDist();
    }    
}
