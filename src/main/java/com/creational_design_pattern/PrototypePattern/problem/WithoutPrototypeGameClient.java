package com.creational_design_pattern.PrototypePattern.problem;

public class WithoutPrototypeGameClient {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 12));
        gameBoard.addPiece(new GamePiece("Blue", 15));


        gameBoard.showBoardState();

        // CheckPoint this State
        GameBoard copiedBoarded = new GameBoard();
        for(GamePiece piece : gameBoard.getPiece()){
            copiedBoarded.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }

        System.out.println("Copied Board");
        copiedBoarded.showBoardState();
    }
}
