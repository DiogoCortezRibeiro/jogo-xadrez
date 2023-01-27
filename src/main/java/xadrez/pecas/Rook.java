package xadrez.pecas;

import tabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
