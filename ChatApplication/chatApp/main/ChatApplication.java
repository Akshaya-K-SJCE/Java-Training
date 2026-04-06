package chatApp.main;



import chatApp.exception.InvalidMessageException;
import chatApp.exception.InvalidUserException;
import chatApp.manager.ChatManager;
import chatApp.model.*;
import chatApp.service.EmailNotification;

public class ChatApplication {
    public static void main(String[] args) {
        try {
            ChatManager manager = new ChatManager(new EmailNotification());

            User user1 = manager.createUser(1, "Akshaya", "akshaya@gmail.com");
            User user2 = manager.createUser(2, "Mithul", "mithul@gmail.com");

            ChatRoom room = new ChatRoom(101, "Java Group");

            room.addUser(user1);
            room.addUser(user2);

            Message m1 = manager.createTextMessage(1, user1, "Hello everyone!");
            Message m2 = manager.createImageMessage(2, user2, "profile.png");

            manager.sendMessage(room, m1);
            manager.sendMessage(room, m2);

            room.showAllMessages();

        } catch (InvalidUserException | InvalidMessageException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}