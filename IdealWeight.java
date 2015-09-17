import java.util.Scanner;


public class IdealWeight {
	public static void main(String Args[]){
		Scanner scan = new Scanner(System.in);
		int feet;
		int inch;
		System.out.println("What gender are you?");
		String gender;
		gender = scan.next();
		if (gender.equalsIgnoreCase("female")||gender.equalsIgnoreCase("f")){
			System.out.println("Please enter your height in feet, then enter the extra inches");
			feet = scan.nextInt();
			if (feet <= 4){
				System.out.println("You are too short to determine your average weight");
			}else{
				System.out.println("How many inches are you?");
				inch = scan.nextInt();
				int feetToInch = feet*12;
				int addInch = feetToInch-60+inch;
				int avgweight = (addInch*5)+100;
				System.out.println("Hey Girl! Your average weight is: "+avgweight);

			}
			
		}
		if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("m")){
			System.out.println("Please enter your height in feet, then enter the extra inches");
			feet = scan.nextInt();
			if (feet <= 4){
				System.out.println("You are too short to determine your average weight");
			}else{
				System.out.println("How many inches are you?");
				inch = scan.nextInt();
				int feetToInch = feet*12;
				int addInch = (feetToInch-60)+inch;
				int avgweight = (addInch*6)+106;
				System.out.println("Hey Boy! Your average weight is: "+avgweight);
			}	
		}
	}
}
	
