package com.home.students.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.students.domain.Student;
import com.home.students.exception.StudentNotFoundException;
import com.home.students.service.StudentServiceImpl;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	@GetMapping("/{id}")
	public ResponseEntity<Student> findById(@PathVariable Integer id) {
		Student student = studentService.findById(id);
		HttpStatus status = student != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<Student>(student, status);
	}

	@GetMapping
	public  Map<Integer, Student> findAll() {
		return studentService.findAll();
	}

	@PostMapping
	public void postStudent(@RequestBody StudentDto studentDto) {
		Student student = new Student();
		student.setFirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setEmail(studentDto.getEmail());
		studentService.addStudent(student);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping(value = "/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		studentService.updateStudentById(id, student);
	}

}
