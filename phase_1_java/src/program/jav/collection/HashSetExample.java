package program.jav.collection;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		//LinkedHashSet hs<String>=new LinkedHashSet<String>(); //it takes only string values
		
		hs.add("z");
		hs.add("x");
		hs.add("y");
		hs.add("w");
		hs.add("v");
		hs.add("v"); //will not take duplicates
		hs.add("2"); //it takes integer as string
		hs.add(10);
		hs.add(121.0);
		hs.add(new Integer(4).toString());
		hs.add(new Double(250.0).toString());
		hs.add(new Float(25.5).toString());
		hs.add(new Long(25).toString());
		
		System.out.println("Hashset is:" +hs);
		System.out.println("Size of hashset is: " +hs.size());
		System.out.println("Does hashset containg x? " + hs.contains("x"));
		System.out.println("Does hashset containg x? " + hs.contains("X"));
	}

}
