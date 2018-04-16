class not_two extends Exception
{
	not_two()
	{
		super("this is not two");
	}
}
public class SCL
{
	public static void main(String args[])
	{
		try
		{
			if(args.length != 2)
				throw new not_twoO();
		}
		catch(not_two exc)
		{
			System.out.println(exc);
		}
	}
}