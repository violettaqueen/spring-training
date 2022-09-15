package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService { //business logic

    private final CommentRepository dbCommentRepository;  //? created a variable
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository dbCommentRepository,@Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.dbCommentRepository = dbCommentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in database + send email
        dbCommentRepository.storeComment(comment); // created method to store comment
        commentNotificationProxy.sendComment(comment);

    }
}
