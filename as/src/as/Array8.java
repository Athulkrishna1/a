package as;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b='z';
		char [] a= {'z','e','e','t','e','c','h'};
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a' || a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u') {
				a[i]=b;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

}
}