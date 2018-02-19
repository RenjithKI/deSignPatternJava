package multiThreading;
class Thread1 extends Thread {
	public void run() {		
		for (int i = 0; i < 50; i++) {
			System.out.println("i am thread 1 running here ");			
		}			
	}
}
 class Thread2 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
			System.out.println("i am thread #2 running here ");	
			}
		}
	}
 class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		//start the 1st threads
		t1.start();		
		Thread t = new Thread(t2);
		t.start();//start the second thread
		
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
