package newpackage.Marks;

public class IntChar {
	
	public static void main(String args[])
	{
		printn(5,'a');
	    printn('a','a');
	    printn(5,5);
	     printn('a',5);
	}
   static  void printn(int i , char n)
    {
    	System.out.println("integer:"+" "+i+" "+"character:" + "  " + n);
    }
   static  void printn(int i , int k)
    {
    	System.out.println("integer:"+"   "+i + " " + "  interger " + " " + k);
    }
  static   void printn(char n , char l)
    {
    	System.out.println("character:"+" "+ n +" "+"character:" + "  " + n);
    }
    static void printn(char n , int i)
    {
    	System.out.println("char:"+" "+ n +" "+"integer:" + "  " + i);
    }
}
