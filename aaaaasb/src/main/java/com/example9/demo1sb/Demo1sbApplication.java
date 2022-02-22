package com.example9.demo1sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example9","org.xyz"})
public class Demo1sbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1sbApplication.class, args);
	}

}
