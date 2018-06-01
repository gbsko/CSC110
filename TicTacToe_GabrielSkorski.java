/*
Author: Gabriel Skorski 
Date: 04 - 23 - 17 
Course and Section Number: CSC110 18019 
Program Name: Tic Tac Toe
Program Description: Make a game of Tic Tac Toe.
 
 -------ALGORITHIM-------
 1. Create TicTacToe Class to go with program
 2. Make an array as an object of TicTacToe
 3. Fill the array will blank elements
 4. Set players 1 and 2 to either X or O depending on their input
 5. Start the game, getting chars from the users to fill the 2D array
 6. Check to see if there is a winning match or tie after every move
 	a. make method to check against the 8 possible win configurations
 	b. also check for 0 empty slots which results in a tie
 7. Display board after every move so user can see what is played and not
 8. At the end state who wins or if it is a tie
 9. Ask user if they would like to play again
 */

package BuildImplement;
import java.util.Scanner;


public class TicTacToe_GabrielSkorski
{
	//create keyboard boolean true for first play of game
	private static Scanner keyboard;
	private static boolean playAgain = true;

	//main method
	public static void main(String[] args)
	{
		//loop main method to replay game
		while(playAgain){
	
		//game over boolean set to false
		boolean gameOver = false;
		
		//new keyboard
		keyboard = new Scanner(System.in);
		
		//make new TicTacToe game object
		TicTacToe newGame = new TicTacToe();
		
		//set players X or O
		System.out.println("Player 1 choose either X or O.");
		char first = keyboard.nextLine().toUpperCase().charAt(0);
		char second = newGame.choosePlayer(first);
		newGame.displayBoard();
		
		//game logic, alternating turns through the game
		while (gameOver == false)
		{
			newGame.goPlayer(first);
			newGame.displayBoard();
			gameOver = newGame.checkGame();
			if (gameOver == false)
			{
				newGame.goPlayer(second);
				newGame.displayBoard();
				gameOver = newGame.checkGame();
			}
		}
		
		//prompt user to plau again
		System.out.println("Would you like to play again? Y or N.");
		char restart = keyboard.next().toLowerCase().charAt(0);
		if (restart == 'y')
		{
			playAgain = true;
		}
		else
		{
			System.out.println("Thanks For Playing!");
			playAgain = false;
		}

		}
	}
}
