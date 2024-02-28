package String;
//In this class wee use isEmpty() method to check string is empty or not
public class StringEmpty {

    public static boolean isStringEmpty(String str){
        if(str.isEmpty()){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "Gaurav "; //non - empty String
        String str2 = ""; //empty string
        System.out.println(str1+isStringEmpty(str1));
        System.out.println(str2+isStringEmpty(str2));
    }
}
