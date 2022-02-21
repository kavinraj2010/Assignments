package org.student;

import org.college.College;

public class Student extends College{
	public void studentName() {
		System.out.println("Student Name is: Kavinraj S");
	}
	public void studentDept() {
		System.out.println("Student Department is : Mechanical Enginering");
	}
	public void studentId() {
		System.out.println("Student Id is: 171016");
	}
	
	public static void main(String[] args) {
		Student get=new Student();
		get.collegeName();
		get.collegeCode();
		get.collegeRank();
		get.deptName();
		get.studentName();
		get.studentId();
		get.studentDept();
	}
}
