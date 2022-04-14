package com.greatLearning.employeeService.service;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatLearning.employeeService.entity.Employee;
import com.greatLearning.employeeService.entity.Role;
import com.greatLearning.employeeService.entity.User;
@SpringBootApplication(scanBasePackages = {"com.greatLearning.employeeService.controller","com.greatLearning.employeeService.dao","com.greatLearning.employeeService.entity","com.greatLearning.employeeService.security","com.greatLearning.employeeService.service"})
//@ComponentScan ("com.greatLearning. employeeService”)
public interface EmployeeService{
	public List<Employee> listEmployee();
	public Employee findById(int theId);
	
public static void main(String[] args) {
SpringApplication.run(EmployeeService.class, args);
}
public User saveUser(User user);
public Role saveRole(Role role);
public List<Employee> findAll();
public void save(Employee theEmployee);
public void deleteById(int employeeId);
public List<Employee> searchByFirstName(String firstName);
public List<Employee> sortByFirstName(String order);

}
