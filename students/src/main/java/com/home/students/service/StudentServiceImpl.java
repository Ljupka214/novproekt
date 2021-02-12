package com.home.students.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.students.domain.Student;
import com.home.students.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	static Map<Integer, Student> students = new HashMap<Integer, Student>();

	public Student addStudent(Student student) {
		students.put(student.getId(), student);
		return student;
	}

	public Map<Integer, Student> findAll() {
		return students;
	}

	public Student findById(Integer id) {
		return id == null ? null : students.get(id);
	}

	public Student updateStudentById(Integer id, Student student) {
		students.put(id, student);
		return student;
	}

	public boolean deleteStudent(Integer id) {
		Student student = students.remove(id);
		return student != null ? true : false;
	}

}
