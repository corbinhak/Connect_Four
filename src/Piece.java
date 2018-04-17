import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Piece {
    // Creates the piece
    public static void piece(Circle c, int playerid, String p1Color, String p2Color) {
        // Set the fill of the circle
        if (playerid == 1) {
            c.setFill(Color.web(p1Color));
            c.setStroke(Color.web(p1Color));
            c.setStrokeWidth(3);
        } else if (playerid == 2) {
            c.setFill(Color.web(p2Color));
            c.setStroke(Color.web(p2Color));
            c.setStrokeWidth(3);
        }
    }
}

