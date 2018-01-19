package ObjectType;
import java.util.*;

class Magazine {
	int id;
	String name,author,publisher;  
	int quantity;  
	
	Magazine(int id, String name, String author, String publisher, int quantity){
		this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
}

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Magazine> hs=new LinkedHashSet<Magazine>();  
	    
		Magazine m1=new Magazine(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Magazine m2=new Magazine(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Magazine m3=new Magazine(103,"Operating System","Galvin","Wiley",6);  
	    
	    hs.add(m1);  
	    hs.add(m2);  
	    hs.add(m3);  
	      
	    Iterator<Magazine> itr=hs.iterator();  
		while(itr.hasNext()){ 
			Magazine m = itr.next();
	    	System.out.println(m.id+" "+m.name+" "+m.author+" "+m.publisher+" "+m.quantity);  
	    }
	}
}