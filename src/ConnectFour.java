import java.util.Scanner;

public class ConnectFour extends Board{
	
	public static void main(String[] args) {
	    //Initialize Scanner
	    Scanner input = new Scanner(System.in);

	    //Gets and stores player names
	    System.out.printf("Enter Player One's Name:");
	    Player p1 = new Player(input.next(),1);
	    System.out.printf("Enter Player Two's Name:");
	    Player p2 = new Player(input.next(),2);

	    //Close scanner
        input.close();

	    //Launches and displays the board
	    launchApp(args);
		while(true) {//Main game loop
			//Player One takes their turn
			//Checks if they won
			//Player Two takes their turn
			//Checks if they won	
		}
		
	}

}
