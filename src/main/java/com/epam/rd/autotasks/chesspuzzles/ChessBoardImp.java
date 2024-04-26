package com.epam.rd.autotasks.chesspuzzles;

public class ChessBoardImp implements ChessBoard {
    private String chessBoard;

    public ChessBoardImp(String chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public String state() {
        return chessBoard;
    }

}

