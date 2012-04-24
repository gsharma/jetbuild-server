package com.jetbuild.social;

import java.io.File;

import org.junit.runner.RunWith;
import org.mortbay.jetty.Server;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.jersey.api.client.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/META-INF/services-test.xml", "/META-INF/shiro.xml" })
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ActiveProfiles({ "mongo", "jetbuild.test" })
public abstract class BaseTest {
    private static Server server;
    public static final String testUsername = "admin";
    private static final String testPassword = "admin";
    public static Client clientHandle;
    private static File webAppDirectory;
}