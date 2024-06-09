package piece;
import main.GamePanel;

public class Knight extends Piece{
    public Knight(int color, int col, int row) {
        super(color, col, row);
        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-knight");
        } else {
            image= getImage("/piece/b-knight");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {
        if (isWithinBoard(targetCol, targetRow)) {
            // Knight can move 1:2 or 2:1 of col and rwo
            if (Math.abs(targetCol-preCol) * Math.abs(targetRow-preRow) == 2) {
                if (isValidSquare(targetCol, targetRow)) {
                    return true;
                }
            }
        }
        return false;
    }

}

