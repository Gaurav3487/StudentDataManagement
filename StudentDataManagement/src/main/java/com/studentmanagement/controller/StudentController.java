package com.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addstudents")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student addstudent=studentService.addStudent(student);
		return ResponseEntity.ok().body(addstudent);
	}
	
	@DeleteMapping("/deletestudents/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id) {
		studentService.deleteStudentById(id);
	}
	
	@GetMapping("/studentlist")
	public ResponseEntity<List<Student>> getStudentList(){
	List<Student> studentlist=studentService.getStudentList();	
	return ResponseEntity.ok().body(studentlist);
	}
	
	@GetMapping("/getstudentbyid/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") Integer id){
		Optional<Student> student=studentService.getStudentById(id);
		return ResponseEntity.ok().body(student);
	}

	@PutMapping("/updatestudents")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
	Student updatestudents	=studentService.updateStudentById(student);
		return ResponseEntity.ok().body(updatestudents);
	}
}
