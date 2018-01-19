import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();  
		
		map.put(105,"Gaurav");  
		map.put(101,"Sandeep");  
		map.put(106, "Kunal");
		map.put(103, "Priya");
		map.put(104, "Kailash");
		map.put(102,"Rahul");  
	
		System.out.println("Values before removing: "+ map);   
		map.remove(106);
		System.out.println("Values after removing key 106: "+ map);    
	}
}