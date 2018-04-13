import java.util.Scanner;
class Employee
{
	String ename;
	double esalary;
	Employee(String enm, double esal)
	{
		ename = enm;
		esalary = esal;
	}
	void displayEmployee()
	{
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

class Manager extends Employee
{
	String dept;
	Manager(String enm, String md, double esal)
	{
		super(enm, esal);
		dept = md;
	}	
	void displayManager()
	{
		displayEmployee();
		System.out.println("Employee Department : " + dept);
	}
}

class Executive extends Manager
{
	String location;
	Executive(String enm, String md, String loc, double esal)
	{
		super(enm, md, esal);
		location = loc;
	}
	void displayExecutive()
	{
		displayManager();
		System.out.println("Employee Location : " + location);
	}
}

class employee_data
{
	String ename, dept, location;
	double esalary;
	public static void main(String args[])
	{
		Executive obj = new Executive("shruti", "hr", "kalyan", 5000);
		obj.displayExecutive();
	}	
}