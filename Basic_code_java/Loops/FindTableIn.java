package Basic_code_java.Loops;

public class FindTableIn {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("Multiplication table for " + i + ":");
            for(int j=1;j<=10;j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
