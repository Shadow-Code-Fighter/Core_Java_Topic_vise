package Threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Try_With_Resource {
    public static void main(String[] args) throws Exception {


        try(FileInputStream fin = new FileInputStream("in.txt");
        FileOutputStream fo = new FileOutputStream("ou.txt");
        ){
            
        }
    }
}
