import java.util.Scanner;
import javafx.application.Application;

public class ConnectFour {
	static Player pOne = new Player("Player One");
	static Player pTwo = new Player("Player Two");
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Board.launchApp(args);//Launches and displays the board
		while(true) {//Main game loop
			//Player One takes their turn
			//Checks if they won
			//Player Two takes their turn
			//Checks if they won	
		}
		
	}

}
