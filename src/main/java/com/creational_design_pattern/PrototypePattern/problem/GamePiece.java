package com.creational_design_pattern.PrototypePattern.problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

// ConcretePrototype
public class GamePiece implements Prototype<GamePiece> {

    private String color;

    private int position;


    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }
}
