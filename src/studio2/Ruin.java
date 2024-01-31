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
		double winChance = in.nextDouble();
		System.out.println("What is the limit of winnings?");
		double winLimit = in.nextDouble();
		double someChance = Math.random() * (0 + (1/(winChance)/100));
		boolean winningChance = (someChance == 0);
		String win = "";
		if (winningChance = false); {
			win = "You lost";
		
		} System.out.println(win); 
			
		
		
			
		}
		
		
		
		
		

	}

}
