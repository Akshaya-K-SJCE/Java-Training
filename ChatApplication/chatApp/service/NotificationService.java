package chatApp.service;

//package chatapp.service;

import chatApp.model.User;

public abstract class NotificationService {
    public abstract void sendNotification(User user, String message);
}
