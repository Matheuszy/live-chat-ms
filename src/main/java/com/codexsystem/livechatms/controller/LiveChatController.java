package com.codexsystem.livechatms.controller;

import com.codexsystem.livechatms.domain.ChatInput;
import com.codexsystem.livechatms.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LiveChatController {

    @MessageMapping("/new-message")
    @SendTo("/topic/livechat")
    public ChatOutput newMessage(ChatInput chatInput) {
        return new ChatOutput(HtmlUtils.htmlEscape(chatInput.userName()) + ": " + HtmlUtils.htmlEscape(chatInput.message()));
    }
}
