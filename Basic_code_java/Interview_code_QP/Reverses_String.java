package Interview_code_QP;

import java.util.Scanner;

public class Reverses_String {

    //first method
    static public String revStr(String str){
            return new StringBuilder(str).reverse().toString();
        }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words");
        String str = sc.nextLine();
        str=revStr(str);
        System.out.println(str);

        //second method
            // for(int i=str.length()-1;i>=0;i--){
            //     System.out.print(str.charAt(i));
            // }

            sc.close();
    }
}
