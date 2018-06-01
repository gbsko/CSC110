/*
Author: Gabriel Skorski 
Date: 04 - 23 - 17 
Course and Section Number: CSC110 18019 
Program Description: TicTacToe Class for TicTacToe_GabrielSkorski
 */

package BuildImplement;
import java.util.Scanner;

public class TicTacToe
{
	//create keyboard
	private static Scanner keyboard;

	//size of the TicTacToe array game board
	final private static int ROWS = 3;
	final private static int COLUMNS = 3;
	
	//the game array
	char[][] game; 
	
	//initialize variables for filling out the game board array
	private int row = 0;
	private int column = 0;
	private char player1;
	private char player2;
	
	//default constructor class, fills the array
	public TicTacToe()
	{
		game = new char[ROWS][COLUMNS];
		for(int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLUMNS; j++)
			{
				game[i][j] = '_';
			}
	}
	
	//lets user pick which shape they want to be
	public char choosePlayer(char first)
	{
		player1 = first;
	
		if (player1 == 'X')
		{
			player2 = 'O';
		} 
		else 
		{
			player2 = 'X';
			player1 = 'O';
		}
		System.out.println("Player one is " + player1);
		System.out.println("Player two is " + player2);
		return player2;
	}
	
	//player's turn to enter their move
	public void goPlayer(char turn)
	{
		keyboard = new Scanner(System.in);

		System.out.println("\n" + turn + ", your turn. . .");
		System.out.println("Pick a row");
		row = keyboard.nextInt() - 1;
		System.out.println("Pick a column");
		column = keyboard.nextInt() - 1;
		makeMove(row, column, turn);
	}
	
	//add the move to the array, block duplicate moves
	public void makeMove(int a, int b, char c)
	{
		if (game[a][b] == 'X' || game[a][b] == 'O')
		{
			System.out.println("You can't do that! Try again.");
			goPlayer(c);
		} 
		else
		{
		game[a][b] = c;
		}
	}
	
	//display the game board with row and column numbering
	public void displayBoard()
	{
		System.out.print("  1 2 3 ");

		for (int i = 0; i < ROWS; i++)
		{
			System.out.println("");
			System.out.print(i+1 + " " );

			for (int j = 0; j < COLUMNS; j++)
			{
				System.out.print(Character.toString(game[i][j]) + " ");
			}
		}
	}
	
	//check for either play win or tie game over
	public boolean checkGame()
	{
		boolean win = false;
		int empty = 0;
		
		//tie game logic
		for (int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLUMNS; j++)
			{
				if (game[i][j] == '_')
				{
					empty++;				
				}
			}		
		if (empty == 0)
		{
			System.out.println("\nTIE GAME");
			win = true;
		}
	
		
		//Horizontal win configurations
		
		//1
		if (game[0][0] == game[0][1] && game[0][0] == game[0][2] && game[0][0] == 'X')
		{
			win = xWins();
		}
		 if (game[0][0] == game[0][1] && game[0][0] == game[0][2] && game[0][0] == 'O')
		{
			win = oWins();
		}
		
		//2
		if (game[1][0] == game[1][1] && game[1][0] == game[1][2] && game[1][0] == 'X')
		{
			win = xWins();
		}
		 if (game[1][0] == game[1][1] && game[1][0] == game[1][2] && game[1][0] == 'O')
		{
			win = oWins();
		}

		//3
		if (game[2][0] == game[2][1] && game[2][0] == game[2][2] && game[2][0] == 'X')
		{
			win = xWins();
		}
		 if (game[2][0] == game[2][1] && game[2][0] == game[2][2] && game[2][0] == 'O')
		{
			win = oWins();
		}
		
		
		
		//Vertical win configurations
		
		//4
		if (game[0][0] == game[1][0] && game[0][0] == game[2][0] && game[0][0] == 'X')
		{
			win = xWins();
			
		}
		 if (game[0][0] == game[1][0] && game[0][0] == game[2][0] && game[0][0] == 'O')
		{
			win = oWins();
		}
		 
		//5
		if (game[0][1] == game[1][1] && game[0][1] == game[2][1] && game[0][1] == 'X')
		{
			win = xWins();
		}
		 if (game[0][1] == game[1][1] && game[0][1] == game[2][1] && game[0][1] == 'O')
		{
			win = oWins();
		}
		
		//6
		if (game[0][2] == game[1][2] && game[0][2] == game[2][2] && game[0][2] == 'X')
		{
			win = xWins();
		}
		 if (game[0][2] == game[1][2] && game[0][2] == game[2][2] && game[0][2] == 'O')
		{
			win = oWins();
		}
		
		
		
		//Diagonal win configurations
		
		//7
		if (game[0][0] == game[1][1] && game[0][0] == game[2][2] && game[0][0] == 'X')
		{
			win = xWins();
		}
		 if (game[0][0] == game[1][1] && game[0][0] == game[2][2] && game[0][0] == 'O')
		{
			win = oWins();
		}
		
		//8
		if (game[2][0] == game[1][1] && game[2][0] == game[0][2] && game[2][0] == 'X')
		{
			win = xWins();
		}
		 if (game[2][0] == game[1][1] && game[2][0] == game[0][2] && game[2][0] == 'O')
		{
			win = oWins();
		}
		return win;
	}
	
	//Win for the X player
	public boolean xWins()
	{
		System.out.println("\nX WINS");
		return true;
	}
	
	//Win for the O player
	public boolean oWins()
	{
		System.out.println("\nO WINS");
		return true;
	}
}
