package p2;
import java.text.DateFormat;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet f =new HashSet();
		ArrayList a1= new ArrayList();
		LinkedList r=new LinkedList();
		r.add("athul");
		r.add(new Date());
		a1.add(100);
		a1.add("athul");
		
		System.out.println(a1);
		Iterator i= r.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
			
		}

	}

}
