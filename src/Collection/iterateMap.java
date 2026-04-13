package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new HashMap<>();
		m.put(23,"PineApple");
		m.put(34,"Coconut");
		m.put(1,"Apple");
		m.put(3,"Berry");
		m.put(66,"Banana");
		
		System.out.println("Iterate map using for loop:");
		for(Map.Entry<Integer, String> entry:m.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		System.out.println("Iterate map using Iterator");
		Iterator<Map.Entry<Integer, String>> i=m.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> entry=i.next();
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
