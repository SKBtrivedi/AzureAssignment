package com.nagarro.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AzureAssignmentApplication {
	
	@Autowired
	private StudentRepo repo;

	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return repo.findAll();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return repo.save(student);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentApplication.class, args);
	}

}
