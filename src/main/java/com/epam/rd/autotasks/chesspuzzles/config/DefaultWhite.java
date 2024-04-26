package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultWhite {
    //    White Figures:

    //    Pawns
    @Bean
    @Qualifier("White pawn1")
    public ChessPieceImp whitePawn1() {
        return new ChessPieceImp(Cell.cell('A', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn2")
    public ChessPieceImp whitePawn2() {
        return new ChessPieceImp(Cell.cell('B', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn3")
    public ChessPieceImp whitePawn3() {
        return new ChessPieceImp(Cell.cell('C', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn4")
    public ChessPieceImp whitePawn4() {
        return new ChessPieceImp(Cell.cell('D', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn5")
    public ChessPieceImp whitePawn5() {
        return new ChessPieceImp(Cell.cell('E', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn6")
    public ChessPieceImp whitePawn6() {
        return new ChessPieceImp(Cell.cell('F', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn7")
    public ChessPieceImp whitePawn7() {
        return new ChessPieceImp(Cell.cell('G', 2), 'p');
    }

    @Bean
    @Qualifier("White pawn8")
    public ChessPieceImp whitePawn8() {
        return new ChessPieceImp(Cell.cell('H', 2), 'p');
    }

    //    Rooks
    @Bean
    @Qualifier("White rook1")
    public ChessPieceImp whiteRook1() {
        return new ChessPieceImp(Cell.cell('A', 1), 'r');
    }

    @Bean
    @Qualifier("White rook2")
    public ChessPieceImp whiteRook2() {
        return new ChessPieceImp(Cell.cell('H', 1), 'r');
    }

    //    Knights
    @Bean
    @Qualifier("White Knight1")
    public ChessPieceImp whiteKnight1() {
        return new ChessPieceImp(Cell.cell('B', 1), 'n');
    }

    @Bean
    @Qualifier("White Knight2")
    public ChessPieceImp whiteKnight2() {
        return new ChessPieceImp(Cell.cell('G', 1), 'n');
    }

    //    Bishops
    @Bean
    @Qualifier("White bishop1")
    public ChessPieceImp whiteBishop1() {
        return new ChessPieceImp(Cell.cell('C', 1), 'b');
    }

    @Bean
    @Qualifier("White bishop2")
    public ChessPieceImp whiteBishop2() {
        return new ChessPieceImp(Cell.cell('F', 1), 'b');
    }

    //    Queen
    @Bean
    @Qualifier("White queen")
    public ChessPieceImp whiteQueen() {
        return new ChessPieceImp(Cell.cell('D', 1), 'q');
    }

    //    King
    @Bean
    @Qualifier("White king")
    public ChessPieceImp whiteKing() {
        return new ChessPieceImp(Cell.cell('E', 1), 'k');
    }
}
