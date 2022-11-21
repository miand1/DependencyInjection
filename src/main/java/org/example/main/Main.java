package org.example.main;

import org.example.QualifierConfig.ProjectConfig;
import org.example.models.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        Comment comment = new Comment("miand", "nice!");
        commentService.publishComment(comment);
        //System.out.println("Hello world!");
    }
}