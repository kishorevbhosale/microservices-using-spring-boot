package com.preparationzone.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number should not be empty")
    @Pattern(regexp = "(^$[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "AccountType should not be null or empty")
    private String accountType;

    @NotEmpty(message = "BranchAddress should not be null or empty")
    private String branchAddress;
}
