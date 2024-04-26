package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultBlack {
    // Black Figures:

    //    Pawns
    @Bean
    @Qualifier("Black pawn1")
    public ChessPieceImp blackPawn1() {
        return new ChessPieceImp(Cell.cell('A', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn2")
    public ChessPieceImp blackPawn2() {
        return new ChessPieceImp(Cell.cell('B', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn3")
    public ChessPieceImp blackPawn3() {
        return new ChessPieceImp(Cell.cell('C', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn4")
    public ChessPieceImp blackPawn4() {
        return new ChessPieceImp(Cell.cell('D', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn5")
    public ChessPieceImp blackPawn5() {
        return new ChessPieceImp(Cell.cell('E', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn6")
    public ChessPieceImp blackPawn6() {
        return new ChessPieceImp(Cell.cell('F', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn7")
    public ChessPieceImp blackPawn7() {
        return new ChessPieceImp(Cell.cell('G', 7), 'P');
    }

    @Bean
    @Qualifier("Black pawn8")
    public ChessPieceImp blackPawn8() {
        return new ChessPieceImp(Cell.cell('H', 7), 'P');
    }

    //    Rooks
    @Bean
    @Qualifier("Black rook1")
    public ChessPieceImp blackRook1() {
        return new ChessPieceImp(Cell.cell('A', 8), 'R');
    }

    @Bean
    @Qualifier("Black rook2")
    public ChessPieceImp blackRook2() {
        return new ChessPieceImp(Cell.cell('H', 8), 'R');
    }

    //    Knights
    @Bean
    @Qualifier("Black Knight1")
    public ChessPieceImp blackKnight1() {
        return new ChessPieceImp(Cell.cell('B', 8), 'N');
    }

    @Bean
    @Qualifier("Black Knight2")
    public ChessPieceImp blackKnight2() {
        return new ChessPieceImp(Cell.cell('G', 8), 'N');
    }

    //    Bishops
    @Bean
    @Qualifier("Black bishop1")
    public ChessPieceImp blackBishop1() {
        return new ChessPieceImp(Cell.cell('C', 8), 'B');
    }

    @Bean
    @Qualifier("Black bishop2")
    public ChessPieceImp blackBishop2() {
        return new ChessPieceImp(Cell.cell('F', 8), 'B');
    }

    //    Queen
    @Bean
    @Qualifier("Black queen")
    public ChessPieceImp blackQueen() {
        return new ChessPieceImp(Cell.cell('D', 8), 'Q');
    }

    //    King
    @Bean
    @Qualifier("Black king")
    public ChessPieceImp blackKing() {
        return new ChessPieceImp(Cell.cell('E', 8), 'K');
    }
}
