//*************************************************************** 
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height 
//*************************************************************** 

import java.util.Scanner;

public class Paint {
	public static void main(String[] args) {
		final int COVERAGE = 350; //paint covers 350 sq ft/gal 
		//declare integers length, width, and height; 
		int length;
		int width;
		int height;
		//declare double totalSqFt; 
		double totalSqFt;
		//declare double paintNeeded; 
		double paintNeeded;
		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);
		//Prompt for and read in the length of the room 
		System.out.println("What is the length of the room?");
		length = scan.nextInt();
		//Prompt for and read in the width of the room 
		System.out.println("What is the width of the room?");
		width = scan.nextInt();
		//Prompt for and read in the height of the room
		System.out.println("What is the height of the room?");
		height = scan.nextInt();
		//Compute the total square feet to be painted--think 
		totalSqFt = length*height*4;
		//about the dimensions of each wall
		//Compute the amount of paint needed
		paintNeeded = totalSqFt/450;
		//Print the length, width, and height of the room and the 
		System.out.println("Length: "+ length);
		System.out.println("Width: "+ width);
		System.out.println("Height "+ height);
		System.out.println("Number of paint gallons needed: "+ paintNeeded);
		
		//number of gallons of paint needed. 
	}
}
