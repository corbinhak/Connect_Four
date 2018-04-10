import java.util.Scanner;

public class ConnectFour extends Board{

	private static String player1 = "";
	private static String player2 = "";

	public static void main(String[] args) {
	 //Initialize Scanner
	 Scanner input = new Scanner(System.in);
	 
	 //Gets and stores player names
	 System.out.printf("Enter Player One's Name: ");
	 player1 = input.next();
	 Player p1 = new Player(player1,1);
	 System.out.printf("Enter Player Two's Name: ");
	 player2 = input.next();
	 Player p2 = new Player(player2,2);
	 
	 //Close scanner
   input.close();
   
	 //Launches and displays the board
	 launch(args);
	 
	 //Main game loop
	 while(true) {
		//Player One takes their turn
		//Checks if they won
		//Player Two takes their turn
		//Checks if they won	
	 }
		
	}
	
	//Return player1's name
	public static String getName1() {
		return player1;
	}

	//Returns player2's name
	public static String getName2() {
		return player2;
	}

}
