package chatApp.service;


import chatApp.model.User;

public class EmailNotification extends NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Email notification sent to " + user.getEmail() + ": " + message);
    }
}