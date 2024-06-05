package Practice;

public class FirstLetterString {
    public static void main(String[] args) {
        String str = "i love india";
        char[] charArrays = str.toCharArray();
        boolean founsSpace = true;

        for(int i=0;i<charArrays.length;i++){
            if (Character.isLetter(charArrays[i])) {
                if (founsSpace) {
                    charArrays[i]=Character.toUpperCase(charArrays[i]);
                    founsSpace=false;
                }
            }
            else{
                founsSpace=true;
            }
        }
        str=String.valueOf(charArrays);
        System.out.println(str);
    }
}
