package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInReverse {
public static void main(String args[])

{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Red");
	list.add("Green");
	list.add("Blue");
	list.add("Black");
	list.add("pink");
	list.add("brown");
	list.add("orange");
	list.add("Grey");
	
	
	Iterator itr = list.descendingIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
