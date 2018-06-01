/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: Trivia Class
Program Description: Class for Ch5PP4Trivia_GabrielSkorski program
 */

package BuildImplement;

public class Trivia
{
	public String question;
	public String answer;
	private String playerAnswer;
	
	public String getQuestion(){
		return question;
	}
	
	public void setPlayerAnswer(String myAnswer){
		playerAnswer = myAnswer;
	}
	
	public String compare(){
		
		String response;
		if (playerAnswer.equalsIgnoreCase(answer)) {
			response = ("Correct!");
		}else{
			response = ("Incorrect!");
		}
		return response;
	}
	
}
