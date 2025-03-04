package com.springboot.bankingapp.service.impl;

import com.springboot.bankingapp.dto.BankResponse;
import com.springboot.bankingapp.dto.UserRequest;
import com.springboot.bankingapp.entity.User;

//esta clase implementa los mismos métodos que la interfaz UserService
public class UserServiceImpl implements UserService {
    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**al crear una cuenta, se guarda un nuevo usuario con sus respectivos datos en la db,
         la entidad User representa los campos en la base de datos
        **/

        User newUser = User.builder()
                .fistName(userRequest.getFistName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber()
                .build();
    }
}
