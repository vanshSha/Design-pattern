package com.behavioural_design_pattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

// client
public class MediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        ChatUser rahul = new ChatUser("Rahul", chatRoom);
        ChatUser amit = new ChatUser("Amit", chatRoom);
        ChatUser neha = new ChatUser("Neha", chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        rahul.sendMessage("Helll");


    }
}

//Mediator - Declares communication methods
interface ChatMediator {

    void sendMessage(String msg, ChatUser user);

    void addUser(ChatUser user);
}


// Concrete Mediator
class ChatRoom implements ChatMediator {

    private List<ChatUser> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, ChatUser sender) {
            for(ChatUser user : users){
                if(user!=sender) {
                    user.receiveMessage(msg, sender);
                }
            }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}

// Concrete Colleague
// Chat System
class ChatUser {

    private String name;

    private ChatMediator chatMediator;


    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg) {
        System.out.println(this.name + " sending msg to the ");
        chatMediator.sendMessage(msg, this);  // imp
        // msg - what message to send
        // this - who message is sending
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String msg, ChatUser sender){
        System.out.println(this.name + " received message : " + msg + " from " + sender.getName());
    }
}
