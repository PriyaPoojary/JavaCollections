import java.util.*;
 
public class LinkedListExample
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();
 
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        list.add("F");
        list.add("G");
        System.out.println("Linked list : " + list);
 
        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked list after deletion: " + list);
 
        boolean status = list.contains("E");
 
        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");
 
        int size = list.size();
        System.out.println("Size of linked list = " + size);
 
        Object element = list.get(2);
        System.out.println("Element returned by get() : " + element);
        list.set(2, "Y");
        System.out.println("Linked list after change : " + list);
    }
}