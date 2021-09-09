package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertLinkList {
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

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1= sc.next();
		
		 list.add(0, s);
		 list.add(s1);
		
		System.out.println(list);

}
}
