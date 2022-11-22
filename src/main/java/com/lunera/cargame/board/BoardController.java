package com.lunera.cargame.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {

    @Autowired
    private BoardService service;

    @MessageMapping("/movement")
    @SendTo("/board/move")
    public BoardStatus moveCar(@Payload Movement movement) throws Exception {
        Thread.sleep(1000);
        return this.service.moveCar(movement);
    }
}
