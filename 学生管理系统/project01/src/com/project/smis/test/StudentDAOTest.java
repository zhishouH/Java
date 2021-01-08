package com.project.smis.test;
import com.project.smis.dao.IStudentDAO;
import com.project.smis.dao.impl.StudentDAOImpl;
import com.project.smis.domain.Student;

public class StudentDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStudentDAO student = new StudentDAOImpl();
		student.add(new Student(null,"����",23,"��"));
		student.add(new Student(null,"����",22,"Ů"));
		System.out.println(student.select());
		
		student.update(new Student(1L,"xx",18,"��"));
		System.out.println(student.select());
		
		student.delete(1L);
		System.out.println(student.select());
	}

}
