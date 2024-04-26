package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Default {

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
//    @Bean
//    public ChessBoard chessBoard() {
//        String filePath = "src/test/resources/boards/Default.txt";
//
//        ChessBoardImp chessBoard = new ChessBoardImp();
//
//        char letter;
//        int number;
//        char symbol;
//        String line = "";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            StringBuilder stringBuilder = new StringBuilder();
//
//            for (int i = 8; i >= 1; i--) {
//
//                if ((line = br.readLine()) != null) {
//
//                    stringBuilder.append(line).append("\n");
//                    int index = 0;
//                    for (char j = 'A'; j <= 'H'; j++) {
//                        letter = j;
//                        number = i;
//                        symbol = line.charAt(index);
//                        index++;
//                        System.out.println("Bean of " + symbol + " must be created with this cell letter and number: " + letter + ", " + number);
//                        createPiece(Cell.cell(letter, number), symbol);
//                    }
//
//                }
//
//            }
//
//            line = stringBuilder.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        chessBoard.setChessBoard(line);
//
//        return chessBoard;
//    }
//
//
//    public ChessPiece createPiece(Cell cell, char piece) {
//        switch (piece) {
//            case '.':
//                emptyCell().setCell(cell);
//                return emptyCell();
//            case 'R':
//                rook().setSymbol(piece);
//                rook().setCell(cell);
//                return rook();
//            case 'N':
//                knight().setSymbol(piece);
//                knight().setCell(cell);
//                return knight();
//            case 'B':
//                bishop().setSymbol(piece);
//                bishop().setCell(cell);
//                return bishop();
//            case 'Q':
//                queen().setSymbol(piece);
//                queen().setCell(cell);
//                return queen();
//            case 'K':
//                king().setSymbol(piece);
//                king().setCell(cell);
//                return king();
//            case 'P':
//                pawn().setSymbol(piece);
//                pawn().setCell(cell);
//                return pawn();
//            case 'r':  // lowercase represents white pieces
//                rook().setSymbol(piece);
//                rook().setCell(cell);
//                return rook();
//            case 'n':
//                knight().setSymbol(piece);
//                knight().setCell(cell);
//                return knight();
//            case 'b':
//                bishop().setSymbol(piece);
//                bishop().setCell(cell);
//                return bishop();
//            case 'q':
//                queen().setSymbol(piece);
//                queen().setCell(cell);
//                return queen();
//            case 'k':
//                king().setSymbol(piece);
//                king().setCell(cell);
//                return king();
//            case 'p':
//                pawn().setSymbol(piece);
//                pawn().setCell(cell);
//                return pawn();
//            default:
//                return null;
//        }
//    }


}
