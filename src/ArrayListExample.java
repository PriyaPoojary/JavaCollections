import java.util.*;  

public class ArrayListExample {  
	public static void main(String args[]) { 
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("A"); 
		list.add("V");  
		list.add("R");  
		list.add("A");  
    
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		} 
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ajay");  
		
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("Ravi");  
		al2.add("Hanumat");  
			
		al.retainAll(al2);  
		System.out.println("Iterating the elements after retaining the elements of al2...");  
			
		itr=al.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}
		
		al.addAll(al2);
		System.out.println("Elements after adding the elements of al2 in al...");  
		itr=al.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}
	}  
}  