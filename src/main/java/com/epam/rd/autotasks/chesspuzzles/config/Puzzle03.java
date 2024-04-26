package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Puzzle03 {

    @Bean
    @Qualifier("White Pawn1")
    public ChessPiece whitePawn1() {
        return new ChessPieceImp(Cell.cell('H', 8), 'r');
    }

    @Bean
    @Qualifier("Black pawn1")
    public ChessPiece blackPawn1() {
        return new ChessPieceImp(Cell.cell('B', 7), 'P');
    }

    @Bean
    @Qualifier("Black Queen")
    public ChessPiece blackQueen() {
        return new ChessPieceImp(Cell.cell('D', 7), 'Q');
    }

    @Bean
    @Qualifier("Black pawn2")
    public ChessPiece blackPawn2() {
        return new ChessPieceImp(Cell.cell('E', 7), 'P');
    }

    @Bean
    @Qualifier("white rook")
    public ChessPiece whiteRook() {
        return new ChessPieceImp(Cell.cell('F', 7), 'r');
    }

    @Bean
    @Qualifier("Black pawn3")
    public ChessPiece blackPawn3() {
        return new ChessPieceImp(Cell.cell('A', 6), 'P');
    }

    @Bean
    @Qualifier("Black Pawn4")
    public ChessPiece blackPawn4() {
        return new ChessPieceImp(Cell.cell('D', 6), 'P');
    }

    @Bean
    @Qualifier("Black Pawn5")
    public ChessPiece blackPawn5() {
        return new ChessPieceImp(Cell.cell('G', 6), 'P');
    }

    @Bean
    @Qualifier("White pawn2")
    public ChessPiece whitePawn2() {
        return new ChessPieceImp(Cell.cell('D', 5), 'p');
    }

    @Bean
    @Qualifier("Black King")
    public ChessPiece blackKing() {
        return new ChessPieceImp(Cell.cell('G', 5), 'K');
    }

    @Bean
    @Qualifier("Black Bishop1")
    public ChessPiece blackBishop1() {
        return new ChessPieceImp(Cell.cell('B', 4), 'B');
    }

    @Bean
    @Qualifier("Black Rook1")
    public ChessPiece blackRook1() {
        return new ChessPieceImp(Cell.cell('C', 3), 'R');
    }

    @Bean
    @Qualifier("White pawn3")
    public ChessPiece whitePawn3() {
        return new ChessPieceImp(Cell.cell('G', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn4")
    public ChessPiece whitePawn4() {
        return new ChessPieceImp(Cell.cell('H', 2), 'p');
    }

    @Bean
    @Qualifier("Black Rook")
    public ChessPiece blackRook2() {
        return new ChessPieceImp(Cell.cell('C', 1), 'R');
    }

    @Bean
    @Qualifier("black bishop2")
    public ChessPiece blackBishop2() {
        return new ChessPieceImp(Cell.cell('D', 1), 'b');
    }

    @Bean
    @Qualifier("White King")
    public ChessPiece whiteKing() {
        return new ChessPieceImp(Cell.cell('H', 1), 'k');
    }
}
