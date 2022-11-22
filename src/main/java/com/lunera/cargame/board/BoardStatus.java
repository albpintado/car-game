package com.lunera.cargame.board;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;

public class BoardStatus {
    @JsonProperty
    private Point position;

    public BoardStatus() {
    }

    public BoardStatus(@JsonProperty("position") Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
