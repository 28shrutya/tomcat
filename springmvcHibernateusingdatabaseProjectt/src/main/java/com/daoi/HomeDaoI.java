package com.daoi;

import java.util.List;

import com.model.Student;

public interface HomeDaoI {

	public void savestudent(Student s);

	public List<Student> getStudents();

	public List<Student> logincheck(String username, String password);
	public void deletestudent(int rollno);

	public Student editstudent(int rollno);

	public void updatestudent(Student s);
	

}
  