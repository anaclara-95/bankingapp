package com.springboot.bankingapp.controller;

import com.springboot.bankingapp.dto.BankResponse;
import com.springboot.bankingapp.dto.EnquiryRequest;
import com.springboot.bankingapp.dto.UserRequest;
import com.springboot.bankingapp.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
     public BankResponse createAccount(@RequestBody UserRequest userRequest) {
         return userService.createAccount(userRequest);
     }

     @GetMapping("balanceEnquiry")
     public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
     }

     @GetMapping ("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
     }

}
