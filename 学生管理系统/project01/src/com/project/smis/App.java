package com.project.smis;

import java.util.Scanner;

import com.project.smis.service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ����ѧ������ϵͳ");
		StudentServiceImpl studentService = new StudentServiceImpl();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("�����������1:���ѧ��2:�޸�ѧ����Ϣ3:ɾ��ѧ����Ϣ4:�鿴ѧ��5:�˳�ϵͳ");
			String number = scanner.nextLine();
			switch(number){
				case "1": 
					System.out.println("�밴��ʽ����ѧ����Ϣ��(����;����;�Ա�)");
					String str = scanner.nextLine();
					studentService.add(str);
					studentService.showAllStudent();
					break;
				case "2": 
					System.out.println("�밴��ʽ����ѧ����Ϣ��(���;����;����;�Ա�)");
					String str2 = scanner.nextLine();
					studentService.update(str2);
					studentService.showAllStudent();
					break;
				case "3": 
					System.out.println("������Ҫɾ����ѧ����ţ�");
					String str3 = scanner.nextLine();
					studentService.delete(str3);
					studentService.showAllStudent();
					break;
				case "4": 
					studentService.showAllStudent();
					break;
				case "5":
					System.out.println("�˳��ɹ�");
					System.exit(0);
					break;
				default:
					studentService.showAllStudent();
			}
		}
	}

}
