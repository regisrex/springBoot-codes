package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.utils.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(path="/")
public class DemoApplication {

	@GetMapping(name = "/")
	Response hello(){
		return new Response("Hello World", true , 200 , null);
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
