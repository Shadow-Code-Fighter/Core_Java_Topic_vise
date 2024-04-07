package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        String str=sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        
        }
            map.forEach((key,value)->System.out.println(key+""+value));
    }
}
