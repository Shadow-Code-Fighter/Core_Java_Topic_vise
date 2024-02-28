
public class Finalize {
    public static void main(String []args){
        Finalize fz =  new Finalize();
        fz=null; //Colling garbage collector
        System.gc();
        System.out.println("End");
    }
    @Override
    protected void finalize(){
        System.out.println("Finalize method called");
    }
}