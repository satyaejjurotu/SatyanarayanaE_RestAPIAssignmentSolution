package com.greatLearning.employeeService.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
 @Query("SELECT u FROM User u WHERE u.username = ？1")
public com.greatLearning.employeeService.entity.User getUserByUsername (String username);

public com.greatLearning.employeeService.entity.User save(com.greatLearning.employeeService.entity.User user);
}
