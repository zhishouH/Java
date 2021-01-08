package com.project.smis;

import java.util.Scanner;

import com.project.smis.service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎进入学生管理系统");
		StudentServiceImpl studentService = new StudentServiceImpl();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入操作：1:添加学生2:修改学生信息3:删除学生信息4:查看学生5:退出系统");
			String number = scanner.nextLine();
			switch(number){
				case "1": 
					System.out.println("请按格式输入学生信息：(姓名;年龄;性别)");
					String str = scanner.nextLine();
					studentService.add(str);
					studentService.showAllStudent();
					break;
				case "2": 
					System.out.println("请按格式输入学生信息：(编号;姓名;年龄;性别)");
					String str2 = scanner.nextLine();
					studentService.update(str2);
					studentService.showAllStudent();
					break;
				case "3": 
					System.out.println("请输入要删除的学生编号：");
					String str3 = scanner.nextLine();
					studentService.delete(str3);
					studentService.showAllStudent();
					break;
				case "4": 
					studentService.showAllStudent();
					break;
				case "5":
					System.out.println("退出成功");
					System.exit(0);
					break;
				default:
					studentService.showAllStudent();
			}
		}
	}

}
