package String;

public class FindSumDigit {
    public static void main(String[] args) {
        String s ="ab12pq34";
        char[] ch = s.toCharArray();
        int sum = 0;

        for(char c: ch){
            if(Character.isDigit(c)){
                sum=sum+Character.getNumericValue(c);
                System.out.println(c);
            }
        }
    }
}
