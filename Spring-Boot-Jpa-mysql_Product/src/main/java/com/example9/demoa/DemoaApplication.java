package com.example9.demoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example9.demoa","com.example9.demo.controller"})
@SpringBootApplication
public class DemoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoaApplication.class, args);
	}

}
