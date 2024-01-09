import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {
    public static void main(String[] args) {
        String data = "This is a test String and 'This is data we want'";
        Pattern p = Pattern.compile("'(.*?)'");
        Matcher m = p.matcher(data);

        if (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
