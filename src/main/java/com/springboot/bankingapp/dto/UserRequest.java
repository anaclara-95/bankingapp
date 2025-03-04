package com.springboot.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


//el dto se usa para no exponer todos los datos de la clase User, separa los objetos de la entity
//recibe los datos del usuario que se van a guardar en la base de datos, pero no se ocupa de los campos de la base de datos como la entidad user
public class UserRequest {
    private String fistName;
    private String lastName;
    private String otherName;
    private String gender;
    private String address;
    private String stateOfOrigin;
    private String email;
    private String phoneNumber;
    private String alternativePhoneNumber;
    private String status;
}
