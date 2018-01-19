import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();

		set.add("Vijay");
		set.add("Ravi");
		set.add("Raj");
		set.add("Ravi");
		set.add("Ajay");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(set.size());
	}
}