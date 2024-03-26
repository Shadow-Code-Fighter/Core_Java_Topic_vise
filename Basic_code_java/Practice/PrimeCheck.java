package Practice;

public class PrimeCheck {
    public static void main(String[] args) {
        int num =17;
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        System.out.println(num+"prime number");
        else
        System.out.println(num+"Not a prime");
    }
}
