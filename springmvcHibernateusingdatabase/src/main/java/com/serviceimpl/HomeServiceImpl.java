package com.serviceimpl;

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

}
