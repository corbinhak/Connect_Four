import java.util.Scanner;
public class Player extends Board{
	
	private String name;
	private int id;
	
	//////////////////////
	//Player constructor//
	//////////////////////
	Player(String name, int playerNum){
		this.name = name;
		this.id = playerNum;
	}
	
	///////////////////
	//Get player name//
	///////////////////
	public String getName(){
		return this.name;
	}
	public int getID(int playerNum){
		return this.id;
	}

	@Override
	public String toString(){
		return String.format("Player %d: %s's Turn");
	}
	
	public void turn() {
		
	}
	
	///////////////////////////////////////////
	//Method to determine if a player has won//
	///////////////////////////////////////////
	public boolean hasWon(Player p) {
		boolean truth = false;
		
		//Checks vertical
		if(checkVert(cOne) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cTwo) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cThree) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cFour) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cFive) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cSix) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cSeven) == true) {
			truth = true;
			return truth;
		}
		
		//Checks horizontal
		if(checkHori(0) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(1) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(2) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(3) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(4) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(5) == true) {
			truth = true;
			return truth;
		}
		
		return truth;
	}
	
	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public boolean checkVert(int[] a) {//TODO Add player number to check for (ie. 1 or 2)
		boolean truth = false;
		if(a[0] == a[1] && a[0] == a[2] && a[0] == a[3]) {
			truth = true;
			return truth;
		}
		if(a[1] == a[2] && a[1] == a[3] && a[1] == a[4]) {
			truth = true;
			return truth;
		}
		if(a[2] == a[3] && a[2] == a[4] && a[2] == a[5]) {
			truth = true;
			return truth;
		}
		return truth;
	}
	
	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public boolean checkHori(int i) {//TODO Add player number to check for (ie. 1 or 2)
		boolean truth = false;
		if(cOne[i] == cTwo[i] && cOne[i] == cThree[i] && cOne[i] == cFour[i]) {
			truth = true;
			return truth;
		}
		if(cTwo[i] == cThree[i] && cTwo[i] == cFour[i] && cOne[i] == cFive[i]) {
			truth = true;
			return truth;
		}
		if(cThree[i] == cFour[i] && cThree[i] == cFive[i] && cThree[i] == cSix[i]) {
			truth = true;
			return truth;
		}
		if(cFour[i] == cFive[i] && cFour[i] == cSix[i] && cFour[i] == cSeven[i]) {
			truth = true;
			return truth;
		}
		return truth;

	}
}
