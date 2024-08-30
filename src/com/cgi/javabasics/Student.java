package com.cgi.javabasics;

public class Student {

	public int studentId;
	public String studentName;
	public double percentage;
	public static String schoolName;
	public static String schoolLocation;
	
	public Student()
	{
		System.out.println("object created");
	}

	// non-static method

	public void displayStudentDetail() {
		System.out.println(studentId);
		System.out.println(studentName);
	}

	public static void printAuthorName() {
		System.out.println("Balaji Dinakaran");
	}

	public static double areaOfCirlce(double radius) {
		return Math.PI * radius * radius;
	}

	public static Student getStudentInstance()
	{
		Student s=new Student();
		return s;
	}
	
	public static void printId(Student stu)
	{
		System.out.println(stu.studentId);
	}
}




