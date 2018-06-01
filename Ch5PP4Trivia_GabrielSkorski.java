/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: Ch. 5 Practice Problem #4: on page 370
Program Description: Create two Trivia object with questions and answers of your choice.
For each Trivia object have the program ask the question, input an answer, and compare the typed answer to the actual answer.
Output if it is correct or incorrect.
 
 -------ALGORITHIM-------
 1. Import keyboard
 2. Create two Trivia objects
 3. Assign question and answer values for the first object
 4. Assign question and answer values for the second object
 5. Ask the first question, get user input
 6. Compare user first answer to actual first answer, output correct or not 
 7. Ask the second question, get user input
 8. Compare user second answer to actual second answer, output correct or not
 */

package BuildImplement;
import java.util.Scanner;


public class Ch5PP4Trivia_GabrielSkorski
{
	//create keyboard
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//make two Trivia class objects
		Trivia question1 = new Trivia();
		Trivia question2 = new Trivia();
		
		//set question and answer for question1
		question1.question = "How many countries are there in the world?";
		question1.answer = "196";
		
		//set question and answer for question2
		question2.question = "Approximately how many people are there in the world?";
		question2.answer = "7 billion";
		
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
