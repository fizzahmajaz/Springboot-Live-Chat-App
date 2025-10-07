package com.fizzahmajaz.livechat.handler;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fizzahmajaz.livechat.entity.ChatMessage;

@Component
public class ChatMessageHandler extends TextWebSocketHandler{

    private final Set<WebSocketSession> sessions  = new CopyOnWriteArraySet<>();
    private final ObjectMapper objectMapper = new ObjectMapper();


    // Connect
    @Override
    public void afterConnectionEstablished(WebSocketSession session){
        sessions.add(session);
        System.out.println("User Connected: " + session.getId());

    }

    // Message
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)throws Exception{
        ChatMessage chatMessage = objectMapper.readValue(message.getPayload(), ChatMessage.class);
        String json = objectMapper.writeValueAsString(chatMessage);

        //broadcast

        for(WebSocketSession s : sessions){
            s.sendMessage(new TextMessage(json));
        }

    }


    //Close
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status){
        sessions.remove(session);
        System.out.println("User disconnected: " + session.getId());
    }





    


    
}
