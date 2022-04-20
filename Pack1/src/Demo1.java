class A{
	int a=100;
	protected int b=200;
	private int c=300;
	public int d=1000;
	protected String h="atul";
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class B extends A{
	void disp() {
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
	}
}
class c{
	
	void disp() {
		A a =new A();
		System.out.println(a.a);
		System.out.println(a.b);
		//System.out.println(a.c);
		System.out.println(a.d);
	}
		
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		System.out.println(a.getA());
		a.getB();
	}

}
