package com.jetbuild.social.account;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jetbuild.social.model.Account;
import com.jetbuild.social.util.MongoUtil;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

@Component("account-dao")
@Profile("mongo")
public class AccountDAOImpl implements AccountDAO {
    private static final Logger logger = LoggerFactory.getLogger(AccountDAOImpl.class);
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
    public Account createAccount(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account retrieveAccountById(String accountId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account retrieveAccountByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Account> retrieveAllAccountsByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account updateAccount(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAccount(Account account) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteAccountById(String accountId) {
        // TODO Auto-generated method stub
    }
}
