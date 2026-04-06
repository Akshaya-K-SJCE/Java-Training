package chatApp.model;



import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private int roomId;
    private String roomName;
    private List<User> users;
    private List<Message> messages;

    public ChatRoom(int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public int getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " joined " + roomName);
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void showAllMessages() {
        System.out.println("\nMessages in Chat Room: " + roomName);
        for (Message msg : messages) {
            msg.displayMessage();
        }
    }
}