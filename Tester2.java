package BuildImplement;
import java.util.Scanner;


public class Tester2
{
	private static Scanner keyboard;
	public static void main(String[] args)
	{
		
		keyboard = new Scanner(System.in);

		int total = 0;
		int entries = 0;		
		System.out.println("Please enter positive integers, once you are done enter a -1.");
		int entered = keyboard.nextInt();

		while (entered >= 0)
		{
			total = total + entered;
			entries++;
			entered = keyboard.nextInt();
		}
			System.out.println("Number of entries: " + entries);
			System.out.println("Total: " + total);
	}

}
