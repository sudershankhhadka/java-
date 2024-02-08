package MultiThreading;

public class TestFbLike {
	public static void main(String[] args) {
		FacebookLike fb = new FacebookLike(0);
		
		for(int i = 0;i<=20;i++) {
			Thread user1 = new Thread(){
				
				public void run() {
					fb.doLike();
				}
			};
			user1.start();
		}
	}
}
