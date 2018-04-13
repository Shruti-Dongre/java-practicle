import java.util.Scanner;
class bank
{
	String name, acc_num, type;
	double balance = 500,  deposite, withdraw, check;
	Scanner s = new Scanner(System.in);
	int choice;
	void readdata()
	{
		System.out.println("please enter the name of customer : ");
		name = s.nextLine();
		System.out.println("please enter account number of customer : ");
		acc_num = s.nextLine();
		System.out.println("please enter type of account : ");
		type = s.next();
	}
	
	private void addmoney()
	{
		System.out.println("please enter the amount to deposite : ");
		deposite = s.nextDouble();
		
		System.out.println("original balance of "  +acc_num+ " : " +balance);
		balance += deposite;
		System.out.println("new balance of " +acc_num+ " : " +balance);
		choice1();
	}
	
	private void withdrawmoney()
	{
		System.out.println("please enter the amount to withdraw : ");
		withdraw = s.nextDouble();			
		
		check = balance - withdraw;
		if(check < 500)
		{
			System.out.println("minimum balance reached. Cannot withdraw " +withdraw+ " . Try a lesser amount");
		}
		else
		{
			System.out.println("original balance of "  +acc_num+ " : " +balance);
			balance -= withdraw;
			System.out.println("new balance of " +acc_num+ " : " +balance);
		}
		choice1();
	}		
	
	void choice1()
	{
		System.out.println("please enter 1 for DEPOSITE, 2 for WITHDRAW or any other number to quit : ");
		choice = s.nextInt();
		if(choice == 1)
			addmoney();
		else if(choice == 2)
				withdrawmoney();
		else
		{
			System.out.println("thank you for using my program ");
			System.exit(1);
		}
    }
}
class bank_account
{
	public static void main(String args[])	
	{
		Scanner s = new Scanner(System.in);
		
		bank obj = new bank();
		obj.readdata();
		obj.choice1();
	}
}