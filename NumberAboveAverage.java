/*
Author: Gabriel Skorski 
Date: 04 - 09 - 17 
Course and Section Number: CSC110 18019 
Program Name: Practice Assignment: Ch. 7 Arrays: Part 1: Exercises 
Program Description: Write a program in a class NumberAboveAverage that counts the number of days that the temperature is above average.
Read ten temperatures from the keyboard and place them in an array.
 
 -------ALGORITHIM-------
 1. Make keyboard and array for temperatures.
 2. Ask user to give temperatures, set them to the array.
 3. Compute the average.
 4. Compare temperatures in the array against the the average.
 5. Display results.
 */

package BuildImplement;
import java.util.Scanner;

public class NumberAboveAverage
{
	
	//create keyboard
	private static Scanner keyboard;
	
	public static void main(String[] args)
	{
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//temperature array
		double[] temperatures = new double[10];
		
		//initialize variables
		double totalTemp = 0;	
		int aboveAverage = 0;
		
		//instructions for user, fill array with temperature values
		System.out.println("Please enter 10 temperatures.");
		for (int i = 0; i < temperatures.length; i++){
			temperatures[i] = keyboard.nextDouble();
			totalTemp = totalTemp + temperatures[i];
		}
		
		//calculate and display average
		double averageTemp = totalTemp/temperatures.length;
		System.out.println("The average temperature was " + averageTemp + " degrees.");
		
		//compare above average temperatures, display result
		for (int i = 0; i < temperatures.length; i++){
			if (temperatures[i] > averageTemp)
			{
				aboveAverage++;
			} 
		}
		System.out.println("The temperature was above average on " + aboveAverage + " days.");
		
	}

}
