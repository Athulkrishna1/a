package p2;
import java.util.*;
import java.io.*;
class C extends Thread{
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("I:"+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			
			
		}
	}
	
}
class B extends Thread{
	public void run() {
		try {
			for(int j=0;j<=10;j++) {
				System.out.println("J:"+ j);
				Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			
			
		}
}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a =new C();
		B b =new B();
		b.start();
		a.start();

	}

}
