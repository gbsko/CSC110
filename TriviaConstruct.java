/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: TriviaConstruct Class
Program Description: Class for Ch6PP4Trivia_GabrielSkorski program
 */

package BuildImplement;

public class TriviaConstruct
{
	private String question;
	private String answer;
	private String playerAnswer;
	
	public TriviaConstruct(String ask, String solution){
		question = ask;
		answer = solution;
	}
	
	
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
