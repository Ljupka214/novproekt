package com.home.students.service;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	public Student insert(Student student);

	public List<Student> findAll();

	public Student findById(Integer id);

	public Student updateStudentById(Integer id, Student student);

	public boolean deleteStudent(Integer id);
}
