import java.util.*;
class tour
{
	private String Tcode;
	private int Noofadults, Noofkids , kilometers;
	private float totFare;
	public tour()
	{
		Tcode = null;
		Noofadults = Noofkids = kilometers = 0;
		totFare = 0f;
	}
	public void AssignFare()
	{	
		if(kilometers >= 1000)
			totFare = (500 * Noofadults) + (250 * Noofkids);
		else if(kilometers >= 500 && kilometers < 1000)
			totFare = (300 * Noofadults) + (150 * Noofkids);
		else if(kilometers < 500)
			totFare = (200 * Noofadults) + (100 * Noofkids);
		else
			System.out.println("Invalid");
	}
	public void EnterTour(String t , int na, int nk, int k)
	{
		Tcode = t;
		Noofadults = na;
		Noofkids = nk;
		kilometers = k;
	}
	public void ShowTour()
	{
		System.out.println("Tcode : " + Tcode + "\nNo. of Adults : " + Noofadults + "\nNo. of Kids : " +
			Noofkids + "\nKilometres : " + kilometers + "\nTotal Fare : " + totFare);
	}
	public static void main(String args[])
	{
		tour t = new tour();
		Scanner sc = new Scanner(System.in);
		String code;
		int no_adlt, no_kd, km;
		
		System.out.println("Enter Tcode : ");
		code = sc.next();
		
		System.out.println("Enter No. of Adults : ");
		no_adlt = sc.nextInt();
		
		System.out.println("Enter No. of Kids : ");
		no_kd = sc.nextInt();
		
		System.out.println("Enter No. of Kms : ");
		km = sc.nextInt();
		t.EnterTour(code, no_adlt, no_kd, km);
		t.AssignFare();
		t.ShowTour();
	}
}