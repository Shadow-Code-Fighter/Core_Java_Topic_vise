package String;

public class StringSwitchCase {
    public static void main(String[] args) {
        String name = "Gaurav";
        switch (name) {
            case "Varma":
                System.out.println("Varma");
                break;
            case "Gaurav": //Match this case
                System.out.println("Sharma");
                break;
            case "Kumar":
                System.out.println("Gaurav");
                break;
            default:
                System.out.println("Not Match");
                break;
        }
    }
}

/* Output:
 * Sharma
 */
