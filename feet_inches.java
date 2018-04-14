import java.util.Scanner;
class feet_inches
{
	public static void main(String args[])
	{
		int height;
		Scanner s = new Scanner(System.in);
		System.out.println("enter height of person inches : ");
		height = s.nextInt();
		int feet = height/12;
		int inches = height%12;
		System.out.println("the height is "+feet+ " feet and "+inches+ " inches");
	}
}