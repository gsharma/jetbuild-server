package com.jetbuild.social.util;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoOptions;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component("mongo")
@Profile("mongo")
public class MongoUtil {
    @Value("${mongo.db.name}")
    private String dbName;
    @Value("${mongo.db.user}")
    private String user;
    @Value("${mongo.db.password}")
    private String password;
    @Resource(name = "mongo.db.hosts")
    private List<String> serverAddresses = new ArrayList<String>();
    private Mongo mongo;
    private MongoOptions mongoOptions;

    @PostConstruct
    public void init() throws Exception {
        createMongo();
    }

    public Mongo getMongo() {
        return mongo;
    }

    private Mongo createMongo() throws Exception {
        if (serverAddresses.size() > 0) {
            if (mongoOptions != null) {
                mongoOptions.safe = true;
                mongo = new Mongo(toSeeds(serverAddresses), mongoOptions);
            } else {
                mongoOptions.safe = true;
                mongo = new Mongo(toSeeds(serverAddresses), mongoOptions);
            }
        } else {
            mongo = new Mongo();
        }
        DB db = mongo.getDB(dbName);
        if (StringUtils.hasText(user)) {
            db.authenticate(user, password.toCharArray());
        }
        return mongo;
    }

    @PreDestroy
    public void destroy() {
        if (mongo != null) {
            mongo.close();
        }
    }

    private static List<ServerAddress> toSeeds(List<String> serverAddresses) {
        List<ServerAddress> replicaSetSeeds = new ArrayList<ServerAddress>(serverAddresses.size());
        try {
            for (String addr : serverAddresses) {
                String[] a = addr.split(":");
                String host = a[0];
                if (a.length > 2) {
                    throw new IllegalArgumentException("Invalid Server Address : " + addr);
                } else if (a.length == 2) {
                    replicaSetSeeds.add(new ServerAddress(host, Integer.parseInt(a[1])));
                } else {
                    replicaSetSeeds.add(new ServerAddress(host));
                }
            }
            return replicaSetSeeds;
        } catch (Exception e) {
            throw new BeanCreationException("Error while creating replicaSetAddresses", e);
        }
    }

}