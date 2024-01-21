package Interview_code_QP;

import java.util.Scanner;

//In this i have created two way to check pelindrome, in first way takes input as a String check it to as a String
// In second way i have created to check pelindrome, in this method we have take an Integer and convert into String and
// check true and false, output produces

public class Palindrome {

    public static void main(String[] args) {

        // first way
        String original ,reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check if it is a pelidrome: ");
        original=sc.nextLine();

        int length = original.length();                                
        System.out.println(length);  
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse)){
            System.out.println("Entered string is a pelidrome");
        }else{
            System.out.println("Entered string is not pelidrome");
        }
        sc.close();

        int number=121;       //----------------------------------------------
         if (isPalindrome(number)) {                                        //
            System.out.println(number + " is a palindrome.");               //
        } else {                                                            //      Second way
            System.out.println(number + " is not a palindrome.");           //
        }       //------------------------------------------------------------                                                            // 

    }

    // second way 
    public static boolean isPalindrome(int x){ //-----------------------
            String str = Integer.toString(x);                         //
            int i = 0, j = str.length() - 1;                          //
            while (i < j) {                                           //
                if (str.charAt(i) != str.charAt(j)) {                 //
                    return false;                                     //  Second way
                }                                                     //
                i++;                                                  //
                j--;                                                  //
            }                                                         //
            return true;                                              //
    }   //--------------------------------------------------------------
    
}
