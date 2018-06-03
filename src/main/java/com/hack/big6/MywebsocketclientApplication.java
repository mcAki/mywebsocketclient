package com.hack.big6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@SpringBootApplication
@EnableWebSocket
public class MywebsocketclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebsocketclientApplication.class, args);
    }

}
