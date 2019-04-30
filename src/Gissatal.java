import java.util.Random;
import java.util.Scanner;

public class Gissatal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int tal = rd.nextInt(0 + 100) + 1;
		
		int score = 0;
		
		while (true) {
			
			int input = sc.nextInt();
			
			score++;
			
			if (input == tal) {
				System.out.println("you won!! Score: " + score);
				break;
			}
			
			if (input > tal) {
				System.out.println("mindre");
			} else {
				System.out.println("högre");
			}
			
		}
		
		
		
		
	}

}
