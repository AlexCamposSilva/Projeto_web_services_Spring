package com.aulaspring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
