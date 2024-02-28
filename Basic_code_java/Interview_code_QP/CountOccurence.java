package Interview_code_QP;

public class CountOccurence {

    public static int countOccurence(String s, char c){
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="gaurav";
        char c = 'a';
    System.out.println(countOccurence(s, c));
    }
    
}