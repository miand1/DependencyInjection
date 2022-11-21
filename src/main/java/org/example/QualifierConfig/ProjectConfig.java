package org.example.QualifierConfig;

import org.example.proxies.CommentNotificationProxy;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.proxies.PushNotificatationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    public CommentNotificationProxy emailNotification(){
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        return commentNotificationProxy;
    }
    @Bean
    public CommentNotificationProxy pushNotification(){
        CommentNotificationProxy commentNotificationProxy = new PushNotificatationProxy();
        return commentNotificationProxy;
    }

    @Bean
    public CommentRepository commentRepository(){
        return new DBCommentRepository();
    }

   /* @Bean
    public CommentService commentService(@Qualifier("pushNotification") CommentNotificationProxy c,
                                         CommentRepository commentRepository){
        CommentService commentService = new CommentService();
        commentService.setCommentNotificationProxy(c);
        commentService.setCommentRepository(commentRepository);
        return commentService;
    }*/

}