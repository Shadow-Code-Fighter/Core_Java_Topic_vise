package Practice;

public class Singleton {
    //create private static instance
    private static Singleton instance;

    //make private constructor
    private Singleton(){}

    //get the objects is available
    public static synchronized Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void method(){
        System.out.println("Call this method");
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.method();
    }
}
