import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Piece {
	
    // Create generic circle
    Circle c;

    // Creates the piece
    public static void piece(Circle c, int playerid) {
        // Set the fill of the circle
        if (playerid == 1) {
            c.setFill(Color.RED);
            c.setStroke(Color.RED);
            c.setStrokeWidth(3);
        } else if (playerid == 2) {
            c.setFill(Color.BLACK);
            c.setStroke(Color.BLACK);
            c.setStrokeWidth(3);
        }
    }
}

