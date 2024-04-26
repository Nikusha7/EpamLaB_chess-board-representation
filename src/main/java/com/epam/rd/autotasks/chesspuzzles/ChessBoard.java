package com.epam.rd.autotasks.chesspuzzles;

import java.util.Collection;

public interface ChessBoard {
    static ChessBoard of(Collection<ChessPiece> pieces) {

        String boardState;
        StringBuilder sb = new StringBuilder();

        for (int i = 8; i >= 1; i--) {

            for (char j = 'A'; j <= 'H'; j++) {
                char figure = ' ';
                for (ChessPiece chessPiece1 : pieces) {

                    if (chessPiece1.getCell().letter == j && chessPiece1.getCell().number == i) {
                        figure = chessPiece1.toChar();
                    }

                }
                if (figure == ' ') {
                    sb.append('.');
                } else {
                    sb.append(figure);
                }
            }

            if (i != 1) {

                sb.append("\n");
            }
        }

        boardState = sb.toString();
        System.out.println("Represented Board State: \n" + boardState);

        return new ChessBoardImp(boardState);

    }

    String state();
}
