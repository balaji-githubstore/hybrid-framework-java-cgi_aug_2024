package com.cgi.javabasics2;

import com.cgi.javabasics.Student;

public class StudentRunner {

	public static void main(String[] args) {


		Student.schoolName = "Global";
		Student.schoolLocation = "Chennai";

		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		Student stu4= Student.getStudentInstance();
		
		stu4.displayStudentDetail();

		stu1.studentId = 101;
		stu1.studentName = "John";
		stu1.percentage = 88;

		stu2.studentId = 102;
		stu2.studentName = "Saul";
		stu2.percentage = 68;

		stu2.displayStudentDetail();

		Student.printAuthorName();

		double res = Math.sqrt(64);
		System.out.println(res);
		
		double res1=Student.areaOfCirlce(8);
		System.out.println(res1);
		
		
		Student.printId(stu1);
	}

}
