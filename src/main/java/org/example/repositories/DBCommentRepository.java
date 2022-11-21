package org.example.repositories;

import org.example.models.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment "+ comment.getText() + " in DB.");
    }
}
