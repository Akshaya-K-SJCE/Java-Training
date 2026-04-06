package chatApp.service;



import chatApp.model.User;

public class SMSNotification extends NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("SMS notification sent to " + user.getName() + ": " + message);
    }
}