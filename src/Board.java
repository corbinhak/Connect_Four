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
	//Integer arrays for referencing columns (1-7)
	protected int[] cOne = new int[6];
	protected int[] cTwo = new int[6];
	protected int[] cThree = new int[6];
	protected int[] cFour = new int[6];
	protected int[] cFive = new int[6];
	protected int[] cSix = new int[6];
	protected int[] cSeven = new int[6];
	
	p1.getName;

	//Getter methods for each column array
	public int[] getCOne() {
		return cOne;//Column One
	}
	public int[] getCTwo() {
		return cTwo;//Column Two
	}
	public int[] getCThree() {
		return cThree;//Column Three
	}
	public int[] getCFour() {
		return cFour;//Column Four
	}
	public int[] getCFive() {
		return cFive;//Column Five
	}
	public int[] getCSix() {
		return cSix;//Column Six
	}
	public int[] getCSeven() {
		return cSeven;//Column Seven
	}
	
	public static void launchApp(String[] args) {

		launch(args);

	}

	//Primary Stage
	public void start(Stage primaryStage) {
		//Create Grid
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(2));
		grid.setHgap(15);
		grid.setVgap(15);

		//Create grid of circles
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				Circle circle = new Circle();
				circle.setRadius(50);
				circle.setFill(Color.rgb(34, 103, 207));
				circle.setStroke(Color.rgb(23, 73, 146));
				circle.setStrokeWidth(3);
				grid.add(circle, j, i+1);
			}
		}

		//Create Circles for dropping
		Circle c1 = new Circle(53, 53, 50);
		c1.setFill(Color.TRANSPARENT);
		c1.setStroke(Color.TRANSPARENT);

		Circle c2 = new Circle(103, 53, 50);
		c2.setFill(Color.TRANSPARENT);
		c2.setStroke(Color.TRANSPARENT);

		Circle c3 = new Circle(153, 53, 50);
		c3.setFill(Color.TRANSPARENT);
		c3.setStroke(Color.TRANSPARENT);

		Circle c4 = new Circle(203, 53, 50);
		c4.setFill(Color.TRANSPARENT);
		c4.setStroke(Color.TRANSPARENT);

		Circle c5 = new Circle(253, 53, 50);
		c5.setFill(Color.TRANSPARENT);
		c5.setStroke(Color.TRANSPARENT);

		Circle c6 = new Circle(303, 53, 50);
		c6.setFill(Color.TRANSPARENT);
		c6.setStroke(Color.TRANSPARENT);

		Circle c7 = new Circle(353, 53, 50);
		c7.setFill(Color.TRANSPARENT);
		c7.setStroke(Color.TRANSPARENT);

		//On hover event
		c1.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c1.setFill(Color.YELLOW);
					}
				});

		c2.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c2.setFill(Color.YELLOW);
					}
				});

		c3.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c3.setFill(Color.YELLOW);
					}
				});

		c4.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c4.setFill(Color.YELLOW);
					}
				});

		c5.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c5.setFill(Color.YELLOW);
					}
				});

		c6.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c6.setFill(Color.YELLOW);
					}
				});

		c7.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c7.setFill(Color.YELLOW);
					}
				});

		//When no longer hovering
		c1.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c1.setFill(Color.TRANSPARENT);
					}
				});

		c2.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c2.setFill(Color.TRANSPARENT);
					}
				});

		c3.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c3.setFill(Color.TRANSPARENT);
					}
				});

		c4.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c4.setFill(Color.TRANSPARENT);
					}
				});

		c5.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c5.setFill(Color.TRANSPARENT);
					}
				});

		c6.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c6.setFill(Color.TRANSPARENT);
					}
				});

		c7.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						c7.setFill(Color.TRANSPARENT);
					}
				});

		//Create Text
		Text turn = new Text(5, 864, "Player 1 Turn");
		turn.setFill(Color.rgb(0, 0, 50));
		turn.setFont(new Font(50));

		//Create the Pane
		Pane pane = new Pane(grid);

		//Add text
		pane.getChildren().add(turn);

		//Add circles for dropping to pane
		grid.add(c1, 0, 0);
		grid.add(c2, 1, 0);
		grid.add(c3, 2, 0);
		grid.add(c4, 3, 0);
		grid.add(c5, 4, 0);
		grid.add(c6, 5, 0);
		grid.add(c7, 6, 0);

		//Create Scene, Set title, Add scene, do not allow resizing, Make scene visible
		Scene scene = new Scene(pane, 803, 874, Color.rgb(40, 117, 223));
		primaryStage.setTitle("Connect Four");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}

