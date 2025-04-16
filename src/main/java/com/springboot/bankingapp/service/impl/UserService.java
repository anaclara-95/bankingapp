package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.*;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request); //sólo devuelve un string

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);

    BankResponse transfer(TransferRequest request);


}
