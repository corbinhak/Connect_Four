public class Player extends Board {

	private String name;
	private int id;

	//////////////////////
	//Player constructor//
	//////////////////////
	Player(String name, int playerNum) {
		this.name = name;
		this.id = playerNum;
	}

	//////////////////////////
	//Get player name and ID//
	//////////////////////////
	public String getName() {
		return this.name;
	}

	public int getID(int playerNum) {
		return this.id;
	}

	@Override
	public String toString() {
		return String.format("Player %d: %s's Turn");
	}


	///////////////////////////////////////////
	//Method to determine if a player has won//
	///////////////////////////////////////////
	public static boolean hasWon(int i) {
		//Checks vertical
		if (checkVert(cOne, i)) {
			return true;
		}
		if (checkVert(cTwo, i)) {
			return true;
		}
		if (checkVert(cThree, i)) {
			return true;
		}
		if (checkVert(cFour, i)) {
			return true;
		}
		if (checkVert(cFive, i)) {
			return true;
		}
		if (checkVert(cSix, i)) {
			return true;
		}
		if (checkVert(cSeven, i)) {
			return true;
		}

		//Checks horizontal
		if (checkHori(0, i)) {
			return true;
		}
		if (checkHori(1, i)) {
			return true;
		}
		if (checkHori(2, i)) {
			return true;
		}
		if (checkHori(3, i)) {
			return true;
		}
		if (checkHori(4, i)) {
			return true;
		}
		if (checkHori(5, i)) {
			return true;
		}
		//Checks diagonal
		if (checkDiag(i)) {
			return true;
		}

		return false;
	}

	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public static boolean checkVert(int[] a, int id) {
		if (a[0] == id && a[0] == a[1] && a[0] == a[2] && a[0] == a[3]) {
			return true;
		}
		if (a[1] == id && a[1] == a[2] && a[1] == a[3] && a[1] == a[4]) {
			return true;
		}
		if (a[2] == id && a[2] == a[3] && a[2] == a[4] && a[2] == a[5]) {
			return true;
		}
		return false;
	}

	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public static boolean checkHori(int i, int id) {
		if (cOne[i] == id && cOne[i] == cTwo[i] && cOne[i] == cThree[i] && cOne[i] == cFour[i]) {
			return true;
		}
		if (cTwo[i] == id && cTwo[i] == cThree[i] && cTwo[i] == cFour[i] && cOne[i] == cFive[i]) {
			return true;
		}
		if (cThree[i] == id && cThree[i] == cFour[i] && cThree[i] == cFive[i] && cThree[i] == cSix[i]) {
			return true;
		}
		if (cFour[i] == id && cFour[i] == cFive[i] && cFour[i] == cSix[i] && cFour[i] == cSeven[i]) {
			return true;
		}
		return false;

	}

	public static boolean checkDiag(int id) {
		//////////////////////////////////////////////////////////
		///Diagonal starting in column one (going to the right)//
		//////////////////////////////////////////////////////////
		if (cOne[0] == id && cOne[0] == cTwo[1] && cOne[0] == cThree[2] && cOne[0] == cFour[3]) {
			return true;
		}
		if (cOne[1] == id && cOne[1] == cTwo[2] && cOne[1] == cThree[3] && cOne[1] == cFour[4]) {
			return true;
		}
		if (cOne[2] == id && cOne[2] == cTwo[3] && cOne[2] == cThree[4] && cOne[2] == cFour[5]) {
			return true;
		}
		if (cOne[3] == id && cOne[3] == cTwo[2] && cOne[3] == cThree[1] && cOne[3] == cFour[4]) {
			return true;
		}
		if (cOne[4] == id && cOne[4] == cTwo[3] && cOne[4] == cThree[2] && cOne[4] == cFour[1]) {
			return true;
		}
		if (cOne[5] == id && cOne[5] == cTwo[4] && cOne[5] == cThree[3] && cOne[5] == cFour[2]) {
			return true;
		}
		//////////////////////////////////////////////////////////
		///Diagonal starting in column two (going to the right)///
		//////////////////////////////////////////////////////////
		if (cTwo[0] == id && cTwo[0] == cThree[1] && cTwo[0] == cFour[2] && cTwo[0] == cFive[3]) {
			if (cTwo[1] == id && cTwo[1] == cThree[2] && cTwo[1] == cFour[3] && cTwo[1] == cFive[4]) {
				return true;
			}
			if (cTwo[2] == id && cTwo[2] == cThree[3] && cTwo[2] == cFour[4] && cTwo[2] == cFive[5]) {
				return true;
			}
			if (cTwo[3] == id && cTwo[3] == cThree[2] && cTwo[3] == cFour[1] && cTwo[3] == cFive[0]) {
				return true;
			}
			if (cTwo[4] == id && cTwo[4] == cThree[3] && cTwo[4] == cFour[2] && cTwo[4] == cFive[1]) {
				return true;
			}
			if (cTwo[5] == id && cTwo[5] == cThree[4] && cTwo[5] == cFour[3] && cTwo[5] == cFive[2]) {
				return true;
			}
			////////////////////////////////////////////////////////////
			///Diagonal starting in column three (going to the right)///
			////////////////////////////////////////////////////////////
			if (cThree[0] == id && cThree[0] == cFour[1] && cThree[0] == cFive[2] && cThree[0] == cSix[3]) {
				return true;
			}
			if (cThree[1] == id && cThree[1] == cFour[2] && cThree[1] == cFive[3] && cThree[1] == cSix[4]) {
				return true;
			}
			if (cThree[2] == id && cThree[2] == cFour[3] && cThree[2] == cFive[4] && cThree[2] == cSix[5]) {
				return true;
			}
			if (cThree[3] == id && cThree[3] == cFour[2] && cThree[3] == cFive[1] && cThree[3] == cSix[0]) {
				return true;
			}
			if (cThree[4] == id && cThree[4] == cFour[3] && cThree[4] == cFive[2] && cThree[4] == cSix[1]) {
				return true;
			}
			if (cThree[5] == id && cThree[5] == cFour[4] && cThree[5] == cFive[3] && cThree[5] == cSix[2]) {
				return true;
			}
			///////////////////////////////////////////////////////////
			///Diagonal starting in column four (going to the right)///
			///////////////////////////////////////////////////////////
			if (cFour[0] == id && cFour[0] == cFive[1] && cFour[0] == cSix[2] && cFour[0] == cSeven[3]) {
				return true;
			}
			if (cFour[1] == id && cFour[1] == cFive[2] && cFour[1] == cSix[3] && cFour[1] == cSeven[4]) {
				return true;
			}
			if (cFour[2] == id && cFour[2] == cFive[3] && cFour[2] == cSix[4] && cFour[2] == cSeven[5]) {
				return true;
			}
			if (cFour[3] == id && cFour[3] == cFive[2] && cFour[3] == cSix[1] && cFour[3] == cSeven[0]) {
				return true;
			}
			if (cFour[4] == id && cFour[4] == cFive[3] && cFour[4] == cSix[2] && cFour[4] == cSeven[1]) {
				return true;
			}
			if (cFour[5] == id && cFour[5] == cFive[4] && cFour[5] == cSix[3] && cFour[5] == cSeven[2]) {
				return true;
			}
		}
		return false;
	}
}