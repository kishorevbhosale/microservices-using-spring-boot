package com.preparationzone.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "name can't be null or empty")
    @Size(min = 5, max = 30, message = "The length of customer name should be between 5 to 30")
    private String name;

    @NotEmpty(message = "email can't be null or empty")
    @Email(message = "Email address should be valid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number should be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
