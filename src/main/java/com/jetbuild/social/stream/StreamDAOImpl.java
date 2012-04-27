package com.jetbuild.social.stream;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.jetbuild.social.model.Account;
import com.jetbuild.social.model.Comment;
import com.jetbuild.social.util.MongoUtil;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

@Repository("stream-dao")
@Profile("mongo")
public class StreamDAOImpl implements StreamDAO {
    private static final Logger logger = LoggerFactory.getLogger(StreamDAOImpl.class);
    @Autowired
    private MongoUtil mongoUtil;
    private Mongo mongo;
    private DB db;
    private DBCollection commentsCollection;
    private DBCollection threadsCollection;
    private DBCollection accountsCollection;

    @PostConstruct
    public void init() {
        mongo = mongoUtil.getMongo();
        db = mongo.getDB("jetbuild");
        commentsCollection = db.getCollection("Comments");
        threadsCollection = db.getCollection("Threads");
        accountsCollection = db.getCollection("Accounts");
    }

    private static enum Field {
        COMMENT("comment"), EMAIL("email"), FIRST_NAME("firstName"), LAST_NAME("lastName"), MENTIONS("mentions"), PASSWORD(
                "password"), REPLY_TO_USER("replyToUser"), REPLIES("replies"), TAGS("tags"), TID("_tid"), TMSTP("tmstp"), UID(
                "_uid"), USERNAME("username");
        private String field;

        private Field(String field) {
            this.field = field;
        }

        String getField() {
            return field;
        }
    }

    @Override
    public Comment createComment(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Comment createReply(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> retrieveCommentsByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> retrieveInboxByAccount(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> retrieveMentionsByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Comment> retrieveThreadById(String threadId) {
        // TODO Auto-generated method stub
        return null;
    }
}
