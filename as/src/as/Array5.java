package as;


public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		
		char []a= {'z','e','e','t','e','c','h'};
		for(int i=0;i<a.length;i++) {
			if(a[i]=='e') {
				c+=1;
			}
		}
		System.out.println(c);
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		



	}
}
