package tykfa90.chainedrandomizer.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tykfa90.chainedrandomizer.model.Account;
import tykfa90.chainedrandomizer.respository.AccountRepository;

@Service
public class AccountService implements UserDetailsService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }
}
