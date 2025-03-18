package com.springboot.bankingapp.repository;

import com.springboot.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//relaciona la interfaz UserRepository con la entity User (cuya primary key es del tipo Long)

public interface UserRepository extends JpaRepository<User,Long> {

    //chequear si el usuario ya tiene una cuenta (usando el email)

    Boolean existsByEmail(String email);

    Boolean existsByAccountNumber(String accountNumber);

}
