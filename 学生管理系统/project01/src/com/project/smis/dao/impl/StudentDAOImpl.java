package com.project.smis.dao.impl;

import java.util.HashMap;
import java.util.Map;
import com.project.smis.dao.IStudentDAO;
import com.project.smis.domain.Student;

public class StudentDAOImpl implements IStudentDAO {

	private Map<Long,Student> studentMap = new HashMap<>();
	private Long id = 1L;
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		student.setId(id);
		studentMap.put(id,student);
		id++;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentMap.put(student.getId(), student);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		studentMap.remove(id);
	}

	@Override
	public Map<Long, Student> select() {
		// TODO Auto-generated method stub
		return studentMap;
	}

}
