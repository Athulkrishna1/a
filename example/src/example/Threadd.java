package example;

public class Threadd implements Runnable {
	public void run() {
		System.out.println("new Thread");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		Threadd tt = new Threadd();
		Thread t = new Thread(tt);
		t.start();

 
 } 
}