package com.lunera.cargame.board;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movement {
    @JsonProperty
    private Directions movement;

    public Movement() {
    }

    public Movement(@JsonProperty("movement") Directions movement) {
        this.movement = movement;
    }

    public Directions getMovement() {
        return movement;
    }

    public void setMovement(Directions movement) {
        this.movement = movement;
    }
}
