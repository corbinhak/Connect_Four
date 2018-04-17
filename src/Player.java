public class Player extends Board {

	private String name;
	private int id;

	//////////////////////
	//Player constructor//
	//////////////////////
	Player(String name, int playerNum){
		this.name = name;
		this.id = playerNum;
	}

	public static boolean tie() {
		boolean truth = true;
		for(int i = 0; i <= 5; i++) {
			if(cOne[i] == 0) {
				truth = false;
			}
			if(cTwo[i] == 0) {
				truth = false;
			}
			if(cThree[i] == 0) {
				truth = false;
			}
			if(cFour[i] == 0) {
				truth = false;
			}
			if(cFive[i] == 0) {
				truth = false;
			}
			if(cSix[i] == 0) {
				truth = false;
			}
			if(cSeven[i] == 0) {
				truth = false;
			}
		}
		return truth;
	}

	///////////////////////////////////////////
	//Method to determine if a player has won//
	///////////////////////////////////////////
	public static boolean hasWon(int i) {
		boolean truth = false;

		//Checks vertical
		if(checkVert(cOne, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cTwo, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cThree, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cFour, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cFive, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cSix, i) == true) {
			truth = true;
			return truth;
		}
		if(checkVert(cSeven, i) == true) {
			truth = true;
			return truth;
		}

		//Checks horizontal
		if(checkHori(0, i) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(1, i) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(2, i) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(3, i) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(4, i) == true) {
			truth = true;
			return truth;
		}
		if(checkHori(5, i) == true) {
			truth = true;
			return truth;
		}
		//Checks diagonal
		if(checkDiag(i) == true) {
			truth = true;
			return truth;
		}

		return truth;
	}

	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public static boolean checkVert(int[] a, int id) {
		boolean truth = false;
		if(a[0] == id && a[0] == a[1] && a[0] == a[2] && a[0] == a[3]) {
			truth = true;
			return truth;
		}
		if(a[1] == id && a[1] == a[2] && a[1] == a[3] && a[1] == a[4]) {
			truth = true;
			return truth;
		}
		if(a[2] == id && a[2] == a[3] && a[2] == a[4] && a[2] == a[5]) {
			truth = true;
			return truth;
		}
		return truth;
	}

	//////////////////////////////////////////////////////////
	//Method to check if there are four in a row in a column//
	//////////////////////////////////////////////////////////
	public static boolean checkHori(int i, int id) {
		boolean truth = false;
		if(cOne[i] == id && cOne[i] == cTwo[i] && cOne[i] == cThree[i] && cOne[i] == cFour[i]) {
			truth = true;
			return truth;
		}
		if(cTwo[i] == id && cTwo[i] == cThree[i] && cTwo[i] == cFour[i] && cOne[i] == cFive[i]) {
			truth = true;
			return truth;
		}
		if(cThree[i] == id && cThree[i] == cFour[i] && cThree[i] == cFive[i] && cThree[i] == cSix[i]) {
			truth = true;
			return truth;
		}
		if(cFour[i] == id && cFour[i] == cFive[i] && cFour[i] == cSix[i] && cFour[i] == cSeven[i]) {
			truth = true;
			return truth;
		}
		return truth;

	}

	public static boolean checkDiag(int id){
		boolean truth = false;
		//////////////////////////////////////////////////////////
		///Diagonal starting in column one (going to the right)//
		//////////////////////////////////////////////////////////
		if(cOne[0] == id && cOne[0] == cTwo[1] && cOne[0] == cThree[2] && cOne[0] == cFour[3] ) {
			truth = true;
			return truth;
		}
		if(cOne[1] == id && cOne[1] == cTwo[2] && cOne[1] == cThree[3] && cOne[1] == cFour[4] ) {
			truth = true;
			return truth;
		}
		if(cOne[2] == id && cOne[2] == cTwo[3] && cOne[2] == cThree[4] && cOne[2] == cFour[5] ) {
			truth = true;
			return truth;
		}
		if(cOne[3] == id && cOne[3] == cTwo[2] && cOne[3] == cThree[1] && cOne[3] == cFour[4] ) {
			truth = true;
			return truth;
		}
		if(cOne[4] == id && cOne[4] == cTwo[3] && cOne[4] == cThree[2] && cOne[4] == cFour[1] ) {
			truth = true;
			return truth;
		}
		if(cOne[5] == id && cOne[5] == cTwo[4] && cOne[5] == cThree[3] && cOne[5] == cFour[2] ) {
			truth = true;
			return truth;
		}
		//////////////////////////////////////////////////////////
		///Diagonal starting in column two (going to the right)///
		//////////////////////////////////////////////////////////
		if(cTwo[0] == id && cTwo[0] == cThree[1] && cTwo[0] == cFour[2] && cTwo[0] == cFive[3] ) {
			truth = true;
			return truth;
		}
		if(cTwo[1] == id && cTwo[1] == cThree[2] && cTwo[1] == cFour[3] && cTwo[1] == cFive[4] ) {
			truth = true;
			return truth;
		}
		if(cTwo[2] == id && cTwo[2] == cThree[3] && cTwo[2] == cFour[4] && cTwo[2] == cFive[5] ) {
			truth = true;
			return truth;
		}
		if(cTwo[3] == id && cTwo[3] == cThree[2] && cTwo[3] == cFour[1] && cTwo[3] == cFive[0] ) {
			truth = true;
			return truth;
		}
		if(cTwo[4] == id && cTwo[4] == cThree[3] && cTwo[4] == cFour[2] && cTwo[4] == cFive[1] ) {
			truth = true;
			return truth;
		}
		if(cTwo[5] == id && cTwo[5] == cThree[4] && cTwo[5] == cFour[3] && cTwo[5] == cFive[2] ) {
			truth = true;
			return truth;
		}
		////////////////////////////////////////////////////////////
		///Diagonal starting in column three (going to the right)///
		////////////////////////////////////////////////////////////
		if(cThree[0] == id && cThree[0] == cFour[1] && cThree[0] == cFive[2] && cThree[0] == cSix[3] ) {
			truth = true;
			return truth;
		}
		if(cThree[1] == id && cThree[1] == cFour[2] && cThree[1] == cFive[3] && cThree[1] == cSix[4] ) {
			truth = true;
			return truth;
		}
		if(cThree[2] == id && cThree[2] == cFour[3] && cThree[2] == cFive[4] && cThree[2] == cSix[5] ) {
			truth = true;
			return truth;
		}
		if(cThree[3] == id && cThree[3] == cFour[2] && cThree[3] == cFive[1] && cThree[3] == cSix[0] ) {
			truth = true;
			return truth;
		}
		if(cThree[4] == id && cThree[4] == cFour[3] && cThree[4] == cFive[2] && cThree[4] == cSix[1] ) {
			truth = true;
			return truth;
		}
		if(cThree[5] == id && cThree[5] == cFour[4] && cThree[5] == cFive[3] && cThree[5] == cSix[2] ) {
			truth = true;
			return truth;
		}
		///////////////////////////////////////////////////////////
		///Diagonal starting in column four (going to the right)///
		///////////////////////////////////////////////////////////
		if(cFour[0] == id && cFour[0] == cFive[1] && cFour[0] == cSix[2] && cFour[0] == cSeven[3] ) {
			truth = true;
			return truth;
		}
		if(cFour[1] == id && cFour[1] == cFive[2] && cFour[1] == cSix[3] && cFour[1] == cSeven[4] ) {
			truth = true;
			return truth;
		}
		if(cFour[2] == id && cFour[2] == cFive[3] && cFour[2] == cSix[4] && cFour[2] == cSeven[5] ) {
			truth = true;
			return truth;
		}
		if(cFour[3] == id && cFour[3] == cFive[2] && cFour[3] == cSix[1] && cFour[3] == cSeven[0] ) {
			truth = true;
			return truth;
		}
		if(cFour[4] == id && cFour[4] == cFive[3] && cFour[4] == cSix[2] && cFour[4] == cSeven[1] ) {
			truth = true;
			return truth;
		}
		if(cFour[5] == id && cFour[5] == cFive[4] && cFour[5] == cSix[3] && cFour[5] == cSeven[2] ) {
			truth = true;
			return truth;
		}
		return truth;
	}

}

