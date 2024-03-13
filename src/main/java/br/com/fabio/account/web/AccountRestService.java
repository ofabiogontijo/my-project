package br.com.fabio.account.web;

import br.com.fabio.account.Account;
import br.com.fabio.account.AccountCommand;
import br.com.fabio.account.AccountInput;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
class AccountRestService {

    private final AccountCommand command;

    @PostMapping
    @ResponseStatus(CREATED)
    public Account create(@RequestBody AccountInput input) {
        return command.create(input);
    }

}
