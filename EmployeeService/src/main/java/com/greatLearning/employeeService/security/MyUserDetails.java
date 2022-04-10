package com.greatLearning.employeeService.security;

import java.util.ArrayList;

import org.hibernate.mapping.Set;
import com.greatLearning.employeeService.entity.Role;
import com.greatLearning.employeeService.entity.User;

import antlr.collections.List;

public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {
	private User user;

	public MyUserDetails(User user) {
		this.user = user;
	}

@Override
public Collection‹? extends GrantedAuthority> getAuthorities() {
List‹Role› roles = user.getRoles();
List‹SimpleGrantedAuthority› authorities = new ArrayList<>();
for (Role role : roles) {
authorities.add(new SimpleGrantedAuthority(role.getName()));
}
return authorities;
}

@Override
public String getPassword() {
return user.getPassword();
}
