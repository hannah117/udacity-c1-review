package com.udacity.jwdnd.c1.review.model;

import org.springframework.context.annotation.Bean;


public class ChatForm {

    String messageType;
    String messageText;
    String username;


    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
