package String;

// Split() is a Java method for breaking a string based on a Java string delimiter (specified regex).
public class SplitString {
    public static void main(String[] args) {
        String str = "Gaurav Kumar Sharma";
        System.out.println(str.split("a").length);//length of string str if given regex is "a"

        // split string from space
        String[] result = str.split("a");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
/* Output
    5
    G
    ur
    v Kum
    r Sh
    rm 
 */