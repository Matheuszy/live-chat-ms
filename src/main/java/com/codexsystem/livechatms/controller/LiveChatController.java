package com.codexsystem.livechatms.controller;

import com.codexsystem.livechatms.domain.ChatInput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LiveChatController {

    @MessageMapping("/new-message")
    public ChatInput newMessage(ChatInput chatInput) {
        return chatInput;
    }
}
