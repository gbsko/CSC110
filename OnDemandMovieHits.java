/*
Author: Gabriel Skorski 
Date: 04 - 09 - 17 
Course and Section Number: CSC110 18019 
Program Name: Challenge Assignment: Ch. 7 Arrays Part 1 Design and Implement: OnDemandMovieHits
Program Description: Write a program in a class OnDemandMovieHits that computes the cost of each movie sold On Demand.
There are 7 movies. You may come up with the list of the 7 movies. Also, come up with a unique cost for each movie per day.
Locate the movie in the name array and use that index to find the cost per day in the cost array.  Compute and print the total cost of sale. 
 
 -------ALGORITHIM-------
 1. Get keyboard.
 2. Make movie names array filled with 7 movie names. 
 3. Make a price array of seven different prices for each movie.
 4. Give user instruction, print numbered list of movies to choose from.
 5. Ask user how many days they want the movie.
 6. Compute cost w/ price of movie times the days they want it.
 7. Display choice and final cost.
 */

package BuildImplement;
import java.util.Scanner;

public class OnDemandMovieHits
{
	//create keyboard
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//array of movie names
		String[] movieName = {"",
				"Anchorman: The Legend of Ron Burgundy", 
				"The Other Guys", 
				"Talladega Nights: The Ballad of Ricky Bobby", 
				"Step Brothers",
				"Semi-Pro",
				"Blades of Glory",
				"Old School"};
		
		//array of movie prices
		double[] moviePrice = {0, 3.99, 2.99, 2.50, 3.50, 1.99, 1.50, 0.99};
				
		//user instructions, print menu of choices
		System.out.println("Hello, welcome to On Demand! Please pick a movie from the list below:");
		for (int i = 1; i < movieName.length; i++)
		{
		System.out.print(i + ". " + movieName[i]);
		System.out.println(" - $" + String.format("%.2f", moviePrice[i]) + " per day");
		}
		
		//user's pick
		int pick = 0;
		do{
			 pick = keyboard.nextInt();
		} while (pick < 1 || pick >= movieName.length);
		System.out.println("You picked " + movieName[pick] + ". Great choice!");

		//number of days user wants to keep the movie
		System.out.println("How many days would you like to keep the movie for?");
		int numberOfDays = keyboard.nextInt();
		
		//calculate final cost, display result
		double cost = moviePrice[pick] * numberOfDays;
		System.out.println("To purchase " + movieName[pick] + " for " + numberOfDays + " days will cost $" + String.format("%.2f", cost) + ".");
		
	}

}
