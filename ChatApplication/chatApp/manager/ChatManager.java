package chatApp.manager;



import chatApp.exception.InvalidMessageException;
import chatApp.exception.InvalidUserException;
import chatApp.model.*;
import chatApp.service.NotificationService;
import chatApp.util.Validator;

public class ChatManager {
    private NotificationService notificationService;

    public ChatManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public User createUser(int id, String name, String email) throws InvalidUserException {
        if (!Validator.isValidName(name) || !Validator.isValidEmail(email)) {
            throw new InvalidUserException("Invalid user details!");
        }
        return new User(id, name, email);
    }

    public TextMessage createTextMessage(int id, User sender, String text) throws InvalidMessageException {
        if (!Validator.isValidText(text)) {
            throw new InvalidMessageException("Text message cannot be empty!");
        }
        return new TextMessage(id, sender, text);
    }

    public ImageMessage createImageMessage(int id, User sender, String imagePath) throws InvalidMessageException {
        if (!Validator.isValidImagePath(imagePath)) {
            throw new InvalidMessageException("Invalid image path!");
        }
        return new ImageMessage(id, sender, imagePath);
    }

    public void sendMessage(ChatRoom room, Message message) {
        room.addMessage(message);
        notificationService.sendNotification(message.getSender(), "Your message was sent successfully.");
    }
}
