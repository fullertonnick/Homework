import java.util.Random;

public class Dice {
	public static void main(String Args[]){
		int roll2;
		Random rand = new Random();
		int roll1 = rand.nextInt(6);
		System.out.println("Roll 1: "+roll1);
		roll2 = rand.nextInt(6);
		System.out.println("Roll 2 "+roll2);
		System.out.println("Total: "+(roll1+roll2));
	}
}
