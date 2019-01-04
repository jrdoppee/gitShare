package gitShare;

//import java.util.Scanner;

public class calculate 
{
	String numbers;
	private Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		calculate cal = new calculate();
		System.out.print(cal.random());
	}
	
	public int random()
	{
		int lower = scan.nextInt()
		int higher = scan.nextInt();
		return lower+(int)((MATH.random()*(higher + 1)));
	
}
