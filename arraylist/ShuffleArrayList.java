package arraylist;

import java.util.*;

public class ShuffleArrayList {
	
	public static void main(String args[]) {
	 ArrayList <String> list = new ArrayList<String>();
	 list.add("Red");
	 list.add("Green");
	 list.add("Blue");
	 list.add("Black");
	 list.add("pink");
	 list.add("brown");
	 list.add("orange");
	 list.add("Grey");
	 
	 System.out.println(list);
	Collections.shuffle(list);
     	 
	 System.out.println(list);
}
}