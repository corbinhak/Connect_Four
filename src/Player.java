import java.util.Scanner;
public class Player {
	
	private String name;
	private int id;

	//Player constructor
	Player(String name, int playerNum){
		this.name = name;
		this.id = playerNum;
	}
	//Get player name
	public String getName(){
		return this.name;
	}
	public int getID(int playerNum){
		return this.id;
	}

	@Override
	public String toString(){
		return String.format("");
	}
	
}
