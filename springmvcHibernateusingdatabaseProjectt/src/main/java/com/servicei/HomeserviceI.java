package com.servicei;

import java.util.List;

import com.model.Student;

public interface HomeserviceI {

	public void savestudent(Student s);

	public List<Student> getStudents();
	public void deletestudent(int rollno);

	public List<Student> logincheck(String username, String password);

	public Student editstudent(int rollno);

	public void updatestudent(Student s);
	
	

	 

}
