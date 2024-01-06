package Basic_code_java;

public class FinalizeKeyword {
   
    protected void finalize() {
        String str="Gaurav";
         System.out.println(str.hashCode());
         
    }

    public static void main(String[] args) {
        FinalizeKeyword fk = new FinalizeKeyword();
       fk.finalize();

        // Explicitly calling the finalize method (not recommended)
        // try {
        //     fk.finalize();
        // } catch (Throwable throwable) {
        //     throwable.printStackTrace();
        // }
    }
}
