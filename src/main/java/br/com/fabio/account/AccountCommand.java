package br.com.fabio.account;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountCommand {

    private final AccountRepository repository;

    public Account create(AccountInput input) {
        return repository.save(Account.of(input));
    }

}
