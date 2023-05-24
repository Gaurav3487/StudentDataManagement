package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.studentmanagement.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public void deleteStudentById(Integer id);
	
	public Optional<Student> getStudentById(Integer id);
	
	public List<Student> getStudentList();

	public Student updateStudentById(Student student);
}
