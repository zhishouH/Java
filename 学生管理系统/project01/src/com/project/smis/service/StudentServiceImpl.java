package com.project.smis.service;
import java.util.Collection;
import java.util.Map;
import com.project.smis.dao.IStudentDAO;
import com.project.smis.dao.impl.StudentDAOImpl;
import com.project.smis.domain.Student;
import com.project.smis.util.StringUtil;

public class StudentServiceImpl {
	IStudentDAO student = new StudentDAOImpl();
	public void add(String str){
		String[] stuArray = str.split(";");
		Student stu = new Student(null,stuArray[0]
				,Integer.valueOf(stuArray[1]),stuArray[2]);
		student.add(stu);
	}
	public void update(String str){
		String[] stuArray = str.split(";");
		Student stu = new Student(Long.valueOf(stuArray[0]),stuArray[1]
				,Integer.valueOf(stuArray[2]),stuArray[3]);
		student.update(stu);
	}
	public void delete(String strId){
		if(StringUtil.haslength(strId))
			student.delete(Long.valueOf(strId));
	}
	public void showAllStudent(){
		Map<Long,Student> studentMap = student.select();
		Collection<Student> stus = studentMap.values();
		System.out.println("学号        姓名        年龄        性别        ");
		System.out.println("=======================");
		for (Student stu : stus) {
			System.out.println(stuToString(stu));
		}
	}
	
	private String stuToString(Student stu){
		return toTenChar(String.valueOf(stu.getId())) 
				+ toTenChar(stu.getName()) 
				+ toTenChar(String.valueOf(stu.getAge()))
				+ toTenChar(stu.getGender());
	}
	private String toTenChar(String str){
		for(int i = 0 ; i < 20-str.length() ; i++){
			str += "  ";
		}
		return str;
	}

}
