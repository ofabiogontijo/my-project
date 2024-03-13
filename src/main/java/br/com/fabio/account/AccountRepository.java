package br.com.fabio.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

interface AccountRepository extends JpaRepository<Account, String>, JpaSpecificationExecutor<Account> {
}
