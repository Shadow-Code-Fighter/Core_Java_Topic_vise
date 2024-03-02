package StreamApi.practice_code;
import java.util.Arrays;
import java.util.List;

public class LongString {
    public static void main(String[] args) {
        // List<String> strings= Arrays.asList("apple","banana","orange","kiwi","strawberry");
        // String s = strings.stream().max((s1,s2)->s1.length()-s2.length()).orElse(null);
        // System.out.println(s);
        List<String> names = Arrays.asList("Ravi","Ompraksh","Gaurav","Rahul");
        
        String name = names.stream().max((n1,n2)->n1.length()-n2.length()).orElse(null);
        System.out.println(name);
    }
}
