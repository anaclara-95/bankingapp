package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.BankResponse;
import com.springboot.bankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
