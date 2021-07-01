package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {

    String messageText;
    String username;
    Integer messageId;


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

    public Integer getMessageId() { return messageId; }

    public void setMessageId(Integer messageId) { this.messageId = messageId; }

}
