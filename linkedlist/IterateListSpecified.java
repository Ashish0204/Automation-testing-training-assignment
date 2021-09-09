package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IterateListSpecified {

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
		
		System.out.println("Enter the position from which you whant to iterate the list");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		Iterator itr = list.listIterator(pos);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
