package com.preparationzone.accounts.service;

import com.preparationzone.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
