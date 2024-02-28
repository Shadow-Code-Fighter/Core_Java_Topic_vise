package String;

import java.util.StringJoiner;

public class MyStringJoiner {
    public static void main(String[] args) {
        StringJoiner joinStrings = new StringJoiner(",", "[", "]");
        joinStrings.add("StringJoiner");  
        joinStrings.add("By");  
        joinStrings.add("Gaurav");            
        System.out.println(joinStrings);  
    }
}
