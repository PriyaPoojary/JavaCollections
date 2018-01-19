package ObjectType;
import java.util.*;

class Manager implements Comparable<Manager> {  
	int id;  
	String name;
	
	public Manager(int id, String name) {  
		this.id = id;  
		this.name = name;  
	} 
	
	public int compareTo(Manager b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	} 
}

public class TreeSetExample {
	public static void main(String[] args){
		Set<Manager> set=new TreeSet<Manager>();  
	    
		Manager m1=new Manager(121,"Yashwant Kanetkar");  
		Manager m2=new Manager(233,"Wiley");  
		Manager m3=new Manager(101,"Mc Graw Hill");  

	    set.add(m1);  
	    set.add(m2);  
	    set.add(m3);  
	    
	    for(Manager m:set){  
	    System.out.println(m.id+" "+m.name);  
	    }  
	}
}
