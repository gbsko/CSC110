/*
Author: Gabriel Skorski 
Date: 04 - 02 - 17 
Course and Section Number: CSC110 18019 
Program Name: GradeDistribution Class
Program Description: Class for Ch5PP3GradeDistribution_GabrielSkorski program
 */

package BuildImplement;

public class GradeDistribution
{
	
	//initialize variables
	private int gradeA;	
	private int gradeB;	
	private int gradeC;	
	private int gradeD;	
	private int gradeF;	
	private int totalGrade;
	
	private int percentA;
	private int percentB;
	private int percentC;
	private int percentD;
	private int percentF;

	

	//set values to the gradeA-F variables
	public void setGrades(int As, int Bs, int Cs, int Ds, int Fs){
		
		gradeA = As;
		gradeB = Bs;
		gradeC = Cs;
		gradeD = Ds;
		gradeF = Fs;
		
		totalGrade = gradeA + gradeB + gradeC + gradeD + gradeF;
		
		calculatePercent();
			
	}
	
	//calculate the percentages of each letter grade from the total
	private void calculatePercent(){
		
		percentA = (int)Math.round((double)gradeA/(double)totalGrade * 100);
		percentB = (int)Math.round((double)gradeB/(double)totalGrade * 100);
		percentC = (int)Math.round((double)gradeC/(double)totalGrade * 100);
		percentD = (int)Math.round((double)gradeD/(double)totalGrade * 100);
		percentF = (int)Math.round((double)gradeF/(double)totalGrade * 100);
		
	}
	


	//return the number of each letter grade
	public String readGrades(){
		 
		String readGrade = ("\nA = " + gradeA + "\nB = " + gradeB + "\nC = " + gradeC + "\nD = " + gradeD + "\nF = " + gradeF);
		return readGrade;
		
	}
	
	//return value of totalGrade
	public int totalGrades(){
		return totalGrade;
	}
	
	//return percentage breakdown of each letter grade
	public String readPercentage(){
		
		String readPercent = ("\n" + percentA + "% = A\n" + percentB + "% = B\n" + percentC + "% = C\n" + percentD + "% = D\n" + percentF + "% = F\n");
		return readPercent;
		
	}
	
	
	//generate ASCII bar graph with percentage breakdowns
	public void barGraph(){
		
		System.out.println("0   10   20   30   40   50   60   70   80   90   100");
		System.out.println("|   |    |    |    |    |    |    |    |    |    |");

		int n;
		for (n = 1; n <= 50; n++)
		{
			System.out.print("*");
		}
		
		
		System.out.print("\n");
		int A;
		for(A = 1; A <= percentA/2; A++)
		{
			System.out.print("*");
		}
		
		System.out.print(" A\n");
		int B;
		for(B = 1; B <= percentB/2; B++)
		{
			System.out.print("*");
		}
		
		System.out.print(" B\n");
		int C;
		for(C = 1; C <= percentC/2; C++)
		{
			System.out.print("*");
		}
		
		System.out.print(" C\n");
		int D;
		for(D = 1; D <= percentD/2; D++)
		{
			System.out.print("*");
		}
		
		System.out.print(" D\n");
		int F;
		for(F = 1; F <= percentF/2; F++)
		{
			System.out.print("*");
		}
		System.out.print(" F\n");


	}
	
	

}
