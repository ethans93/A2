/**
*The purpose of this program is to take five user generated numbers and find the sum
*and average of those numbers, and present the answers to the user
*@author Ethan Steen
*@version 1.0
*/
import java.util.Scanner;

public class A2P2{

public static void main (String [] args){


	Scanner keyboard = new Scanner (System.in);

	double x1, x2, x3, x4, x5, sum, average;
	/*
	the five numbers the user puts in will be stored as x1-x5, double is used to 
	account for non-integer numbers
	*/
	
	System.out.println("Please enter 5 numbers, separated by spaces, then hit enter:");
	x1 = keyboard.nextDouble();
	x2 = keyboard.nextDouble();
	x3 = keyboard.nextDouble();
	x4 = keyboard.nextDouble();
	x5 = keyboard.nextDouble();
	//all five variables are now entered

	sum = x1+x2+x3+x4+x5;
	average = sum/5;
	/*
	The five variables the user input, the sum of all five is found and stored as the 
	variable "sum", the average of the x1-x5 is found and stored in the 
	variable "average".
	*/
	
	System.out.println();
	System.out.println("The sum of the numbers is " + sum + ".");
	System.out.println("The average of the numbers is " + average + ".");



}
}
