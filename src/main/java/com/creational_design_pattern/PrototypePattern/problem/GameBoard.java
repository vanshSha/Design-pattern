package com.creational_design_pattern.PrototypePattern.problem;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
// ConcretePrototype
public class GameBoard implements Prototype<GameBoard> {

    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public List<GamePiece> getPiece() {
        return pieces;
    }

    public void showBoardState() {
        System.out.println("Current Board State");
        for (GamePiece piece : pieces) {
            System.out.println(piece);
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for (GamePiece piece : pieces) {
            newBoard.addPiece(piece.clone()); // I am cloning each piece separately
        }
        return newBoard;
    }
}