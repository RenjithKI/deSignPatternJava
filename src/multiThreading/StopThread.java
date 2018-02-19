package multiThreading;

import java.util.concurrent.TimeUnit;

//https://www.youtube.com/watch?v=gOs7o5ONj5o

 public class StopThread {
	 private static boolean stopRequested = false;

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
