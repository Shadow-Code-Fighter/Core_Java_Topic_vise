package String;

//intern() is a method of string class where .equals() is a method of object class, String is override the
//  .equals() method

// equals() is used for content-based comparison of strings.
// intern() is used for optimizing memory usage by sharing string literals in a common pool.
public class StringIntern {
    public static void main(String[] args) {
        String str = "Gaurav";
        String str1 = new String("Gaurav").intern();
        System.out.println(str==str1);
        System.out.println(str.equals(str1));

    }
}
