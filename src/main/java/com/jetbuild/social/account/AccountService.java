package com.jetbuild.social.account;

import com.jetbuild.social.model.Account;
import java.util.List;

public interface AccountService {
    public Account authenticate(Account account);

    public Account createAccount(Account account);

    public List<Account> findAccounts(String username);

    public Account addFollowing(String username);
}
