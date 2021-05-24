package com.extremity.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.extremity.dao.DaoInterface;
import com.extremity.model.User;
import com.extremity.service.Iservice;

@Service
public class ServiceImpl implements Iservice{

	@Autowired
	DaoInterface dao;

	@Override
	public void addStudent(Student s) {
		dao.save(s);
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getstudent(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getUpdatedStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int loginCheck(Student stu) {

		String uname=stu.getUsername();
		String pass=stu.getPassword();
		Student u1=dao.findAllByPassword(pass);
		
		Student u=dao.findAllByUnameAndPassword(uname,pass);
		if(u!=null)
		{
			return 1;
		}
		return 0;
		
	}
    
    
}
