package p2;
class J extends Thread{
	public synchronized void run(){
		for(int i=0;i<=10;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(500);
				
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J a =new J();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		t1.start();
		t2.start();
		t1.setName("Ashok");
		t2.setName("abhi");
		System.out.println(t1);
		System.out.println(t2);

	}

}
