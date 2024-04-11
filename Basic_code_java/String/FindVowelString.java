package String;

import java.util.Arrays;

public class FindVowelString {
    public static void main(String[] args) {
        String s = "Gaurav";
        char[] ch = s.toCharArray();
        int count = 0;

        for(char c : ch){
            if(Arrays.asList('a','e','i','o','u','A','E','I','O','U').contains(c)){
                count +=1;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
