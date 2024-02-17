package Practice;


import java.util.Scanner;
import java.util.HashSet;

public class UniqueNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isUnique = checkUniqueNumber(number);

        if (isUnique) {
            System.out.println("The number is unique.");
        } else {
            System.out.println("The number is not unique.");
        }
    }

    public static boolean checkUniqueNumber(int number) {
        HashSet<Integer> digits = new HashSet<>();
        while (number > 0) {
            int digit = number % 10;
            if (!digits.add(digit)) {  // If we can't add to the Set (digit already exists)
                return false;          // Not unique
            }
            number /= 10;
        }
        return true;  // If we got here, all digits were unique
    }
}
