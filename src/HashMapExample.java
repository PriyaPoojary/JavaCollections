import java.util.*;   

public class HashMapExample {
	
	public static void main(String args[]){
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		
		hm.put(105,"Amit");  
		hm.put(101,"Vijay");  
		hm.put(106, "Kunal");
		hm.put(103, "Priya");
		hm.put(104, "Kailash");
		hm.put(102,"Rahul");  

		System.out.println("Values before removing: "+ hm);   
		hm.remove(106);
		System.out.println("Values after removing key 106: "+ hm);    
	 }  
}