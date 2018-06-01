/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: Ch. 5 Programming Project #3 on page 372
Program Description: Create a class that represents a grade distribution for a given course.
 
 -------ALGORITHIM-------
 1. Import keyboard, create new GradeDistribution object
 2. Give user instructions, set variables As, Bs, Cs, Ds, Fs from keyboard
 3. Call distribution.setGrades() method to set the grade variables to the object instance
 4. Print breakdown of grades with distribution.readGrades() method
 5. Use distribution.totalGrades() and print the total number of grades
 6. Print out distribution.readPercentage() for a breakdown of percentages
 7. Call distribution.barGraph() to get a visual breakdown of grades by percentage
 */

package BuildImplement;
import java.util.Scanner;

public class Ch5PP3GradeDistribution_GabrielSkorski
{

	//create keyboard
	private static Scanner keyboard;

	public static void main(String[] args)
	{

		
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//create GradeDistribution object
		GradeDistribution distribution = new GradeDistribution();
		
		
		//instructions for user to input grades
		System.out.println("Please enter the number of grades.");
		System.out.println("How many students have an A?");
		int As = keyboard.nextInt();
		System.out.println("How many students have a B?");
		int Bs = keyboard.nextInt();
		System.out.println("How many students have a C?");
		int Cs = keyboard.nextInt();
		System.out.println("How many students have a D?");
		int Ds = keyboard.nextInt();
		System.out.println("How many students have an F?");
		int Fs = keyboard.nextInt();

		//set grade values to the GradeDistruction object instance
		distribution.setGrades(As, Bs, Cs, Ds, Fs);
		
		//output breakdown of number of grades
		System.out.println("\nYour grades breakdown is as follows: " + distribution.readGrades());
		
		//output the total number of grades
		System.out.println("\nThe total number of grades is " + distribution.totalGrades());
		
		//output breakdown of percentage from total of each grade
		System.out.println(distribution.readPercentage());
		
		//output bargraph of percentage distribution of grades
		distribution.barGraph();

	}

}
