

public class ThisKeyword {
    int a=10;

    public void Test(){
        
    System.out.println(this.a);
    }
    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
        t.Test();
        System.out.println(t.a);
    }
}
