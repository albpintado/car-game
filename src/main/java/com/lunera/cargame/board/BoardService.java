package com.lunera.cargame.board;

import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class BoardService {
    public BoardStatus moveCar(Movement movement) {
        return new BoardStatus(new Point(0, 1));
    }
}
