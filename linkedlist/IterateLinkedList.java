package linkedlist;
import java.util.*;
public class IterateLinkedList {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	
	list.add("Ashish");
	list.add("Ashutosh");
	list.add("Angad");
	list.add("Faaz khan");
	
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
