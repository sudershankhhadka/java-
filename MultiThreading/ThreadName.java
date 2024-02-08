package MultiThreading;

public class ThreadName extends Thread  {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name = "+Thread.currentThread().getName());
		System.out.println("Prority = "+ Thread.currentThread().getPriority());
	}
		public static void main(String[] args) {
			
			ThreadName t1 = new ThreadName();
			ThreadName t2 = new ThreadName();
			ThreadName t3 = new ThreadName();
			
			t1.setName("First Thread");
			t2.setName("Second Thread");
			t3.setName("Third Thread");
			
			//thread scheduling
			t1.setPriority(MAX_PRIORITY);
			t2.setPriority(NORM_PRIORITY);
			t3.setPriority(MIN_PRIORITY);
			
			t1.start();
			t2.start();
			t3.start();
			
		}
}
