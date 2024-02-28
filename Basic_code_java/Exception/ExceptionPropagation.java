package Exception;

public class ExceptionPropagation {
        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e) {
                System.out.println("Exception caught in main: " + e);
            }
        }
        
        public static void method1() {
            try {
                method2();
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught in method1: " + e);
            }
        }
        
        public static void method2() {
            int a = 10;
            int b = 0;
            int result = a / b; // This line will throw an ArithmeticException
            System.out.println("Result: " + result);
        }
}
