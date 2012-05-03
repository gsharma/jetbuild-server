package com.jetbuild.social.blob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jetbuild.social.util.MongoUtil;
import com.mongodb.DB;
import com.mongodb.Mongo;

@Component("blob-dao")
@Profile("mongo")
public class BlobDAOImpl implements BlobDAO {
    private static final Logger logger = LoggerFactory.getLogger(BlobDAOImpl.class);
    @Autowired
    private MongoUtil mongoUtil;
    private Mongo mongo;
    private DB db;
}
