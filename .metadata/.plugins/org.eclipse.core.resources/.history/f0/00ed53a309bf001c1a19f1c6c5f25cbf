package p2;
import java.util.*;
import java.io.*;

class A {

	void abc() throws IOException{
		for(int i=0;i<=20;i++) {
			if(i==15) throw new NullPointerException();
			if(i==5) throw new IOException();
			System.out.println("i:"+ i);
		}
	}
}
public class D{
	public static void main(String[] args) {
		try {
			A a =new A();
			a.abc();
			
		}
		catch(NullPointerException npe) {
			System.out.println("NullPointException ");
		}
		catch(IOException ioe) {
			System.out.println("ioexception");
		}
	}
}