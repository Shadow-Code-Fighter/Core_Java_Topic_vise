package Interview_code_QP;

import java.util.Scanner;

public class StringPermutns {

    // Fuction to display all permutations of the string str
    public static void printallPermutns(String str, String str2){
                                
        
        if(str.length()==0){// check if string is empty or null
            System.out.println(str2+"");
            return;
        }
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i); // ith character of str
            // Rest of the string after excluding 
            String str3 = str.substring(0, i) + str.substring(i+1); // th ith character
            // Recursive call
            printallPermutns(str3, str2 + ch);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your word");
        String s = input.next();
        System.out.println("Your word is: "+ s);
        printallPermutns(s, "");
        input.close();
    }
    
}
