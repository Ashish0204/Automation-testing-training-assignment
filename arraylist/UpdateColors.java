package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpdateColors {
public static void main(String args[])
{
	ArrayList<String> list = new ArrayList<String>();
	list.add("Red");
	list.add("Green");
	list.add("Blue");
	list.add("Black");
	list.add("pink");
	list.add("brown");
	list.add("orange");
	list.add("Grey");

	System.out.println("Enter the position of the index you want to update");
	Scanner sc = new Scanner (System.in);
	int pos = sc.nextInt();
	
	System.out.println("Enter the string you want to insert ");
	String s = sc.next();
	list.remove(pos);
	list.add(pos, s);
	
	Iterator itr= list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
