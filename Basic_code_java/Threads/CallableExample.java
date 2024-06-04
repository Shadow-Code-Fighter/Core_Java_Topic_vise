package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class AdditionTask implements Callable<Integer>{

    private int num1;
    private int num2;

    public AdditionTask(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public Integer call() throws Exception {
        return num1+num2;
    }
    
}

public class CallableExample {
    public static void main(String[] args) {
        AdditionTask task = new AdditionTask(10, 20);
        ExecutorService execute = Executors.newSingleThreadExecutor();
        try {
       
        Future future = execute.submit(task);

        
            Integer result = (Integer) future.get();
            System.out.println(result   );
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            execute.shutdown();
        }
    }
}
