package Basic_code_java.Functionalinterface;
@FunctionalInterface
interface SimpleFunctionalInt {
    public void simpleTest();
    
}


public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        SimpleFunctionalInt mySimple = ()->{
            System.out.println("This is Functional Interface");
        };
        mySimple.simpleTest();
        
    }
}
