package multiThreading;

import java.util.concurrent.TimeUnit;

//https://www.youtube.com/watch?v=gOs7o5ONj5o

 public class StopThreadUsingVolatile {
	 private static volatile boolean stopRequested = false;
	/* 
	 private static synchronized boolean stopRequested() { return stopRequested;}
	 private static synchronized void  requestStop() { stopRequested= true;}*/

	public static void main(String[] args) 
			throws InterruptedException{
		// TODO Auto-generated method stub
		Thread backgroundThread = new Thread( () ->{
			int i= 0;
			while (!stopRequested){			
			System.out.println(i);
			i++;
			}
		});
				
		//start the 1st threads
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);		
		stopRequested = true;
	}

}
