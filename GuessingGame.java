import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	int targetNumber;
	int guess;
	Scanner in;
	public GuessingGame(int min,int max) {
		Random rand =new Random();
		targetNumber=rand.nextInt(max-min+1)+min;
		in= new Scanner(System.in);

	}
	
	private int playerguess() {
		System.out.print("Guess a number : ");
		int guess=in.nextInt();
		if(guess==targetNumber) {
			System.out.println("You have guessed my number correctly !! ");
			return 0;
		}
		else if (guess<targetNumber) {
			System.out.println("My number is greater than yours");
			return 1;
		}
		else {
			System.out.println("My number is lesser than yours");
			return 1;
		}
	}
	public static void launchGuessingGame() {
		Scanner in= new Scanner(System.in);
		System.out.println("Let's play a Guessing Game, you must guess the number i'm currently thinking about.");
		System.out.println("But first of all,you must give the the interval in which you want to play.");
		System.out.print("Please enter the minimal value of the Interval : ");
		int min=in.nextInt();
		System.out.print("Please enter the maximum value of the Interval : ");
		int max=in.nextInt();
		GuessingGame game=new GuessingGame(min, max);
		
		int i=1;
		while(i==1) {
			i=game.playerguess();
		}
		in.close();
		
	}
	
}
