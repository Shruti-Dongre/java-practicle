import java.io.*;
public class buffread
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(input);
		
		System.out.println("enter radius of circle : ");
		int rad = Integer.parseInt(buf.readLine());
		float pi = 3.14f;
		System.out.println("area of circle : " + (pi*pi*rad));
		System.out.println("circumference of circle : " + (2*pi*rad));
		System.out.println("volume of circle : " + ((4/3)*pi*(rad*rad*rad)));
		System.out.println("surface_area of circle : " + (4*pi*(rad*rad)));
	}
}