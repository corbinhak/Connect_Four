import java.util.Scanner;
public class ConnectFour extends Board {

	private static String player1 = "";
	private static String player2 = "";

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);

		//Gets and stores player names and Colors
		System.out.printf("Enter Player One's Name: ");
		player1 = input.next();
		System.out.printf("Enter Player Two's Name: ");
		player2 = input.next();

		//Close scanner
		input.close();

		//Launches and displays the board
		launch(args);

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

