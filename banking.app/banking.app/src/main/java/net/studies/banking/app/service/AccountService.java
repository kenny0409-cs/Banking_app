package net.studies.banking.app.service;

import net.studies.banking.app.dto.AccountDto;
import net.studies.banking.app.dto.TransactionDto;
import net.studies.banking.app.dto.TransferFundDto;

import java.util.List;
public interface AccountService {
    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long accountId);
}
