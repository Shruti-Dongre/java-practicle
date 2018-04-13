import java.util.Scanner;
class ABCD
{
	public static void main(String args[])
	{
		for(int i = 0; i <= 3; i++)
		{
			for(int j=0, k=i; j<=i; j++, k--)			
			{
				System.out.print((char)('A' + k));
			}
			System.out.println("\n");
		}
	}
}