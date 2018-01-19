package ObjectType;
import java.util.*;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<Student> set= new HashSet<Student>();
		
		Student s1 = new Student(101,"Kunal");
		Student s2 = new Student(102,"Kailash");
		Student s3 = new Student(103,"Karthik");
		Student s4 = new Student(104,"Kishan");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		Iterator<Student> itr=set.iterator();
		while(itr.hasNext()){
			Student s = itr.next();
			System.out.println(s.id+", "+s.name);
		}  
	}
}