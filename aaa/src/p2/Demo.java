package p2;
class E extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		Thread t1= new Thread(e);
		Thread t2= new Thread(e);
		t1.start();
		t2.start();
		t1.setName("Ashok");
		t2.setName("abhi");
		for(int k=0;k<=50;k++) {
			try {
				if(k==5) 
					t1.suspend();
				if(k==10) 
					System.out.println(t1.isAlive());
				if(k==12) t1.resume();
				if(k==14)
					t1.stop();
				System.out.println("      K:"+k);
				Thread.sleep(1000);
				
				
			}
			catch(Exception a) {
				
			}
		}

	}

}
