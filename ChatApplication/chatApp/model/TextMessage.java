package chatApp.model;

public class TextMessage extends Message {
    private String text;

    public TextMessage(int messageId, User sender, String text) {
        super(messageId, sender);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void displayMessage() {
        System.out.println("[Text] " + getSender().getName() + ": " + text);
    }
}