package com.home.students.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.home.students.domain.Student;

@Service
public interface StudentService {

	public Student addStudent(Student student);

	public Map<Integer, Student> findAll();

	public Student findById(Integer id);

	public Student updateStudentById(Integer id, Student student);

	public boolean deleteStudent(Integer id);
}
