package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Puzzle01 {

    @Bean
    @Qualifier("Black rook")
    public ChessPiece blackRook() {
        return new ChessPieceImp(Cell.cell('E', 8), 'R');
    }

    @Bean
    @Qualifier("white king")
    public ChessPiece whiteKing() {
        return new ChessPieceImp(Cell.cell('B', 7), 'k');
    }

    @Bean
    @Qualifier("White knight")
    public ChessPiece whiteKnight() {
        return new ChessPieceImp(Cell.cell('C', 6), 'n');
    }

    @Bean
    @Qualifier("Black Bishop1")
    public ChessPiece blackBishop1() {
        return new ChessPieceImp(Cell.cell('D', 6), 'B');
    }

    @Bean
    @Qualifier("Black Pawn1")
    public ChessPiece blackPawn1() {
        return new ChessPieceImp(Cell.cell('F', 6), 'P');
    }

    @Bean
    @Qualifier("Black King")
    public ChessPiece blackKing() {
        return new ChessPieceImp(Cell.cell('C', 5), 'K');
    }

    @Bean
    @Qualifier("Black Bishop")
    public ChessPiece blackBishop2() {
        return new ChessPieceImp(Cell.cell('D', 5), 'B');
    }

    @Bean
    @Qualifier("Black Pawn2")
    public ChessPiece blackPawn2() {
        return new ChessPieceImp(Cell.cell('C', 3), 'P');
    }

    @Bean
    @Qualifier("White Pawn1")
    public ChessPiece whitePawn() {
        return new ChessPieceImp(Cell.cell('D', 2), 'p');
    }

    @Bean
    @Qualifier("White bishop")
    public ChessPiece whiteBishop() {
        return new ChessPieceImp(Cell.cell('E', 2), 'b');
    }


}
