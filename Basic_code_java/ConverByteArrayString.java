package Basic_code_java;

import java.util.Arrays;

public class ConverByteArrayString {
    public static void main(String[] args) {
        String str = "a";
        byte[] byteArray = str.getBytes();
        System.out.println(Arrays.toString(byteArray));
     }
}
