package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.BankResponse;
import com.springboot.bankingapp.dto.CreditDebitRequest;
import com.springboot.bankingapp.dto.EnquiryRequest;
import com.springboot.bankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request); //sólo devuelve un string

    BankResponse creditAccount(CreditDebitRequest request);

}
