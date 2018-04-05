import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Piece {
    //Variables
    String playerid;
    int row;
    int col;

    //Create generic circle
    Circle c;

    //Creates the piece
    public Piece(int row, int col, String playerid) {
        //Create generic circle
        c = new Circle();
        c.setRadius(50);

        //Set the fill of the circle
        if (playerid.equals("1")) {
            c.setFill(Color.BLACK);
        }
        else if (playerid.equals("2")) {
            c.setFill(Color.RED);
        }
    }

}

