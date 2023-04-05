package com.daoimpl;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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


@Override
public List<Student> getStudents() {
	Session session = sf.openSession();
	return    session.createQuery("from Student").getResultList();
	      
}


@Override
public List<Student> logincheck(String username, String password) {
	Session session= sf.openSession();
	Query<Student>query=session.createQuery("from Student where username=? and password=?");
	query.setParameter(0,username);
	query.setParameter(1,password);
	
			
	return query.getResultList();
}


@Override
public void deletestudent(int rollno) {
	Session session = sf.openSession();
	Query<Student>query=session.createQuery("delete from Student where rollno=?");
	query.setParameter(0,rollno);
	Transaction tx=session.beginTransaction();
	query.executeUpdate();
	tx.commit();
			
}


@Override
public Student editstudent(int rollno) {
	Session session= sf.openSession();
	      Student s  =  session.get(Student.class, rollno);
	return s;
}


@Override
public void updatestudent(Student s) {
	Session session= sf.openSession();
	session.update(s);
	session.beginTransaction().commit();
}



}


