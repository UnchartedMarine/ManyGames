import java.util.Scanner;

public class ManyGames {

	public static void main(String[] args) {
		//while (choixJeu != 10) {
			System.out.println("Welcom3e to ManyGames.\n");
			System.out.println("Choose a game to play:\n\n");
			
			System.out.println( "[1] Guess\n"
					+ "[2] TicTacToe\n"
					+ "[3] Bang\n" 
					+ "[4] Typing Skill Test\n" 
					+ "[5] Calculator\n" 

					+ "\n[10] Quit\n" );
			
			Scanner in = new Scanner(System.in);
			System.out.println("Your choice = ");
			int choixJeu = in.nextInt(); // Ca serait bien sur la meme ligne
			
			clearScreen();
			
			
			switch(choixJeu){
			case 1: GuessingGame.launchGuessingGame(); break;
			//case 2: new Morpion();
			case 3: Thread t1 = new Thread (new BangGame());
						t1.start();
						break;
			case 4: System.out.println("Starting Typing game\n");
		
			}//switch
		//}//while
		
		
	}

	//BROUILLON
	public	static void clearScreen(){
		int i = 0;
		while (i<10) {
			System.out.println("\n"); 
			i++;
		}
		System.out.flush(); // JE SAIS PAS
	   }
	
	
	}
