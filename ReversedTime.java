import java.util.Scanner;

public class ReversedTime {
	public static void main(String Args[]){
		
		int sec;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many seconds are there?");
		sec = scan.nextInt();
		int minutes = sec / 60;
		int remainderSeconds = sec % 60;
		int hours = minutes / 60;
		int remainderMinutes = minutes % 60;
		System.out.println(hours+" hrs | " + remainderMinutes + " min | " + +remainderSeconds+" sec");
		
		
	}
}
