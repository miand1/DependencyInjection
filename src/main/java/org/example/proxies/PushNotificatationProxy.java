package org.example.proxies;

import org.example.models.Comment;

public class PushNotificatationProxy implements  CommentNotificationProxy
{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for: "+comment.getText());
    }
}
