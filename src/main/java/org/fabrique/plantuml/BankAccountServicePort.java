package org.fabrique.plantuml;

import org.fabrique.plantuml.domain.AccountNumber;
import org.fabrique.plantuml.domain.exception.InsufficientBalanceException;
import org.javamoney.moneta.Money;

public interface BankAccountServicePort {

	/**
	 * Withdraw money operation.
	 *
	 * @param iban
	 *            Bank account identifier
	 * @param amount
	 *            Money amount to withdraw
	 * @throws InsufficientBalanceException
	 */
	void withdraw(AccountNumber iban, Money amount) throws InsufficientBalanceException;

}