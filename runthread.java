class thread1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
			System.out.println("Thread 1");
	}
}

class thread2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
			System.out.println("Thread 2");
	}
}

class thread3 implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
			System.out.println("Thread 3");
	}
}

class thread4 implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
			System.out.println("Thread 4");
	}
}

class thread5 implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
			System.out.println("Thread 5");
	}
}

class runthread
{
	public static void main(String args[])
	{
		try
		{
			thread1 t1 = new thread1();
			Thread T1 = new Thread(t1);
			T1.start();
			T1.join();
			T1.sleep(200);
			
			thread2 t2 = new thread2();
			Thread T2 = new Thread(t2);
			T2.start();
			T2.join();
			T2.sleep(200);
			
			thread3 t3 = new thread3();
			Thread T3 = new Thread(t3);
			T3.start();
			T3.join();
			T3.sleep(200);
			
			thread4 t4 = new thread4();
			Thread T4 = new Thread(t4);
			T4.start();
			T4.join();
			T4.sleep(200);
			
			thread5 t5 = new thread5();
			Thread T5 = new Thread(t5);
			T5.start();
			T5.join();
			T5.sleep(200);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}