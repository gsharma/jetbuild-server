package com.jetbuild.social.stream;

import java.util.List;

import com.jetbuild.social.model.Account;
import com.jetbuild.social.model.Comment;

// Stream CRUD ops
public interface StreamDAO {
    public Comment createComment(Comment comment);

    public Comment createReply(Comment comment);

    public List<Comment> retrieveCommentsByUsername(String username);

    public List<Comment> retrieveInboxByAccount(Account account);

    public List<Comment> retrieveMentionsByUsername(String username);

    public List<Comment> retrieveThreadById(String threadId);
}
