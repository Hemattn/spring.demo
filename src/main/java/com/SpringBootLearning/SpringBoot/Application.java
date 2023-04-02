package com.SpringBootLearning.SpringBoot;

import com.SpringBootLearning.SpringBoot.Question3.Employee;
import com.SpringBootLearning.SpringBoot.Question3.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	EmployeeRepo employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee(1L, "hema", "abc.com"));
		employeeRepository.save(new Employee(2L, "pankaj", "abc.com"));
		employeeRepository.save(new Employee(3L, "patidar", "abc.com"));
	}

}
