package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest2 {
	
	public static void main(String[] args) {
	
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	//
	executorService.execute(new Runnable() {
	    public void run() {
	        System.out.println("Asynchronous task");
	    }
	});
	
	
	// TODO Auto-generated method stub
			Thread1 t1 = new Thread1();
			Thread2 t2 = new Thread2();
			executorService.execute(t1);
			executorService.execute(t2);
			
	executorService.shutdown();
	
	
	
	}

}
