package com.hack.big6.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by Administrator on 2018/6/2.
 */
@ClientEndpoint
@Component
public class WSClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(WSClient.class.getName());

    private Session session;

    public WSClient() {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer(); // 获取WebSocket连接器，其中具体实现可以参照websocket-api.jar的源码,Class.forName("org.apache.tomcat.websocket.WsWebSocketContainer");
            String uri = "ws://localhost:9090/websocket";
            Session session = container.connectToServer(this, new URI(uri)); // 连接会话
            this.session = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session session) {
        LOGGER.info("Connected to endpoint: {}", session.getBasicRemote());
    }

    @OnMessage
    public void onMessage(String message) {
        LOGGER.info(message);
    }

    @OnError
    public void onError(Throwable t) {
        LOGGER.error(t.getMessage());
    }

    public void sendMsg(byte[] bytes) {
        try {
            this.session.getBasicRemote().sendText(new String(bytes, "utf-8"));
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
