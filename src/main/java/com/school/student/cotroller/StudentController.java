package com.school.student.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Value("${app.message}")
	private String message;

	@Value("${app.value}")
	private String value;

	@GetMapping("/message")
	public String getMsg() {
		return message+" - "+value;
	}

}
