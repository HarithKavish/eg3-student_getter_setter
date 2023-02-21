package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/")
	public String homepage() {
		return "Welcome to Student List";
	}
	@GetMapping("/list")
	public List<StudentResponse> getList(){
		List<StudentResponse> detailsList=new ArrayList<>();
		detailsList.add(new StudentResponse(1,"XXXX",23));
		detailsList.add(new StudentResponse(2,"YYYY",3));
		detailsList.add(new StudentResponse(3,"ZZZZ",25));
		return detailsList;
	}
}