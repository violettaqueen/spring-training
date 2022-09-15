package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.config.DBConfigData;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService { //business logic

    private final CommentRepository dbCommentRepository;  //? created a variable
    private final CommentNotificationProxy commentNotificationProxy;
    private final AppConfigData appConfigData;
    private final DBConfigData dbConfigData;

    public CommentService(CommentRepository dbCommentRepository, @Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData, DBConfigData dbConfigData) {
        this.dbCommentRepository = dbCommentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment(Comment comment) {
        //save in database + send email
        dbCommentRepository.storeComment(comment); // created method to store comment
        commentNotificationProxy.sendComment(comment);

    }

    public void printConfigData() {
        System.out.println(appConfigData.getUserName());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());
    }

    public void printDbConfigData(){
        System.out.println(dbConfigData.getUserName());
        System.out.println(dbConfigData.getPassword());
        System.out.println(dbConfigData.getType());
    }
}
