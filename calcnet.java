class calcnet
{
	double basic_sal;
	double net_sal;
	
	void set_basicsal(float sal)
	{
		basic_sal = sal;
	}
	
	void disp_netsal()
	{
		if(basic_sal >= 10000)
		{
			net_sal = basic_sal + (basic_sal*0.20);
		}
		else if(basic_sal >= 5000)
		{
			net_sal = basic_sal + (basic_sal*0.10);
		}
		else if(basic_sal >= 3000)
		{
			net_sal = basic_sal + (basic_sal*0.05);
		}
		else
		{
			net_sal = basic_sal + (basic_sal*0.02);
		}
		System.out.println("basic sal : " +basic_sal);
		System.out.println("net sal : " +net_sal);
	}
	public static void main(String args[])
	{
		calcnet c = new calcnet();
		c.set_basicsal(5000f);
		c.disp_netsal();
	}
}