package org.fabrique.plantuml;

import org.fabrique.plantuml.domain.AccountNumber;
import org.fabrique.plantuml.domain.BankAccount;
import org.javamoney.moneta.Money;
import org.springframework.stereotype.Service;

/**
 * Service orchestration for BankAccount operations.
 */
@Service
public class BankAccountService implements BankAccountServicePort {

	private final BankAccountRepositoryPort accountRepository;

	public BankAccountService(final BankAccountRepositoryPort accountRepository) {
		this.accountRepository = accountRepository;
	}

	/**
	 * Find Bank Account from repository
	 *
	 * @param iban
	 *            Bank account identifier
	 * @return the banc Acount if found else throw AccountNotFoundException
	 */
	private BankAccount findAccount(final AccountNumber iban) {
		return accountRepository.findByAccountNumber(iban).get();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.acmebank.demo.bank.account.app.BankAccountServicePort#withdraw(com.
	 * acmebank.demo.bank.account.app.domain.vo.AccountNumber,
	 * org.javamoney.moneta.Money)
	 */
	@Override
	public void withdraw(final AccountNumber iban, final Money amount) {
		final BankAccount account = findAccount(iban);

		if (account != null) {
			account.debit(amount);
			accountRepository.save(account);
		}
	}
}