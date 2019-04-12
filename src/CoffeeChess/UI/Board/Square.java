package CoffeeChess.UI.Board;

import CoffeeChess.Model.Piece.Piece;
import CoffeeChess.Model.Piece.Position;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
    private static final int size = Board.SQUARE_SIZE;

    private Piece piece;

    public Square(boolean light, Position pos) {

        setWidth(size);
        setHeight(size);
        setFill(light ? Color.WHITE : Color.LIGHTGOLDENRODYELLOW);
        relocate(pos.getColumn() * size, pos.getRow() * size);
    }

    public boolean hasPiece() {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece() {
        this.piece = piece;
    }
}