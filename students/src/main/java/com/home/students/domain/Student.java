package com.home.students.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class Student {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

}
