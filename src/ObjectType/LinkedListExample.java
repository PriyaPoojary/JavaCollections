package ObjectType;
import java.util.*;

class Employee {

	int id;
	String name;
	String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
}

public class LinkedListExample {
	public static void main(String args[]){
		List<Employee> list = new LinkedList<Employee>();

		Employee e1 = new Employee(101,"Kunal", "CIS");
		Employee e2 = new Employee(102,"Kailash", "Development");
		Employee e3 = new Employee(103,"Karthik", "Testing");
		Employee e4 = new Employee(104,"Kishan", "AVM");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()){
			Employee e = itr.next();
			System.out.println(e.id+", "+e.name+", "+e.department);
		}  
	}
}
