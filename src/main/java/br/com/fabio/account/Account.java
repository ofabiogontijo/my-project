package br.com.fabio.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import static br.com.fabio.core.gontijoIdGenerator.generateId;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@Entity
@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PRIVATE)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String email;

    private String phone;

    private String document;

    static Account of(AccountInput input) {
        return new Account(generateId(), input.getName(), input.getEmail(), input.getPhone(), input.getDocument());
    }

}