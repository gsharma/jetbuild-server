package com.jetbuild.social.account;

import com.jetbuild.social.model.Account;
import java.util.List;

// CRUD ops for Account
public interface AccountDAO {
    public Account createAccount(Account account);

    public Account retrieveAccountById(String accountId);

    public Account retrieveAccountByUsername(String username);
    
    public List<Account> retrieveAllAccountsByUsername(String username);

    public Account updateAccount(Account account);

    public void deleteAccount(Account account);

    public void deleteAccountById(String accountId);
}
