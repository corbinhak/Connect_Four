import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;

public class Board extends Application {
	
	public static void main(String[] args) {
		
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
				grid.add(circle, j, i);
			}
		}
		
		//Create the Pane
		Pane pane = new Pane(grid);	
			
		//Create Scene, Set title, Add scene, do not allow resizing, Make scene visible
		Scene scene = new Scene(pane, 788, 672, Color.rgb(40, 117, 223));
		primaryStage.setTitle("Connect Four");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
}
