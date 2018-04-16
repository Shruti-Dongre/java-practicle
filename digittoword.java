import java.util.*;
class digittoword extends Exception
{
	public static void main(String args[])
	{
		String wordarr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String digiarr = "0123456789";

		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		String num = s.next();
		
		for(int i=0; i<num.length(); i++)
		{
			char temp = num.charAt(i);
			int index = digiarr.indexOf(temp);
			//int index = indexOf(temp);
			System.out.print(wordarr[index]+ " ");
		}
	}
}