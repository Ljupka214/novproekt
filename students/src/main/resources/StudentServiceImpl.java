package com.home.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	static List<Student> students = new ArrayList<Student>();
	public List<Student> findAll() {
		return students;
	}
	
	public Student findById(Integer id) {
		return id == null ? null : students.get(id);
	}
	
	public Student updateStudentById(Integer id, Student student) {
		students.
		return student;
	}

}
