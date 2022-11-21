package org.example.services;

import org.example.models.Comment;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;



//    public CommentService(CommentRepository commentRepository, CommentNotificationProxy pushNotification) {
//        System.out.println("Creating Service");
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = pushNotification;
//    }
public CommentService(CommentRepository commentRepository, @Qualifier("pushNotification") CommentNotificationProxy notificationProxy) {
    System.out.println("Creating Service");
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = notificationProxy;
}



    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
