package Threads;

class InnerDemonThread extends Thread {
    public void run(){
    if(Thread.currentThread().isDaemon()){
        System.out.println("Daemon Thread");
    }else{
        System.out.println("User Thread");
    }
    }    
}
public class DemonThread {
    
    public static void main(String[] args) {
        
    }
}
