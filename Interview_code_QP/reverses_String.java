package Interview_code_QP;

import java.util.Scanner;

public class reverses_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words");
        String str = sc.nextLine();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
