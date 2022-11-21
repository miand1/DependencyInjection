package org.example.proxies;

import org.example.models.Comment;
import org.springframework.stereotype.Component;


public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending E-mail notification for: "+ comment.getText());
    }
}
