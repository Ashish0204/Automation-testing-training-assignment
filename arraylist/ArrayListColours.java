package arraylist;
import java.util.*;
public class ArrayListColours {
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

Iterator itr = list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
