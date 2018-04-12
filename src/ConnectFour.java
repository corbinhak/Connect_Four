

import java.util.Scanner;

public class ConnectFour extends Board{

	private static Player p1,p2;

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);

		//Gets and stores player names
		System.out.printf("Enter Player One's Name: ");
		p1 = new Player(input.next(),1);
		System.out.printf("Enter Player Two's Name: ");
		p2 = new Player(input.next(),2);


		//Close scanner
		input.close();

		//Launches and displays the board
		launch(args);

	}

	//Return player1's name
	public static String getName1() {
		return p1.getName();
	}

	//Returns player2's name
	public static String getName2() {
		return p2.getName();
	}

}

