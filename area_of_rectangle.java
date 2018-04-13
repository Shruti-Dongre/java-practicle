import java.util.Scanner;
class Rectangle
{
	int length, breadth, area;
	Rectangle(int len, int brdth)
	{
		length = len;
		breadth = brdth;
	}
	public void calcarea(Rectangle obj)
	{
		area = 	length*breadth;
	}
}
class area_of_rectangle
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle(15,60);
		obj.calcarea(obj);
		System.out.println("Area of rectangle = "+obj.area);
	}
}