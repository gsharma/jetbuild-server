package com.jetbuild.social.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private String id;
    private AccountStatusCode code;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date timestamp = new Date();
    private List<Account> following = new ArrayList<Account>();

    // only for injection
    public Account() {
    }

    public static enum AccountStatusCode {
        FAILURE(0), FAILURE_IDENTITY_NOT_FOUND(-1), FAILURE_CREDENTIAL_INVALID(-2), SUCCESS(1);

        private int code;

        private AccountStatusCode(int code) {
            this.code = code;
        }

        public int code() {
            return code;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountStatusCode getCode() {
        return code;
    }

    public void setCode(AccountStatusCode code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Account> getFollowing() {
        return following;
    }

    public void setFollowing(List<Account> following) {
        this.following = following;
    }

    public boolean isValid() {
        return code.code() > 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Account [id=").append(id).append(", code=").append(code).append(", username=").append(username)
                .append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", email=")
                .append(email).append(", password=").append(password).append(", timestamp=").append(timestamp)
                .append(", following=").append(following).append("]");
        return builder.toString();
    }

}
