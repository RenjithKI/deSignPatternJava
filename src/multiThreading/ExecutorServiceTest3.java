package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Renjith
 *http://www.baeldung.com/java-executor-service-tutorial
 */
public class ExecutorServiceTest3 {
	
	public static void main(String[] args) {
	
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	executorService.execute(new Runnable() {
	    public void run() {
	    	for (int i = 0; i < 20; i++) {
	    		System.out.println("Asynchronous task   >"+ i);
				
			}
	        
	    }
	});

	executorService.shutdown();
	
	
	
	}

}
