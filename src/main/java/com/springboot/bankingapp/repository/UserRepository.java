package com.springboot.bankingapp.repository;

import com.springboot.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//relaciona la interfaz UserRepository con la entity User (cuya primary key es del tipo Long)
public interface UserRepository extends JpaRepository<User,Long> {
}
