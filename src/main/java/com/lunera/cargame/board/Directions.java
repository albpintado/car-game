package com.lunera.cargame.board;

public enum Directions {
    UP("UP"),
    RIGHT("RIGHT"),
    DOWN("DOWN"),
    LEFT("LEFT");

    private final String movement;

    Directions(final String movement) {
        this.movement = movement;
    }

    public String getMovement() {
        return this.movement;
    }
}
