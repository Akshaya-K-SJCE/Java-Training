package chatApp.model;



public abstract class Message {
    private int messageId;
    private User sender;

    public Message(int messageId, User sender) {
        this.messageId = messageId;
        this.sender = sender;
    }

    public int getMessageId() {
        return messageId;
    }

    public User getSender() {
        return sender;
    }

    public abstract void displayMessage();
}