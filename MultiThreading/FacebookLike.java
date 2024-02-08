package MultiThreading;

public class FacebookLike {
	private int like;
	public FacebookLike(int like) {
		this.like = like;
	}
	public synchronized void doLike() {
		like++;
		System.out.println("Like = "+like);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
