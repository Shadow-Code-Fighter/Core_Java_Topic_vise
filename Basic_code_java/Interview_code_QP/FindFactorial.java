package Interview_code_QP;

import java.util.Scanner;
// find the factorial of a given number.

//Check Factorial like 5!=5*4*3*2*1==120 (!->Factorial Symbol)
public class FindFactorial {
    public static void main(String[] args) {
        int num;
        Scanner  in = new Scanner(System.in);
        num=in.nextInt(); //Take a input from user
        int factorialResult = 1;
        for(int i=1;i<=num;i++){
            factorialResult = factorialResult*i;
        }
        System.out.println(factorialResult);
     in.close();   
    }
}
