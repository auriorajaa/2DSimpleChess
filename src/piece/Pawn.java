package piece;

import main.GamePanel;

public class Pawn extends Piece {

    public Pawn(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.WHITE) {
            image = getImage("/res/piece/w-pawn");
        } else {
            image = getImage("/res/piece/b-pawn");
        }
    }

}
