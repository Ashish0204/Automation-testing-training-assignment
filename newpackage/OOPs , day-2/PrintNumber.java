package newpackage.Marks;

public class PrintNumber {
	public static void main(String args[])
	{
             printn(5);
             printn(5.6f);
             printn('a');
             printn("ashish");
	}
	static void printn(int i ) {
		
		System.out.println("number is Interger");
		
	}
	static void printn(float i ) {
		
		System.out.println("number is float");
		
	}
	static void printn(char i ) {
		
		System.out.println("number is character");
		
	}
	static void printn(String i ) {
		
		System.out.println("number is string");
		
	}
}

