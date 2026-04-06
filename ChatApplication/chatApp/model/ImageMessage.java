package chatApp.model;

public class ImageMessage extends Message {
    private String imagePath;

    public ImageMessage(int messageId, User sender, String imagePath) {
        super(messageId, sender);
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void displayMessage() {
        System.out.println("[Image] " + getSender().getName() + " sent image: " + imagePath);
    }
}