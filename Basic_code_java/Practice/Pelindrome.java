package Practice;

public class Pelindrome {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPelindrome=true;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPelindrome=false;
                break;
            }
        }
        if(isPelindrome)
        System.out.println("Pelindrpme");
        else
        System.out.println("Not a Pelindrome");
    }
}
