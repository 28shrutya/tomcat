package com.daoimpl;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.daoi.HomeDaoI;
import com.model.Student;

@Repository
public class HomeDaoimpl implements HomeDaoI {
	
	@Autowired
  SessionFactory sf;
	

 @Override
 public void savestudent(Student s) {
	 
		Session session =sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		
		
	}

}
