package File;

import java.io.File;
import java.io.IOException;

public class FFileExample {

    public static void main(String[] args) {
        boolean flag = false;

        File f = new File("C:\\Users\\kgaur\\OneDrive\\Desktop\\Pdf\\test.txt");

        try {
            flag = f.createNewFile();

        } catch (IOException ioe) {
            System.out.println("Error while Creating File in Java" + ioe);
        }

        System.out.println("stock file" + f.getPath() + " created ");

    }
}