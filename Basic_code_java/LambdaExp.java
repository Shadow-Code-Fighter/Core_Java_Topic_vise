
interface B{

    public void test();
}
public class LambdaExp {
    

    static void test1(){
        B b1 = ()-> {
            System.out.println(100);
        };
        b1.test();
    }
    public static void main(String[] args) {
    LambdaExp.test1(); 
    }
}
