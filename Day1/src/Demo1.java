import java.util.*;
public class Demo1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap h =new TreeMap();
//		HashMap h = new HashMap();
		LinkedHashMap h =new LinkedHashMap();
		h.put(100 , "athul");
		h.put(10 , "mourya");
		h.put(130 , "sujan");
		h.put(50 , "likith");
		Set set =h.entrySet();
		Iterator i= set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
