package piece;
import main.GamePanel;

public class Rook extends Piece{
    public Rook(int color, int col, int row) {
        super(color, col, row);
        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-rook");
        } else {
            image= getImage("/piece/b-rook");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {
        if (isWithinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false) {
            // Rook can move any number of directions in col and row
            if (targetCol == preCol || targetRow == preRow) {
                if (isValidSquare(targetCol, targetRow)) {
                    if (pieceIsOnStraightLine(targetCol, targetRow)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
