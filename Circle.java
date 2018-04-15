import java.util.*;
import java.io.*;

interface Area
{
	public void AreaCompute(float l , float b);
}

class Rectangle implements Area
{
	public void AreaCompute(float l , float b)
	{
		float area = l * b;
		System.out.println("Area of Rectangle : " + area);
	}
}

class Circle implements Area
{
	public void AreaCompute(float l , float b)
	{
		float area = 3.142f * l * l ;
		System.out.println("Area of Circle : " + area);
	}
	public static void main(String args[])
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter Length : ");
			float l = Float.valueOf(br.readLine());
			
			System.out.println("Enter Breadth : ");
			float b = Float.valueOf(br.readLine());
			Rectangle r = new Rectangle();
			r.AreaCompute(l,b);	
			
			System.out.println("Enter Radius : ");
			float radius = Float.valueOf(br.readLine());
			Circle c = new Circle();
			c.AreaCompute(radius,0f);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}