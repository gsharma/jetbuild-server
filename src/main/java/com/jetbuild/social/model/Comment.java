package com.jetbuild.social.model;

import java.util.Date;
import java.util.List;

public class Comment {
    private String id;
    private String threadId;
    private String username;
    private String replyTo;
    private String comment;
    private List<String> tags;
    private Date timestamp;
    private int depth;

    // only for injection
    public Comment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Comment [id=").append(id).append(", threadId=").append(threadId).append(", username=")
                .append(username).append(", replyTo=").append(replyTo).append(", comment=").append(comment)
                .append(", tags=").append(tags).append(", timestamp=").append(timestamp).append(", depth=")
                .append(depth).append("]");
        return builder.toString();
    }
}
