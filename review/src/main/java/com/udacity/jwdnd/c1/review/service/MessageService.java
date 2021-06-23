package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {


   List<ChatMessage> messages;

   @PostConstruct
   public void postConstruct() {

       this.messages = new ArrayList<>();
   }

   public void addMessage(ChatForm chatForm){

       ChatMessage newMessage = new ChatMessage();
       newMessage.setUsername(chatForm.getUsername());
       switch(chatForm.getMessageType()) {
           case("Say"):
               newMessage.setMessageText(chatForm.getMessageText());
               break;
           case("Shout"):
               newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
               break;
           case("Whisper"):
               newMessage.setMessageText(chatForm.getMessageText().toLowerCase());
               break;
       }

       messages.add(newMessage);
   }

   public List<ChatMessage> getMessages() {
       return messages;
   }


}
