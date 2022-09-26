package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);  // this method - need to get the comment and send it
}
//what is bean? object, can we create an object from Interface? no
//no @Component in interface