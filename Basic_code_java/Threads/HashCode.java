package Threads;

import java.util.Objects;

public class HashCode {

    private String name;
    
    public HashCode(String string) {
        this.name=string;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    public static void main(String[] args) {
        HashCode h = new HashCode("Guarav");
        System.out.println(h.hashCode());

    }
}
