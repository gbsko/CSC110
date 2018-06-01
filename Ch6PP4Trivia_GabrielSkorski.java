/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: Ch. 6 Practice Program #4 on page 476
Program Description: Do Practice Program 4 from Chapter 5 except define and use a constructor to initialize the Trivia object with a question and answer.
 
 -------ALGORITHIM-------
 1. Import keyboard
 2. Create first Trivia object from constructor with assigned question and answer
 3. Create second Trivia object from constructor with assigned question and answer
 4. Ask the first question, get user input
 5. Compare user first answer to actual first answer, output correct or not 
 6. Ask the second question, get user input
 7. Compare user second answer to actual second answer, output correct or not
 */

package BuildImplement;

import java.util.Scanner;

public class Ch6PP4Trivia_GabrielSkorski
{
	//create keyboard
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//Two new Trivia objects from constructor
		TriviaConstruct question1 = new TriviaConstruct("How many countries are there in the world?", "196");
		TriviaConstruct question2 = new TriviaConstruct("Approximately how many people are there in the world?", "7 billion");
		
		//ask 1st question, get input, compare answer, print correct or incorrect
		System.out.println(question1.getQuestion());
		String myAnswer = keyboard.nextLine();
		question1.setPlayerAnswer(myAnswer);
		System.out.println(question1.compare());
		
		//ask 2nd question, get input, compare answer, print correct or incorrect
		System.out.println(question2.getQuestion());
		myAnswer = keyboard.nextLine();
		question2.setPlayerAnswer(myAnswer);
		System.out.println(question2.compare());
	}

}
