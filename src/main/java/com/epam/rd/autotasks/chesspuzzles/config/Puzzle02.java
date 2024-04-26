package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Puzzle02 {
    @Bean
    @Qualifier("White Queen")
    public ChessPiece whiteQueen() {
        return new ChessPieceImp(Cell.cell('H', 8), 'q');
    }

    @Bean
    @Qualifier("Black Queen")
    public ChessPiece blackQueen() {
        return new ChessPieceImp(Cell.cell('F', 4), 'Q');
    }

    @Bean
    @Qualifier("Black King")
    public ChessPiece whiteBlack() {
        return new ChessPieceImp(Cell.cell('D', 3), 'K');
    }

    @Bean
    @Qualifier("White King")
    public ChessPiece whiteKing() {
        return new ChessPieceImp(Cell.cell('B', 2), 'k');
    }

    @Bean
    @Qualifier("Black Pawn")
    public ChessPiece blackPawn() {
        return new ChessPieceImp(Cell.cell('E', 2), 'P');
    }

}
