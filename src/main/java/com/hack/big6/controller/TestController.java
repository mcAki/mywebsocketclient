package com.hack.big6.controller;

import com.hack.big6.client.WSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2018/6/2.
 */
@RestController
public class TestController {

    @Autowired
    private WSClient wsClient;

    @RequestMapping(value = "/test")
    public void test() {
        try {
            wsClient.sendMsg("test something".getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
