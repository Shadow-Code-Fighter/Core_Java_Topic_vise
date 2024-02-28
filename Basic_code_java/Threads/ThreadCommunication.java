package Threads;

// this program shows how to use wait and notify
// this is the most effeciant way of thread communication

class ThreadCommunication {
    public static void main(String[] args) {
        Producer pd = new Producer();
        Consumer cn = new Consumer(pd);

        Thread t1 = new Thread(pd);
        Thread t2 = new Thread(cn);
        
        t2.start(); //consumer waits
        t1.start(); //Producer starts productions
    }
}


class Producer extends Thread {
    StringBuffer sb;
    Producer(){
        sb = new StringBuffer();
    }
    public void run(){
        synchronized(sb){
            for(int i=1;i<=10;i++){
                try{
                sb.append(i+":");
                Thread.sleep(100);
                System.out.println("appending...");
                }catch(Exception e){}
            }
            sb.notify();
        }
    }
    
}
class Consumer extends Thread{
    Producer prod;

    Consumer(Producer prod){
        this.prod=prod;
    }
    public void run(){
        synchronized(prod.sb){
            try {
                prod.sb.wait();
            } catch (Exception e) {
            }
            System.out.println(prod.sb);
        }
    }
    
}