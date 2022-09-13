package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);  // this method - need to get the comment and send it
}
