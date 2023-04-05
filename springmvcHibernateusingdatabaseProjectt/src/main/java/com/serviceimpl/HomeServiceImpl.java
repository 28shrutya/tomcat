package com.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daoi.HomeDaoI;
import com.model.Student;
import com.servicei.HomeserviceI;


@Service
public class HomeServiceImpl implements HomeserviceI {
	

	@Autowired
	HomeDaoI hdi;
	
	@Override
public void savestudent(Student s) {
		hdi.savestudent(s);
	}

	@Override
public List<Student> getStudents() {
		List<Student> list= hdi.getStudents();
		
		return list;
	}

	@Override
public List<Student> logincheck(String username, String password) {
		return hdi.logincheck(username,password);
		
	}

	@Override
	public void deletestudent(int rollno) {
		hdi.deletestudent(rollno);
		
		
	}

	@Override
	public Student editstudent(int rollno) {
		
		return hdi.editstudent(rollno);
	
	}

	@Override
	public void updatestudent(Student s) {
		hdi.updatestudent(s);

	

}
}

