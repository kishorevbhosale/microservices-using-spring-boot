package com.preparationzone.accounts.mapper;

import com.preparationzone.accounts.dto.AccountsDto;
import com.preparationzone.accounts.entity.Accounts;

public class AccountMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto){
        accountsDto.setAccountNumber(accountsDto.getAccountNumber());
        accountsDto.setAccountType(accountsDto.getAccountType());
        accountsDto.setBranchAddress(accountsDto.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts){
        accounts.setAccountNumber(accounts.getAccountNumber());
        accounts.setAccountType(accounts.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}
