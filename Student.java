import java.util.*;
class Student
{
	String name;
	int stipend,enrollno;
	Student()
	{
		stipend = 100;	
		enrollno = 1;
		name = "ABC";
	}
	
	Student(String n , int s , int e)
	{
		name = n;
		stipend = s;
		enrollno = e;
	}
	
	public String first()
	{
		return "Name : " + name + "\n" + "Enrollment Number : " + String.valueOf(enrollno);
	}
	
	public void incr(int i)
	{
		System.out.println("Old Stipend : " + stipend + "\nNew Stipend : " + (stipend+i));
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sted, enm, amt;
		String nm;
		
		System.out.println("Enter Name : ");	
		nm = sc.next();
		
		System.out.println("Enter Stipend : ");
		sted = sc.nextInt();
		
		System.out.println("Enter Enrollment Number : ");
		enm = sc.nextInt();
		
		System.out.println("Enter Amount : ");
		amt = sc.nextInt();
		
		Student s = new Student(nm , sted , enm);
		System.out.println(s.first());
		s.incr(amt);	
		
	}
}