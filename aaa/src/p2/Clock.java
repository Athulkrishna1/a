package p2;
import java.util.*;
import java.io.*;
public class Clock extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int ss=0,mm=0,hh=0;
		for(ss=0;ss<=1000;ss++) {
			if(ss==60) {
				mm+=1;
				ss=0;
			}
			if(mm==60) {
				hh+=1;
				mm=0;
			}
			Thread.sleep(1000);
			System.out.format(hh +" "+ mm +" "+ss);
		}
		

	}

}
