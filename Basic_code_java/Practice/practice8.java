package Practice;

public class practice8 {
    public static void main(String[] args) {
        String str="non";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);}
        if (str.equals(rev)) {
            System.out.println("pelidrome");
        }else{
            System.out.println("Not pelidrome");
        }
    }
}
