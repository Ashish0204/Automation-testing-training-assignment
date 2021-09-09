package newpackage.Marks;

class Student {
	
	String name ;
	int age;
	String address;
	
	Student(String name , int age , String address)
	{
		this.name= name ;
		this.age=age;
		this.address= address;
	}
	
	void setInfo(String name , int age)
	{
		this.name=name;
		this.age=age;
	}
	void setInfo(String name, int age , String address)
	{
		this.name=name;
		this.age=age;
		this.address= address;
	}
	void display()
	{
		System.out.println("Student Info :" + " "+ name + "  " + age + "  "+ address);
		
	}

}

public class Mainn{
	
	public static void main(String args[]) {
		
	Student s = new Student("unknown", 23 , "not available");
	
	Student[] s1= new Student[10];
	
	s1[0]=new Student(null, 0, null);
	s1[1]=new Student(null, 0, null);
	s1[2]=new Student(null, 0, null);
	s1[3]=new Student(null, 0, null);
	s1[4]=new Student(null, 0, null);
	s1[5]=new Student(null, 0, null);
	s1[6]=new Student(null, 0, null);
	s1[7]=new Student(null, 0, null);
	s1[8]=new Student(null, 0, null);
	s1[9]=new Student(null, 0, null);
	s1[0].setInfo("ashish",23 , "varanasi");
	
	s1[1].setInfo("Faaz", 24);
	s1[2].setInfo("Vishal", 24, "varanasi");
	s1[3].setInfo("Rahul", 24,"Gwalior" );
	s1[4].setInfo("Sonu", 24 , " Chanderi");
	s1[5].setInfo("Fz", 24);
	s1[6].setInfo("Faz", 24);
	s1[7].setInfo("Fakkaz", 24);
	s1[8].setInfo("Faakkz", 24);
	s1[9].setInfo("Faaoioiz", 24);
	s1[0].display();
	s1[1].display();
	s1[2].display();
	s1[3].display();
	s1[4].display();
	s1[5].display();
	s1[6].display();
	s1[7].display();
	s1[8].display();
	s1[9].display();
	}
	
	
}