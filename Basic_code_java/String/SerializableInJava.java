package String;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInJava implements Serializable {

    // private static final long serialVersionUID = 1L;

    int id;
    String name;
    SerializableInJava(int id, String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {

        //serialization
        try{
        SerializableInJava sij = new SerializableInJava(201, "Gaurav");

         FileOutputStream fout=new FileOutputStream("f.txt");    
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(sij);    
            out.flush();    
            //closing the stream    
            out.close();    
            System.out.println("success");    
        }catch(Exception e){
            System.out.println(e);
        }
    
        //Deserialization
            // try{  
            // //Creating stream to read the object  
            // ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
            // SerializableInJava sij=(SerializableInJava)in.readObject();  
            // //printing the data of the serialized object  
            // System.out.println(sij.id+" "+sij.name);  
            // //closing the stream  
            // in.close();  
            // }catch(Exception e){System.out.println(e);}  
    }
}
