package multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


/**
 * @author Renjith
 *http://www.baeldung.com/java-executor-service-tutorial
 */
public class ExecutorServiceTest41 {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	executorService.execute(new Runnable() {
		    public void run() {
		    	for (int i = 0; i < 20; i++) {
		    		System.out.println("Asynchronous task   >"+ i);
					
				}
		        
		    }		    
			});
	
	//
	//
	Runnable runnableTask = () -> {	  
		    	for (int i = 0; i < 20; i++) {
		    	System.out.println("_________0_______>"+i);
		    	}    
			};
	 
	Callable<String> callableTask = () -> {
	    TimeUnit.MILLISECONDS.sleep(300);
	    return "Task's execution";
	};
	 
	List<Callable<String>> callableTasksList = new ArrayList<>();
	callableTasksList.add(callableTask);
	callableTasksList.add(callableTask);
	callableTasksList.add(callableTask);
	//***************execute*********************************
	
	executorService.execute(runnableTask);
	//***************submit*********************************
	Future<String> future =  executorService.submit(callableTask);
	
	//***************invokeAny*********************************
	
		String result = executorService.invokeAny(callableTasksList);
	
		
		//*************invokeAll***********************************

		List<Future<String>> futures = executorService.invokeAll(callableTasksList);
	
	
		System.out.println("________xxxxxxxxxxxxxxx________>"+future.get());
		System.out.println("________xxxxxxxxxxxxxxx________>"+result);
		System.out.println("________xxxxxxxxxxxxxxx________>"+futures.get(0).get());
	
	
	
	

	executorService.shutdown();
	
	
	
	}

}
