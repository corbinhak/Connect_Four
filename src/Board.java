import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.input.MouseEvent;

public class Board extends Application {
	// Integer arrays for referencing columns (1-7)
	protected int[] cOne = new int[6];
	protected int[] cTwo = new int[6];
	protected int[] cThree = new int[6];
	protected int[] cFour = new int[6];
	protected int[] cFive = new int[6];
	protected int[] cSix = new int[6];
	protected int[] cSeven = new int[6];
	
	protected int pTurn = 1;

	// Getter methods for each column array
	public int[] getCOne() {
		return cOne;// Column One
	}

	public int[] getCTwo() {
		return cTwo;// Column Two
	}

	public int[] getCThree() {
		return cThree;// Column Three
	}

	public int[] getCFour() {
		return cFour;// Column Four
	}

	public int[] getCFive() {
		return cFive;// Column Five
	}

	public int[] getCSix() {
		return cSix;// Column Six
	}

	public int[] getCSeven() {
		return cSeven;// Column Seven
	}

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

		// Create Text
		Text turn = new Text(5, 864, name1 + "'s Turn");
		turn.setFill(Color.rgb(0, 0, 50));
		turn.setFont(new Font(50));

		// Create Circles for dropping
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
		c1.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c1.setFill(Color.TRANSPARENT);
					c1.setStroke(Color.TRANSPARENT);
				});

		c2.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c2.setFill(Color.TRANSPARENT);
					c2.setStroke(Color.TRANSPARENT);
				});

		c3.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c3.setFill(Color.TRANSPARENT);
					c3.setStroke(Color.TRANSPARENT);
				});

		c4.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c4.setFill(Color.TRANSPARENT);
					c4.setStroke(Color.TRANSPARENT);
				});

		c5.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c5.setFill(Color.TRANSPARENT);
					c5.setStroke(Color.TRANSPARENT);
				});

		c6.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c6.setFill(Color.TRANSPARENT);
					c6.setStroke(Color.TRANSPARENT);
				});

		c7.addEventHandler(MouseEvent.MOUSE_EXITED, 
				e -> { 
					c7.setFill(Color.TRANSPARENT);
					c7.setStroke(Color.TRANSPARENT);
				});

		// Event handler for placing circle. It checks the array for the value that is
		// empty(in descending order).It works off of on action clicked, for that
		// specific
		EventHandler<MouseEvent> cirClick1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cOne[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 0, i + 1);
						changePlayerTurn(i, cir, cOne, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c1.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick1);

		EventHandler<MouseEvent> cirClick2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cTwo[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 1, i + 1);
						changePlayerTurn(i, cir, cTwo, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c2.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick2);

		EventHandler<MouseEvent> cirClick3 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cThree[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 2, i + 1);
						changePlayerTurn(i, cir, cThree, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c3.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick3);

		EventHandler<MouseEvent> cirClick4 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cFour[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 3, i + 1);
						changePlayerTurn(i, cir, cFour, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c4.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick4);

		EventHandler<MouseEvent> cirClick5 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cFive[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 4, i + 1);
						changePlayerTurn(i, cir, cFive, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c5.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick5);

		EventHandler<MouseEvent> cirClick6 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cSix[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 5, i + 1);
						changePlayerTurn(i, cir, cSix, turn, name2, name1);
						i = -1;
					}
				}
			}
		};

		c6.addEventFilter(MouseEvent.MOUSE_CLICKED, cirClick6);

		EventHandler<MouseEvent> cirClick7 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 5; i >= 0; i--) {
					if (cSeven[i] == 0) {
						Circle cir = new Circle(0, 0, 50);
						cir.setStrokeWidth(3);
						grid.add(cir, 6, i + 1);
						changePlayerTurn(i, cir, cSeven, turn, name2, name1);
						i = -1;
					}
				}
			}
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

	private void setOnHoverColor(Circle c3) {
		c3.addEventHandler(MouseEvent.MOUSE_ENTERED,
				e -> {
					if (pTurn == 1) {
						c3.setFill(Color.RED);
						c3.setStroke(Color.RED);
					}
					else if (pTurn == 2) {
						c3.setFill(Color.BLACK);
						c3.setStroke(Color.BLACK);
					}
				});
	}

	private void changePlayerTurn(int i, Circle cir, int[] cSeven, Text turn, String name2, String name1) {
		if (pTurn == 1) {
			cir.setFill(Color.RED);
			cir.setStroke(Color.RED);
			pTurn = 2;
			cSeven[i] = 1;
			turn.setText(name2 + "'s Turn");
		}
		else if (pTurn == 2) {
			cir.setFill(Color.BLACK);
			cir.setStroke(Color.BLACK);
			pTurn = 1;
			cSeven[i] = 2;
			turn.setText(name1 + "'s Turn");
		}
	}

}
