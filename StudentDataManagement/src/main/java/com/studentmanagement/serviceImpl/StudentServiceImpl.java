package com.studentmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.dao.StudentRepository;
import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
	   Student addedstudent=  studentRepository.save(student);	
		return addedstudent;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Optional<Student> getStudentById(Integer id) {
		Optional<Student> studentbyid= studentRepository.findById(id);
		return studentbyid;
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> studentlist= studentRepository.findAll();
		return studentlist;
	}

	@Override
	public Student updateStudentById(Student student) {
		
		return studentRepository.save(student);
	}

}
