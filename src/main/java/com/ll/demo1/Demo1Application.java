package com.ll.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Demo1Application {

	@GetMapping("/")
	@ResponseBody
	public String showWorld() {
		return "안녕하세요.";
	}


	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}


}
