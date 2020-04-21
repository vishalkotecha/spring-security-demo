package com.vishalkotecha.ssdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishalkotecha.ssdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String username);

}
