package com.jetbuild.social.stream;

import com.jetbuild.social.model.Account;
import com.jetbuild.social.model.Comment;
import java.util.List;

public interface StreamService {
    public List<Comment> getComments(String username);

    public List<Comment> getInbox(Account account);

    public List<Comment> getMentions(String username);

    public List<Comment> getThread(String threadId);

    public void postNewComment(Comment comment);

    public void replyToComment(Comment comment);
}
