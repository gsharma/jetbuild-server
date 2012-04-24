package com.jetbuild.social.stream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jetbuild.social.model.Account;
import com.jetbuild.social.model.Comment;

@Component("stream-service")
public class StreamServiceImpl implements StreamService {
    @Autowired
    private StreamDAO streamDAO;

    @Override
    public List<Comment> getComments(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> getInbox(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> getMentions(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> getThread(String threadId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void postNewComment(Comment comment) {
        // TODO Auto-generated method stub

    }

    @Override
    public void replyToComment(Comment comment) {
        // TODO Auto-generated method stub

    }
}
