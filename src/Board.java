import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Board extends Application {
	// Integer arrays for referencing columns (1-7)
	protected static int[] cOne = new int[6];
	protected static int[] cTwo = new int[6];
	protected static int[] cThree = new int[6];
	protected static int[] cFour = new int[6];
	protected static int[] cFive = new int[6];
	protected static int[] cSix = new int[6];
	protected static int[] cSeven = new int[6];

	//Create ArrayList of Colors
	protected static ArrayList<String> colors = new ArrayList<String>(6);

	protected static String p1Color = "";
	protected static String p2Color = "";

	//Create player turn
	protected int pTurn = 1;

	//Launches args
	public static void main(String[] args) {

		launch(args);

	}

	// Primary Stage
	public void start(Stage primaryStage) {
		// Create Grid
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(2));
		grid.setHgap(15);
		grid.setVgap(15);

		// Create grid of circles
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				Circle circle = new Circle();
				circle.setRadius(50);
				circle.setFill(Color.rgb(34, 103, 207));
				circle.setStroke(Color.rgb(23, 73, 146));
				circle.setStrokeWidth(3);
				grid.add(circle, j, i + 1);
			}
		}

		// Get information for turn text
		String name1 = ConnectFour.getName1();
		String name2 = ConnectFour.getName2();

		//Fill color ArrayList
		colors.add("#FF0000");
		colors.add("#FF00FF");
		colors.add("BLACK");
		colors.add("#008000");
		colors.add("#FFD700");
		colors.add("#D2691E");

		//Random number for getting color for p1 and p2
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		p1Color = colors.get(randomNum);
		colors.remove(randomNum);
		randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);
		p2Color = colors.get(randomNum);

		// Create Text
		Text turn = new Text(5, 864, name1 + "'s Turn");
		turn.setFill(Color.rgb(0, 0, 50));
		turn.setFont(new Font(50));

		// Create Circles for dropping and makes them transparent
		Circle c1 = new Circle(0, 0, 50);
		c1.setFill(Color.TRANSPARENT);
		c1.setStroke(Color.TRANSPARENT);
		c1.setStrokeWidth(3);

		Circle c2 = new Circle(0, 0, 50);
		c2.setFill(Color.TRANSPARENT);
		c2.setStroke(Color.TRANSPARENT);
		c2.setStrokeWidth(3);

		Circle c3 = new Circle(0, 0, 50);
		c3.setFill(Color.TRANSPARENT);
		c3.setStroke(Color.TRANSPARENT);
		c3.setStrokeWidth(3);

		Circle c4 = new Circle(0, 0, 50);
		c4.setFill(Color.TRANSPARENT);
		c4.setStroke(Color.TRANSPARENT);
		c4.setStrokeWidth(3);

		Circle c5 = new Circle(0, 0, 50);
		c5.setFill(Color.TRANSPARENT);
		c5.setStroke(Color.TRANSPARENT);
		c5.setStrokeWidth(3);

		Circle c6 = new Circle(0, 0, 50);
		c6.setFill(Color.TRANSPARENT);
		c6.setStroke(Color.TRANSPARENT);
		c6.setStrokeWidth(3);

		Circle c7 = new Circle(0, 0, 50);
		c7.setFill(Color.TRANSPARENT);
		c7.setStroke(Color.TRANSPARENT);
		c7.setStrokeWidth(3);

		// On hover event
		setOnHoverColor(c1);

		setOnHoverColor(c2);

		setOnHoverColor(c3);

		setOnHoverColor(c4);

		setOnHoverColor(c5);

		setOnHoverColor(c6);

		setOnHoverColor(c7);

		// When no longer hovering
		setNoHoverColor(c1);

		setNoHoverColor(c2);

		setNoHoverColor(c3);

		setNoHoverColor(c4);

		setNoHoverColor(c5);

		setNoHoverColor(c6);

		setNoHoverColor(c7);

		// Event handler for placing circles. It checks the array for the value that is
		// empty(in descending order).
		EventHandler<MouseEvent> cirClick1 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cOne[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 0, i + 1);
					changePlayerTurn(i, cir, cOne, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c1.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick1);

		EventHandler<MouseEvent> cirClick2 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cTwo[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 1, i + 1);
					changePlayerTurn(i, cir, cTwo, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);

		};

		c2.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick2);

		EventHandler<MouseEvent> cirClick3 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cThree[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 2, i + 1);
					changePlayerTurn(i, cir, cThree, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c3.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick3);

		EventHandler<MouseEvent> cirClick4 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cFour[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 3, i + 1);
					changePlayerTurn(i, cir, cFour, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c4.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick4);

		EventHandler<MouseEvent> cirClick5 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cFive[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 4, i + 1);
					changePlayerTurn(i, cir, cFive, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c5.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick5);

		EventHandler<MouseEvent> cirClick6 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cSix[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 5, i + 1);
					changePlayerTurn(i, cir, cSix, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c6.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick6);

		EventHandler<MouseEvent> cirClick7 = e -> {
			for (int i = 5; i >= 0; i--) {
				if (cSeven[i] == 0) {
					Circle cir = new Circle(0, 0, 50);
					grid.add(cir, 6, i + 1);
					changePlayerTurn(i, cir, cSeven, turn, name2, name1);
					i = -1;
				}
			}
			checkWin(turn, name1, name2);
			checkTie(turn);
		};

		c7.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick7);

		// Create the Pane
		Pane pane = new Pane(grid);

		// Add text
		pane.getChildren().add(turn);

		// Add circles for dropping to pane
		grid.add(c1, 0, 0);
		grid.add(c2, 1, 0);
		grid.add(c3, 2, 0);
		grid.add(c4, 3, 0);
		grid.add(c5, 4, 0);
		grid.add(c6, 5, 0);
		grid.add(c7, 6, 0);

		// Create Scene, Set title, Add scene, do not allow resizing, Make scene visible
		Scene scene = new Scene(pane, 803, 874, Color.rgb(40, 117, 223));
		primaryStage.setTitle("Connect Four");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	//Will display the circle on it being hovered over
	private void setOnHoverColor(Circle circle) {
		circle.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
			if (pTurn == 1) {
				circle.setFill(Color.web(p1Color));
				circle.setStroke(Color.web(p1Color));
			} else if (pTurn == 2) {
				circle.setFill(Color.web(p2Color));
				circle.setStroke(Color.web(p2Color));
			}
		});
	}

	//Will remove the color of the circle upon not being hovered over
	private void setNoHoverColor(Circle circle) {
		circle.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
			circle.setFill(Color.TRANSPARENT);
			circle.setStroke(Color.TRANSPARENT);
		});
	}

	//Changes the player's turn, and sets color of piece being placed on board
	private void changePlayerTurn(int i, Circle cir, int[] cGen, Text turn, String name2, String name1) {
		Piece.piece(cir, pTurn, p1Color, p2Color);
		if (pTurn == 1) {
			cGen[i] = 1;
			pTurn = 2;
			turn.setText(name2 + "'s Turn");
		} else if (pTurn == 2) {
			cGen[i] = 2;
			pTurn = 1;
			turn.setText(name1 + "'s Turn");
		}
	}

	//Checks to see if the player has won
	private void checkWin(Text turn, String name1, String name2) {
		if (Player.hasWon(1)) {
			turn.setText(name1 + " Has Won!");
		} else if (Player.hasWon(2)) {
			turn.setText(name2 + " Has Won!");
		}
	}
	//Check to see if none of the players won.
	private void checkTie(Text turn) {
		if(Player.tie() == true) {
			turn.setText("ITS A TIE");
		}
	}
}

