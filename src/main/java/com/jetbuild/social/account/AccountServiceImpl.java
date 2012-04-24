package com.jetbuild.social.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jetbuild.social.model.Account;

@Component("account-service")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDAO accountDAO;

    @Override
    public Account authenticate(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account createAccount(Account account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Account> findAccounts(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account addFollowing(String username) {
        // TODO Auto-generated method stub
        return null;
    }
}
