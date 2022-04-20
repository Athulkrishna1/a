package as;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter num");
		int b=sc.nextInt();
		for(int j=0;j<a.length;j++) {
			if(a[j]==b) {
				System.out.println("yes");
			}

		}
	}

}
