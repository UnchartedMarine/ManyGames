import java.util.*;
public class TicTacToe{
	private char[][] plateau;
	private int turn=0;
	private char token;
	private static Map<Integer,String> position = new HashMap<Integer, String>();
	
	public TicTacToe(){
	plateau=new char[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			plateau[i][j]=' ';
			}	
		}
	position.put(1,"2-0");
	position.put(2,"2-1");
	position.put(3,"2-2");
	position.put(4,"1-0");
	position.put(5,"1-1");
	position.put(6,"1-2");
	position.put(7,"0-0");
	position.put(8,"0-1");
	position.put(9,"0-2");	
	
	}
	
	public static void launchTicTacToe() {
	TicTacToe game=new TicTacToe();
	System.out.println("Welcome to this game of noughts and crosses \n Have Fun! ");
	for(int i=0;i<10;i++) {
		game.afficher();
		game.play();
		}
	}
	
	public void afficher(){
	int k=0;
	for(int i=0;i<5;i++){
		if(i%2==0){
			System.out.println(" "+plateau[k][0]+" | "+plateau[k][1]+" | "+plateau[k][2]);
			k++; 
			}
		else{
			System.out.println("-----------");
			}	
			
		}
	}
	
	public void play(){
	if(turn%2==0){
		token='X';
		}
	else{
		token='O';	
	}
	Scanner in =new Scanner(System.in);
	System.out.println("Enter where you want to play or press 0 for help");
	int pos=in.nextInt();
	if(pos==0) {
		help();
	}
	else {
		String strpos=position.get(pos);
		StringTokenizer tok=new StringTokenizer(strpos,"-");
		String tabpos[]=new String[2];
		tabpos[0]=tok.nextToken();
		tabpos[1]=tok.nextToken();
		plateau[Integer.parseInt(tabpos[0])][Integer.parseInt(tabpos[1])]=token;	
		turn++;	
		}
	}
	
	public static void help(){
	String test=new String(" 7 | 8 | 9 \n-----------\n 4 | 5 | 6 \n-----------\n 1 | 2 | 3 ");
	System.out.println("This page gives you the positon you must give for each box");
	System.out.println(test);

	}
	
}


