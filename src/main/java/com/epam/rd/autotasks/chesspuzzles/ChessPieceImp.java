package com.epam.rd.autotasks.chesspuzzles;

public class ChessPieceImp implements ChessPiece {
    private Cell cell;
    private char symbol;

    public ChessPieceImp(Cell cell, char symbol) {
        this.cell = cell;
        this.symbol = symbol;
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public char toChar() {
        return symbol;
    }

    @Override
    public String toString() {
        return "ChessPieceImp{" +
                "cell=" + cell +
                ", symbol=" + symbol +
                '}';
    }
}