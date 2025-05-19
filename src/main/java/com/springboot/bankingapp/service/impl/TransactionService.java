package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.TransactionDto;
import org.springframework.stereotype.Service;

@Service

public interface TransactionService {
void saveTransaction(TransactionDto transactionDto);
}
