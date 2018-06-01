/*
Author: Gabriel Skorski 
Date: 04 - 23 - 17 
Course and Section Number: CSC110 18019 
Program Name: Percent Contribution
Program Description: Write a program that reads integers, one per line, and displays their sum.
Also, display all the numbers read, each with an annotation giving its percentage contribution to the sum.
 
 -------ALGORITHIM-------
 1. Make keyboard input and initialize variables
 2. Get array length from user and generate array of that length
 3. Get array elements from user and fill the array
 4. Call to summation method to calculate and return the sum
 5. Calculate the percentage of the array element to the sum
 6. Display annotated numbers from the array with percentage results
 */

package BuildImplement;
import java.util.Scanner;

public class PercentContribution_GabrielSkorski
{
	//create keyboard
	private static Scanner keyboard;
	
	
	//main method
	public static void main(String[] args)
	{
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//initialize variables
		int size = 0;
		int[] numbers; 
		
		//create array of user-defined length
		System.out.println("How many numbers will you enter?");
		size = keyboard.nextInt();
		numbers = new int[size];
		
		//ask user for array elements and fill array
		System.out.println("Enter " + size + " integers, one per line:");
		for(int i = 0; i < size; i++)
		{
			numbers[i] = keyboard.nextInt();
		}
		
		//get sum of numbers and display to user
		int sum = calculate(numbers, size);
		System.out.println("The sum is " + sum + ".");
		
		//final breakdown of numbers and their percentage of the sum
		System.out.println("The numbers are:");
		for(int i = 0; i < size; i++)
		{
			float percent = ((float)numbers[i]/(float)sum) * 100;	
			System.out.println(numbers[i] + ", which is " + Math.round(percent) + "% of the sum.");
		}
	}
	
	
	//calculate sum
	public static int calculate(int[] numbers, int size)
	{
		int sum = 0;
		for(int i = 0; i < size; i++)
		{
			sum = sum + numbers[i];
		}
		return sum;	
	}
}
