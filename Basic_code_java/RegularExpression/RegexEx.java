import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {

        System.out.println("Regex suinng character");
        System.out.println(Pattern.matches("[123]{1}[0-9]{9}", "1953038949")); //true
        System.out.println(Pattern.matches("[123][0-9]{9}", "1993038949")); //true

		System.out.println(Pattern.matches("[123][0-9]{9}", "9950389490")); //false
		System.out.println(Pattern.matches("[123][0-9]{9}", "695338949")); //false
		System.out.println(Pattern.matches("[123][0-9]{9}", "885338949")); //false

		System.out.println("Regex Using Metacharacters");
		System.out.println(Pattern.matches("[123]{1}\\d{9}", "2885338949")); //true
		System.out.println(Pattern.matches("[123]{1}\\d{9}", "685308949")); //false

    }
}
