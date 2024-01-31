package studio2;
import java.util.Scanner;
import java.util.Random;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win probability in percent chance?");
		double winChance = in.nextDouble()/100;
		System.out.println("What is the limit of winnings?");
		double winLimit = in.nextDouble();
		double someChance = Math.random() * (0 + 1);
		
		String win = "";
		while (startAmount > 0) 
		if (someChance > winChance) {
			win = "You lost";
			startAmount = startAmount - 1; 
		
		} 
		else {
			win = "You win";
			startAmount = startAmount + 1;
		}
		
		System.out.println(win);
		
		
		
		

	}

}
