package MultiThreading;

public class TestThread extends Thread{
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("From Thread class");
		}
		
		public static void main(String[] args) {
			TestThread t = new TestThread();
			t.start();
		}

}