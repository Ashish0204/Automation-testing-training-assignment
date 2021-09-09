package linkedlist;
import java.util.*;
public class LinkedListDemo {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	
	list.add("Ashish");
	list.add("Abhisekh");
	list.add("Aamla");
	list.add("Anirudh");
	list.add("Aparna");
	list.add("Ashutosh");
	
	System.out.println(list);
	System.out.println("Enter the string you want to append at end of the list");
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	
	list.add(s);
	System.out.println(list);
}
}
