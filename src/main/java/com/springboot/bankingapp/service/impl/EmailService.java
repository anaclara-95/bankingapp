package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
