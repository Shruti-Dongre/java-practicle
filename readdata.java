import java.util.*;
import java.io.*;
class readdata
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String name;
			int rollno;
			System.out.println("Enter Name : ");
			name = sc.next();
			
			System.out.println("Enter Roll No : ");
			rollno = sc.nextInt();
			
			FileWriter fw = new FileWriter("student.txt");
			fw.write(name+" ");
			String r = String.valueOf(rollno);
			fw.write(r);
			fw.close();	
		}
		catch(Exception e)		
		{
			System.out.println(e.getMessage());		
		}
	}
}