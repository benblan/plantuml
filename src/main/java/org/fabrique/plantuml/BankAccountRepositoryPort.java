package org.fabrique.plantuml;

import java.util.Optional;

import org.fabrique.plantuml.domain.AccountNumber;
import org.fabrique.plantuml.domain.BankAccount;

/**
 * Port for BankAccount Repository
 */
public interface BankAccountRepositoryPort {

	public BankAccount save(BankAccount account);

	public Optional<BankAccount> findByAccountNumber(final AccountNumber accountNumber);

	public BankAccount findOne(Long id);

}
