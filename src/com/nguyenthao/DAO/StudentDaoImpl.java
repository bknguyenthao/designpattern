package com.nguyenthao.DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 10);
		Student student2 = new Student("John", 11);
		Student student3 = new Student("Thao", 12);
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}

	@Override
	public void deleteStudent(Student student) {
		for (Student stud : students) {
			if (stud.getRollNo() == student.getRollNo()) {
				students.remove(students.indexOf(stud));
			}
		}
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		for (Student student : students) {
			if (student.getRollNo() == rollNo) {
				return student;
			}
		}
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		for (Student stud : students) {
			if (stud.getRollNo() == student.getRollNo()) {
				stud.setName(student.getName());
			}
		}
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	@Override
	public void printStudent(Student student) {
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

	}

	@Override
	public void printAllStudent(List<Student> students) {
		for (Student stud : students) {
			printStudent(stud);
		}

	}

}
