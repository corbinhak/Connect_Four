import java.util.Scanner;
public class Player {
	
	private String name;
	
	Player(String name){
		this.name = name;
	}
	
	public void win() {//Class for if the player wins the game.
		System.out.printf("%s wins!%n", name);
	}
	
}
