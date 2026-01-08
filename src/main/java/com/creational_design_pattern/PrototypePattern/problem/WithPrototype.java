package com.creational_design_pattern.PrototypePattern.problem;

public class WithPrototype {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 12));
        gameBoard.addPiece(new GamePiece("Blue", 15));
        gameBoard.showBoardState();

        GameBoard copiedBoard = gameBoard.clone();
        System.out.println("Copied Board");
        copiedBoard.showBoardState();


    }
}
