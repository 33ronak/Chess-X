package piece;
import main.Board;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
    public BufferedImage image;
    public int x, y;
    public int col, row, preCol, preRow;
    public int color;

    public Piece(int color, int col, int row) {
        this.color = color;
        this.col = col;
        this.row = row;

        x = getX(col);
        y = getY(row);

        preCol = col;
        preRow = row;
    }

    public BufferedImage getImage(String imagePatch) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePatch + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }


    public int getX(int col) {
        return col * Board.SQUARE_SIZE;
    }
    public int getY(int row) {
        return row * Board.SQUARE_SIZE;
    }
    public int getCol(int x) {
        return (x + Board.HALF_SQUARE_SIZE)/Board.SQUARE_SIZE;
    }
    public int getRow(int y) {
        return (y + Board.HALF_SQUARE_SIZE)/Board.SQUARE_SIZE;
    }

    public void updatePosition() {
        this.x = getX(col);
        this.y = getY(row);
        this.preCol = getCol(x);
        this.preRow = getRow(y);
    }
    public void resetPosition() {
        this.col = preCol;
        this.row= preRow;
        this.x = getX(col);
        this.y = getY(row);
    }



    public boolean isWithinBoard(int targetCol, int targetRow) {
        if (targetCol >= 0 && targetCol <= 7 && targetRow >= 0 && targetRow <= 7) {
            return true;
        }

        return false;
    }

    public boolean canMove(int targetCol, int targetRow) {
        return false;
    }


    public void draw(Graphics2D g2) {
        g2.drawImage(image, x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE, null);
    }

}
