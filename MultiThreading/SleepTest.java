package MultiThreading;

public class SleepTest extends Thread{
		public void run() {
			for(int i = 0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			SleepTest t1 = new SleepTest();
			SleepTest t2 = new SleepTest();
			SleepTest t3 = new SleepTest();
			t1.start();
			t1.join();
			
			
			t2.start();
			t3.start();
			
		}
	
}
