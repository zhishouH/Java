package com.project.smis.test;

import com.project.smis.service.StudentServiceImpl;

public class StudentServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServiceImpl student = new StudentServiceImpl();
		student.showAllStudent();
		student.add("yy;18;Ů");
		student.showAllStudent();
		student.delete("1");
		student.showAllStudent();
		student.update("1;xx;10;nan");
		student.showAllStudent();

	}

}
