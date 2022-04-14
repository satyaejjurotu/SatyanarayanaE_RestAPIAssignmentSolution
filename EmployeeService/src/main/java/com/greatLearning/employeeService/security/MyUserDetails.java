package com.greatLearning.employeeService.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.mapping.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.greatLearning.employeeService.entity.Role;
import com.greatLearning.employeeService.entity.User;

public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {
	private User user;

	public MyUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = user.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
