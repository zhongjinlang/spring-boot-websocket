package com.zhongjinlang.websocketdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@Slf4j
public class DeviceMsgService {

    @Autowired
    private WebSocket webSocket;

    // 模拟设备发送的消息
    @Scheduled(cron = "0/1 * * * * ?")
    public void send(){
        webSocket.sendMessage("模拟设备消息" + System.currentTimeMillis());
    }
}
