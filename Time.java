import java.util.Scanner;

public class Time {
	public static void main(String args[]){
		int hour;
		int min;
		int sec;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type hours in the time: ");
		hour = scan.nextInt();
		System.out.println("Type minutes in the time: ");
		min = scan.nextInt();
		System.out.println("Type seconds in the time: ");
		sec = scan.nextInt();
		int hourtomin = hour*60;
		int minpmin = hourtomin+min;
		int mintosec = minpmin*60;
		int sectosec = mintosec+sec;
		
		System.out.println("Time in seconds: "+sectosec);
		
		
	}
}
