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
public class ExecutorServiceTest4 {
	
	public static void main(String[] args) {
	
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
	    try {
	    	for (int i = 0; i < 20; i++) {
	    	System.out.println("________________>");
	    	}
	        TimeUnit.MILLISECONDS.sleep(1);//300
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	};
	 
	Callable<String> callableTask = () -> {
	    TimeUnit.MILLISECONDS.sleep(300);
	    return "Task's execution";
	};
	 
//	List<Callable<String>> callableTasks = new ArrayList<>();
//	callableTasks.add(callableTask);
//	callableTasks.add(callableTask);
//	callableTasks.add(callableTask);
	//************************************************
	
	executorService.execute(runnableTask);
	//************************************************
	Future<String> future =  executorService.submit(callableTask);
	
	try {
		System.out.println("________xxxxxxxxxxxxxxx________>"+future.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	

	executorService.shutdown();
	
	
	
	}

}
