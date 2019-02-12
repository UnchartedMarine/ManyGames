public class GuessingGame{
	int targetNumber;
	int Guess;

	public GuessingGame(){
	
	System.out.println("Please specify the minimum of the integer");
	int Min=Integer.parseInt(System.console().readLine());
	System.out.println("Please specify the maximum of the integer");
	int Max=Integer.parseInt(System.console().readLine());
	
	targetNumber=Min + (int)(Math.random() * ((Max - Min) + 1));
	System.out.println("Guess my Integer !");
	
	int i=1;
	while(i==1){
		i=playerGuess();	
		}	
	System.out.println("Great Job Finding my number !! ");
	
	}
	
	public int playerGuess(){
	
	System.out.println("Please enter an Integer : ");
	Guess=Integer.parseInt(System.console().readLine());
	
	if (Guess==targetNumber)return 0;
	
	else if(Guess>targetNumber){
		System.out.println("My number is lesser than yours");
		}
	else {
		System.out.println("My number is greater than yours");
		}
	return 1;	
	}
}
