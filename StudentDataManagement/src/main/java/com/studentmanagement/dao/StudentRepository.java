package com.studentmanagement.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
