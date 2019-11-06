package tykfa90.chainedrandomizer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tykfa90.chainedrandomizer.model.Account;
import tykfa90.chainedrandomizer.service.AccountService;

@RestController
@RequestMapping(path = "/user")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //Account Creation
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    //AccountDisplay
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Account displayAccount(@RequestBody String userName) {
        return (Account) accountService.loadUserByUsername(userName);
    }
}
